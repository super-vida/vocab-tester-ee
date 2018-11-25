package cz.prague.vida.vocab.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cz.prague.vida.vocab.entity.Word;

@Stateless
public class WordFacade extends AbstractFacade<Word> {

	
	@PersistenceContext(unitName = "vocab")
	private EntityManager em;
	
	public WordFacade() {
		super(Word.class);
	}

	public List<Word> getWords() {
		return super.findAll();
	}

	@Override
	public EntityManager getEntityManager() {
		return em;
	}

}
