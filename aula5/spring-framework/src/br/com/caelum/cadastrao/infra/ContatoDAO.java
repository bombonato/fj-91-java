package br.com.caelum.cadastrao.infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.cadastrao.modelo.Contato;

@Repository
public class ContatoDAO {

	@PersistenceContext
	EntityManager manager;
	
	public void salva(Contato c){
		manager.persist(c);
	}

	@SuppressWarnings("unchecked")
	public List<Contato> lista() {
		return manager.createQuery("from Contato").getResultList();
	}

	public void remove(Contato contato) {
		manager.remove(manager.merge(contato));
	}

	public Contato busca(Long id) {
		return manager.find(Contato.class, id);
	}
}
