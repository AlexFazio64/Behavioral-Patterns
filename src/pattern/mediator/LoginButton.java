package pattern.mediator;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class LoginButton extends Component {
	private Button loginBtn;
	
	public LoginButton(Mediator dialog, Button loginBtn) {
		super(dialog);
		this.loginBtn = loginBtn;
	}
	
	@Override
	public void setColor(String color) {
		loginBtn.setTextFill(Color.web(color));
	}
	
	@Override
	public void notifica() {
		super.dialog.notifica(this, "login");
	}
}
