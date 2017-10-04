package br.com.caelum.fj91.banco.integracao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ListaContasPage {

	private WebDriver driver;

	public ListaContasPage(WebDriver driver) {
		this.driver = driver;
	}

	public ListaContasPage visita() {
		driver.navigate().to("http://localhost:8080/banco2/conta/lista");
		return this;
	}

	public boolean existeNaLista(String nome, String numero) {
		WebElement elementoNome = driver.findElement(By.xpath("//td[text()='" + nome + "']"));
		WebElement elementoNumero = driver.findElement(By.xpath("//td[text()='" + numero + "']"));
		return elementoNome != null && elementoNumero != null;
	}

}
