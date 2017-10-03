package br.com.caelum.fj91.banco.modelo;

import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;

/**
 * Organiza as contas do banco por semestre de abertura
 */
//public class Contas extends HashSet<Conta> {
public class Contas {

	private int totalContasPrimeiroSemestre = 0;
	private int totalContasSegundoSemestre = 0;
	
	HashSet<Conta> contas = new HashSet<Conta>();
	
	//@Override
	public boolean add(Conta conta) {
		int mes = conta.getDataAbertura().get(Calendar.MONTH);
		if (mes < 6) {
			totalContasPrimeiroSemestre++;
		} else {
			totalContasSegundoSemestre++;
		}
		
		//return super.add(conta);
		return contas.add(conta);
	}

	//@Override
	public boolean addAll(Collection<? extends Conta> c) {
		for (Conta conta : c) {
			int mes = conta.getDataAbertura().get(Calendar.MONTH);
			if (mes < 6) {
				totalContasPrimeiroSemestre++;
			} else {
				totalContasSegundoSemestre++;
			}
		}
		
		//return super.addAll(c);
		return contas.addAll(c);
	}
	
	public int size() {
		return contas.size();
	}

	public int getTotalContasPrimeiroSemestre() {
		return totalContasPrimeiroSemestre;
	}
	
	public int getTotalContasSegundoSemestre() {
		return totalContasSegundoSemestre;
	}
	
}
