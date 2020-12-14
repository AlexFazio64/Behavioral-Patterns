package pattern.state;

import pattern.Client;

public class State2 extends State {
	public State2() {
		super(Client.getRes("2.png"));
	}
	
	@Override
	public State handle(char val) {
		switch (val) {
			case 'b':
				return new State3();
			case 'd':
				return new StateE();
		}
		return new State1();
	}
}
