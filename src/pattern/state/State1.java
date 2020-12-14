package pattern.state;

import pattern.Client;

public class State1 extends State {
	public State1() {
		super(Client.getRes("1.png"));
	}
	
	@Override
	public State handle(char val) {
		return val == 'a' ? new State2() : new State1();
	}
}
