package br.com.caelum.fj91.banco.integracao;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CadastroDeContaTest {

	private static WebDriver driver;

	@BeforeClass
	public static void iniciaNavegador() {
		driver = new FirefoxDriver();//new HtmlUnitDriver();
	}
	
	@Test
	public void contaFoiCadastrada() {
		
		String nome = "Joaquim Manoel";
		String cpf = "123.456.789-10";
		
		//usando PageObject - todo uso do Selenium está encapsulado
		NovaContaPage novaContaPage = new NovaContaPage(driver);
		
		//cadastrando uma nova conta
		ContaCadastradaPage contaCadastradaPage = novaContaPage.visita().cadastraNovaContaCom(nome, cpf);
		Assert.assertTrue(contaCadastradaPage.possuiSucessoNoTitulo());
		
		String numero = contaCadastradaPage.getNumeroDaContaCadastrada();

		ListaContasPage listaContaPage = contaCadastradaPage.irParaListaContasPage();;
		Assert.assertTrue(listaContaPage.existeNaLista(nome, numero));
	}
	
	
	@AfterClass
	public static void desligaNavegador() {
		driver.quit();
	}
}
