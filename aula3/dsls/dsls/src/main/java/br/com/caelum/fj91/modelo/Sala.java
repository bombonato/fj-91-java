package br.com.caelum.fj91.modelo;

public class Sala {

	private final Integer numero;

	public Sala(Integer numeroTurma) {
		this.numero = numeroTurma;
	}
	
	public Integer getSala() {
		return numero;
	}

	@Override
	public String toString() {
		return "Sala [numero=" + numero + "]";
	}
}
