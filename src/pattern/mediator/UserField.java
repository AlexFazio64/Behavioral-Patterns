package pattern.mediator;

import javafx.scene.control.TextField;

public class UserField extends Component {
	private final TextField userFld;
	
	public UserField(Mediator dialog, TextField userFld) {
		super(dialog);
		this.userFld = userFld;
	}
	
	@Override
	public String getValue() {
		return userFld.getText();
	}
	
	@Override
	public void notifica() {
		super.dialog.notifica(this, userFld.getText().length() < 5 ? "short" : "long");
	}
}
