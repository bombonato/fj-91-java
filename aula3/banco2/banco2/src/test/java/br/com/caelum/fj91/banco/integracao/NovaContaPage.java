package br.com.caelum.fj91.banco.integracao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NovaContaPage {

	private WebDriver driver;

	public NovaContaPage(WebDriver driver) {
		this.driver = driver;
	}

	public ContaCadastradaPage cadastraNovaContaCom(String nome, String cpf) {
		WebElement campoCliente = driver.findElement(By.name("cliente"));
		WebElement campoCpf = driver.findElement(By.name("cpf"));
		
		
		campoCliente.sendKeys(nome);
		campoCpf.sendKeys(cpf);
		
		campoCliente.submit();
		return new ContaCadastradaPage(driver);
	}

	public NovaContaPage visita() {
		driver.navigate().to("http://localhost:8080/banco2/conta/formulario");
		return this;
	}

}
