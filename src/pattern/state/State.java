package pattern.state;

import javafx.scene.image.Image;

public abstract class State extends Image {
	public State(String pic) {
		super(pic);
	}
	
	public abstract State handle(char val);
}
