package pattern.mediator;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class ColoredLabel extends Component {
	private Label label;
	
	public ColoredLabel(Mediator dialog, Label label) {
		super(dialog);
		this.label = label;
	}
	
	@Override
	public void setColor(String color) {
		label.setTextFill(Color.web(color));
	}
	
	@Override
	public void notifica() {
		super.dialog.notifica(this, "field_changed");
	}
}
