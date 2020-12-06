package pattern.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import pattern.mediator.*;

public class RootController {
	public TextField usrFld;
	public Button loginBtn;
	public PasswordField passFld;
	public Label userLbl;
	public Label passLbl;
	UserField a;
	PwdField b;
	ColoredLabel c;
	ColoredLabel d;
	LoginButton e;
	LoginMediator dialog;
	
	public void initialize() {
		dialog = new LoginMediator();
		a = new UserField(dialog, usrFld);
		b = new PwdField(dialog, passFld);
		c = new ColoredLabel(dialog, userLbl);
		d = new ColoredLabel(dialog, passLbl);
		e = new LoginButton(dialog, loginBtn);
		dialog.add(a, b, c, d, e);
	}
	
	public void inputUSR(KeyEvent keyEvent) {
		a.notifica();
	}
	
	public void loginBRO(ActionEvent actionEvent) {
		e.notifica();
	}
	
	public void inputURSS(KeyEvent keyEvent) {
		b.notifica();
	}
}
