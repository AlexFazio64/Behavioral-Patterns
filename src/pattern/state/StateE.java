package pattern.state;

import pattern.Client;

public class StateE extends State {
	public StateE() {
		super(Client.getRes("e.png"));
	}
	
	@Override
	public State handle(char val) {
		return val == 'e' ? this : new State1();
	}
}
