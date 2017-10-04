package br.com.caelum.fj91.modelo;

public class Sigla {

	private final Integer numeroTurma;

	public Sigla(Integer numeroTurma) {
		this.numeroTurma = numeroTurma;
	}
	
	public Integer getSigla() {
		return numeroTurma;
	}

	@Override
	public String toString() {
		return "Sigla [numeroTurma=" + numeroTurma + "]";
	}
}
