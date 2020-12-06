package pattern.mediator;

import javafx.scene.control.Button;

public class LoginButton extends Component {
	private Button loginBtn;
	
	public LoginButton(Mediator dialog, Button loginBtn) {
		super(dialog);
		this.loginBtn = loginBtn;
	}
	
	@Override
	public void notifica() {
		super.dialog.notifica(this, "login");
	}
}
