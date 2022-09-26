package br.com.avivatec.pd.core;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.avivatec.pd.core.exceptions.InteracaoException;
import br.com.avivatec.pd.core.interacao.Interactions;

import static br.com.avivatec.pd.core.DriverFactory.getDriver;


/**
 * Uma classe base para todos os PageObjects.
 * 
 * @author Thyago Sasso
 *
 */
public abstract class BasePage {

	private static final Logger log = LoggerFactory.getLogger(BasePage.class.getSimpleName());
	
	private String button = "//span[text()=' %s ']";
	private By disabledLink = By.xpath("//a[@class='pdc-link ng-star-inserted disabled']");
	private By disabledButton = By.xpath("//button[@disabled]");
	private By campoPin = By.xpath("//input");
	private By link = By.xpath("//div[@class='web-container']//a");
	protected Interactions interactions;

	public BasePage() {
		interactions = new Interactions();
	}
		
	
}