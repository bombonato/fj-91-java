package br.com.caelum.fj91.banco.integracao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContaCadastradaPage {

	private WebDriver driver;

	public ContaCadastradaPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean possuiSucessoNoTitulo() {
		String titulo = driver.findElement(By.tagName("h1")).getText();
		return titulo.contains("sucesso");
	}

	public String getNumeroDaContaCadastrada() {
		return extraiNumero(driver.findElement(By.tagName("h1")).getText());
	}
	
	private String extraiNumero(String titulo) {
		Matcher matcher = Pattern.compile("\\d+").matcher(titulo);
		if (matcher.find()) {
			return matcher.group();
		}
		throw new RuntimeException("Não achei número");
	}

	public ListaContasPage irParaListaContasPage() {
		return new ListaContasPage(driver).visita();
	}
	

}
