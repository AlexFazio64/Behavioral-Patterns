package pattern.mediator;

import javafx.scene.control.PasswordField;

public class PwdField extends Component {
	private PasswordField passwordFld;
	
	public PwdField(Mediator dialog, PasswordField passwordFld) {
		super(dialog);
		this.passwordFld = passwordFld;
	}
	
	@Override
	public String getValue() {
		return passwordFld.getText();
	}
	
	@Override
	public void notifica() {
		super.dialog.notifica(this, passwordFld.getText().length() < 5 ? "short" : "long");
	}
}
