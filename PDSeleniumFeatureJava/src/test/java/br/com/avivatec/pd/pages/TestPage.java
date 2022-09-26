package br.com.avivatec.pd.pages;

import br.com.avivatec.pd.core.BasePage;
import org.openqa.selenium.By;

public class TestPage extends BasePage {

	// Elementos privados usuario

	    private By botãoEntrarBackoffice = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div/div/div[1]/div[3]/form/div[3]/div/button");
		private By controleDeAcesso = By.xpath("//*[@id=\"root\"]/div/nav/div/div/div/div/ul[3]/div/div[2]/p");
		private By usuarios = By.xpath("//*[@id=\"root\"]/div/nav/div/div/div/div/ul[3]/div[2]/div/div/div/a[2]/div[2]/p");
		private By buscarUsuarioBackoffice = By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div[1]/div/div");
		private By nomeDoUsuario = By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[1]");
		private By visualizar = By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/div/svg");
		private By editarUsuario = By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[6]/div/svg");
		private By inserirNomeDoUsuario = By.xpath("//*[@id=\"outlined-adornment-email-login\"]");
		private By inserirEmailDoUsuario = By.xpath("//*[@id=\"outlined-adornment-email-login\"]");
		private By perfilDeAcesso = By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/form/div[3]/div[1]/div[1]/div/div/svg");
		private By administrador = By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/form/div[3]/div[1]/div[2]/div/div/div/div/div/button[1]");
		private By ativo = By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/form/div[3]/div[2]/div[2]/span/span[1]/input");
		private By cancelarEdicaoDeUsuario = By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/form/div[4]/div[1]/div/button");
		private By cancelarEdicaoDeUsuarioNao = By.xpath("/html/body/div[2]/div[3]/div/div/button");
		private By cancelarEdicaoDeUsuarioSim = By.xpath("/html/body/div[2]/div[3]/div/button");
		private By validarTextoEdicaoDeUsuarioCancelar = By.xpath("/html/body/div[2]/div[3]/p");
		private By salvarEdicaoDeUsuarioNao = By.xpath("/html/body/div[2]/div[3]/div/div/button");
		private By salvarEdicaoDeUsuarioEditar = By.xpath("/html/body/div[2]/div[3]/div/button");
		private By validarTextoEdicaoDeUsuarioSalvar = By.xpath("/html/body/div[2]/div[3]/p");

	public void acessarSite() {
		interactions.url("https://187.33.9.125:10000/");
		interactions.wait(5000);
	}
	
	public void acessarOutroSite() {
		interactions.url("https://stackoverflow.com/");
		interactions.screenshotEvidence("Pagina StackOverflow");
	}
}
