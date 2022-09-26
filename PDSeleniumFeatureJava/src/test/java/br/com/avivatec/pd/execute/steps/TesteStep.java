package br.com.avivatec.pd.execute.steps;

import br.com.avivatec.pd.pages.TestPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;


public class TesteStep {
	
	TestPage testPage = new TestPage();

	@Dado("que eu acesse o site")
	public void que_eu_acesse_o_site() {
		testPage.acessarSite();
	}

	@Quando("insiro e-mail e senha")
	public void insiro_e_mail_e_senha() {

	}

	@Entao("clico em entrar")
	public void clico_em_entrar() {

	}

}
