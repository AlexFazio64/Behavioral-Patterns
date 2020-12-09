package pattern.chain_of_responsibillity;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import pattern.Client;

public class FabricHandler extends Handler {
	ImageView image;
	
	public FabricHandler() {
		super();
		image = new ImageView();
		this.setCenter(image);
	}
	
	@Override
	public void handle(String request) {
		if ( request.contains("fabric:") ) {
			String context = request.split("fabric:")[1];
			try {
				image.setImage(new Image(Client.getRes(context + ".jpg"), 200, 200, true, true));
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
