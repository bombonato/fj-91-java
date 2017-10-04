package br.com.caelum.fj91.modelo;

public class Turma {

	private Sigla sigla;
	@Override
	public String toString() {
		return "Turma [sigla=" + sigla + ", periodo=" + periodo + ", sala="
				+ sala + "]";
	}

	private Periodo periodo;
	private final Sala sala;

	public Turma(Sigla sigla, Periodo periodo, Sala sala) {
		this.sigla = sigla;
		this.periodo = periodo;
		this.sala = sala;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public Sigla getSigla() {
		return sigla;
	}

	public Sala getSala() {
		return sala;
	}
	


}
