package br.com.caelum.fj91.banco.modelo;

import java.math.BigDecimal;
import java.util.Calendar;

public class Conta {

	private BigDecimal saldo = BigDecimal.ZERO;
	private BigDecimal limite = BigDecimal.ZERO;
	
	private Cliente titular;
	private int numero;
	private Calendar dataAbertura;
	
	public Conta(int numero, Calendar dataAbertura) {
		super();
		this.numero = numero;
		this.dataAbertura = dataAbertura;
	}
	
	// FIXME vamos poder mudar o numero da conta depois de criada?
//	public void setNumero(int numero) {
//		this.numero = numero;
//	}
	
	// FIXME podemos mudar a data de abertura depois de aberta?
//	public void setDataAbertura(Calendar dataAbertura) {
//		this.dataAbertura = dataAbertura;
//	}
	
	public int getNumero() {
		return numero;
	}
	
	public Calendar getDataAbertura() {
		return dataAbertura;
	}
	
	public BigDecimal getSaldo() {
		return saldo;
	}

	public BigDecimal getLimite() {
		return limite;
	}
	
	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	@Override
	public String toString() {
		return "{Conta #" + this.numero + "}";
	}

	/**
	 * Saca dinheiro de uma conta bancária
	 * 
	 * @param valor Valor a ser sacado
	 */
	public void sacar(BigDecimal valor) {
		BigDecimal novoSaldo = getSaldo().subtract(valor);
		
		if (novoSaldo.compareTo(getLimite().negate()) >= 0) {
			this.saldo = novoSaldo;
		} else {
			throw new RuntimeException("Saldo insuficiente");
		}
	}

	/**
	 * Deposita dinheiro em uma conta bancária
	 * 
	 * @param valor Valor a ser sacado
	 */
	public void depositar(BigDecimal valor) {
		BigDecimal novoSaldo = getSaldo().add(valor);
		this.saldo = novoSaldo;
	}
	
}
