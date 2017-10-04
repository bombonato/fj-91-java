package br.com.caelum.fj91.teste;

import java.math.BigDecimal;
import java.util.Calendar;

import br.com.caelum.fj91.modelo.Conta;

public class Main {

	/**
	 * Use VM Arguments -javaagent:aspectjweaver.jar quando rodar
	 */
	public static void main(String[] args) {

		Conta conta = new Conta(12341, Calendar.getInstance());
	
		System.out.printf("Saldo da Conta: %.2f %n", conta.getSaldo());
		
		System.out.println("Sacando valor inválido.");
		
		/* saque inválido lançará uma exceção de negócio*/
		conta.saca(new BigDecimal("500"));
	}

}
