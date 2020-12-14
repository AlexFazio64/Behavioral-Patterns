package pattern.state;

import pattern.Client;

public class State4 extends State {
	public State4() {
		super(Client.getRes("4.png"));
	}
	
	@Override
	public State handle(char val) {
		return val == 'f' ? new State2() : new State1();
	}
}
