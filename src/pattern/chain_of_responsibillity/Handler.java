package pattern.chain_of_responsibillity;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public abstract class Handler extends BorderPane {
	protected Handler next = null;
	protected Label led;
	
	public Handler() {
		super();
		this.setMinSize(200, 200);
		led = new Label("?");
		this.setBottom(new BorderPane(led));
	}
	
	public void setNext(Handler next) {
		this.next = next;
	}
	
	public abstract void handle(String request);
}
