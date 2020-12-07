package pattern.iterator;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public abstract class GenericElement extends Canvas {
	
	public GenericElement() {
		super();
		this.setWidth(200);
		this.setHeight(200);
		this.getGraphicsContext2D().fillRect(0, 0, 200, 200);
	}
	
	public void visit(String color) {
		this.getGraphicsContext2D().setFill(Color.web(color));
		this.getGraphicsContext2D().fillRect(0, 0, 200, 200);
	}
	
	public void reset() {
		this.getGraphicsContext2D().setFill(Color.web("000000"));
		this.getGraphicsContext2D().fillRect(0, 0, 200, 200);
	}
}