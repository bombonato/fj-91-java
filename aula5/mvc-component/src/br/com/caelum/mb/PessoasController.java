package br.com.caelum.mb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.caelum.modelo.Pessoa;

@ViewScoped
@ManagedBean
public class PessoasController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Pessoa pessoa = new Pessoa();
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();

	public void incluir(){
		pessoas.add(this.pessoa);
		this.pessoa = new Pessoa();
	}
	
	public Pessoa getPessoa(){
		return this.pessoa;
	}
	
	public void setPessoa(Pessoa pessoa){
		this.pessoa = pessoa;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
}