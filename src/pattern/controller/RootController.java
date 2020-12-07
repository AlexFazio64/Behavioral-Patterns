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
	
	UserField userField;
	PwdField pwdField;
	ColoredLabel usrLbl;
	ColoredLabel pwdLbl;
	LoginButton loginButton;
	LoginMediator dialog;
	
	public void initialize() {
		dialog = new LoginMediator();
		
		userField = new UserField(dialog, usrFld);
		pwdField = new PwdField(dialog, passFld);
		usrLbl = new ColoredLabel(dialog, userLbl);
		pwdLbl = new ColoredLabel(dialog, passLbl);
		loginButton = new LoginButton(dialog, loginBtn);
		
		dialog.add(userField, pwdField, usrLbl, pwdLbl, loginButton);
	}
	
	public void inputUSR(KeyEvent keyEvent) {
		userField.notifica();
	}
	
	public void loginBRO(ActionEvent actionEvent) {
		loginButton.notifica();
	}
	
	public void inputURSS(KeyEvent keyEvent) {
		pwdField.notifica();
	}
}
