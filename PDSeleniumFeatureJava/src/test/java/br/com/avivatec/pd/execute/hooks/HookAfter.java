package br.com.avivatec.pd.execute.hooks;

import static br.com.avivatec.pd.core.DriverFactory.killDriver;
import static br.com.avivatec.pd.core.utils.Utilitarios.formatter;

import java.io.File;
import java.io.FileOutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.Image;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfWriter;

import br.com.avivatec.pd.core.BasePage;
import br.com.avivatec.pd.core.Properties;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;

public class HookAfter extends BasePage{
	
	@After(order = 1)
	public void screenshot(Scenario scenario) {
		
		String nome = String.format("%s_%s", scenario.getName().replace(" ", "_"), formatter()); 
		String evidencia = (!scenario.isFailed()) ? evidencia = "sucesso" : "erro";
		String screenshotPath = "src//test//resources//screenshots//";
		String pdfPath = "src//test//resources//evidencias//";

		interactions.screenshotEvidence("Evidencia Final - O teste deu " + evidencia);
		
		File screenshotFiles = new File(screenshotPath);
		File[] screenshotList = screenshotFiles.listFiles();
		Rectangle pdfSize = new Rectangle(1600, 900);
		
		 try {
			  Document document = new Document();
		      FileOutputStream fos = new FileOutputStream(pdfPath+nome+"_"+evidencia+".pdf");
		      PdfWriter writer = PdfWriter.getInstance(document, fos);
		      document.setPageSize(pdfSize);
		      document.open();
		      for(int i = 0; i < screenshotList.length; i++) {
		    	  Image imagemx = Image.getInstance(screenshotList[i].toString());
		    	  imagemx.scaleToFit(pdfSize.getWidth(), pdfSize.getHeight());
		    	  imagemx.setAlignment(imagemx.MIDDLE);
		    	  document.add(imagemx);
		      }	
		      document.close();
		    }
		    catch (Exception e) {
		      e.printStackTrace();
		    }
		 
		 for(int i = 0; i < screenshotList.length; i++) {
			 screenshotList[i].delete();
		 }
	}

	@After(order = 0)
	public void finalizar() {
		if (Properties.FECHAR_BROWSER)
			killDriver();
	}
}
