package pattern.chain_of_responsibillity;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public class ColorHandler extends Handler {
	private Canvas color;
	
	public ColorHandler() {
		super();
		color = new Canvas(200, 200);
		this.setCenter(color);
	}
	
	@Override
	public void handle(String request) {
		if ( request.contains("color:") ) {
			String context = request.split("color:")[1];
			try {
				color.getGraphicsContext2D().setFill(Color.web(context));
				color.getGraphicsContext2D().fillRect(0, 0, 200, 200);
				led.setText("✔");
			} catch (Exception e) {
				led.setText("?");
			}
		} else if ( next != null ) {
			led.setText("❌");
			next.handle(request);
		}
	}
}
