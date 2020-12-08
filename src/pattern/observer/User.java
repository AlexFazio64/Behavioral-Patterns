package pattern.observer;

import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class User extends BorderPane implements Subscriber {
	private final Label led;
	private final Label ch;
	boolean sel;
	
	public User(String name) {
		super();
		this.ch = new Label(name);
		ch.setFont(new Font(18));
		this.setCenter(ch);
		led = new Label();
		led.setFont(new Font(18));
		sel = false;
		this.setLeft(led);
		this.setOnMouseClicked(a -> {
			sel = true;
			ch.setTextFill(Color.web("#0000FF"));
			led.setText("");
			led.setTooltip(null);
		});
	}
	
	public boolean isSel() {
		return sel;
	}
	
	public void setSel() {
		this.sel = false;
		ch.setTextFill(Color.web("#000000"));
	}
	
	@Override
	public void receive(String context) {
		led.setText("✔");
		led.setTooltip(new Tooltip(context));
	}
}
