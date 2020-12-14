package pattern.state;

import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class Automaton extends ImageView {
	private ArrayList<Character> exp;
	private State internalState;
	
	public Automaton(String exp) {
		super();
		this.exp = new ArrayList<>();
		for (int i = 0; i < exp.length(); i++) {
			this.exp.add(exp.charAt(i));
		}
		this.exp.add(' ');
		internalState = new State1();
		this.setImage(internalState);
	}
	
	public void evaluate() {
		char c = exp.get(0);
		exp.remove(0);
		internalState = internalState.handle(c);
		this.setImage(internalState);
	}
	
	public boolean isValid() {
		return exp.size() >= 1;
	}
}
