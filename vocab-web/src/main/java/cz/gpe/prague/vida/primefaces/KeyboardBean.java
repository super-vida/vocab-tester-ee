package cz.gpe.prague.vida.primefaces;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import cz.prague.vida.vocab.ejb.WordFacade;
import cz.prague.vida.vocab.entity.Word;

@Named("keyboardBean")
@SessionScoped
public class KeyboardBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private WordFacade wordFacade;

	private String value;

	public String getValue() {
		System.out.println("KeyboardBean::reading value: " + value);
		return value;

	}

	public void setValue(String value) {
		System.out.println("KeyboardBean::setting value: " + value);

		this.value = value;
	}

	public List<Word> getWords() {
		List<Word> list = wordFacade.getWords();
//		if (list != null) {
//			for (Word word : list) {
//				System.out.println(word);
//			}
//		}
		return list;

	}

}