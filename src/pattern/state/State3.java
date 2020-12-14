package pattern.state;

import pattern.Client;

public class State3 extends State {
	public State3() {
		super(Client.getRes("3.png"));
	}
	
	@Override
	public State handle(char val) {
		return val == 'c' ? new State4() : new State1();
	}
}
