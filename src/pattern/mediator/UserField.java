package pattern.mediator;

import javafx.scene.control.TextField;

public class UserField extends Component {
	private TextField userFld;
	
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
		System.out.println("userField notifica il dialog");
		super.dialog.notifica(this, "user_input");
	}
}
