package br.com.caelum.fj91.modelo;


public class Periodo {

	private final String valor;

	public Periodo(String valor) {
		this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return this.valor;
	}
	
}
