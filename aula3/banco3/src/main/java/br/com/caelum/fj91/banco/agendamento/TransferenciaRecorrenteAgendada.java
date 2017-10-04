package br.com.caelum.fj91.banco.agendamento;

import java.math.BigDecimal;

import br.com.caelum.fj91.banco.modelo.Conta;
import br.com.caelum.fj91.banco.modelo.Periodo;

public class TransferenciaRecorrenteAgendada {

	private Conta origem;
	private Conta destino;
	private Periodo periodo;
	private BigDecimal valor;
	
	// Dia em que a transferência deve acontecer
	private Integer dia;

	public Conta getOrigem() {
		return origem;
	}

	public TransferenciaRecorrenteAgendada daConta(Conta origem) {
		this.origem = origem;
		return this;
	}

	public Conta getDestino() {
		return destino;
	}

	public TransferenciaRecorrenteAgendada paraConta(Conta destino) {
		this.destino = destino;
		return this;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public TransferenciaRecorrenteAgendada durante(Periodo periodo) {
		this.periodo = periodo;
		return this;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public TransferenciaRecorrenteAgendada valor(BigDecimal valor) {
		this.valor = valor;
		return this;
	}

	public Integer getDia() {
		return dia;
	}

	public TransferenciaRecorrenteAgendada noDia(Integer dia) {
		this.dia = dia;
		return this;
	}

	public void efetiva() {
		// Tem que pagar 8 reais por transferencia agendada
		origem.saca(new BigDecimal(8));
		origem.transferePara(destino, valor);
	}
}
