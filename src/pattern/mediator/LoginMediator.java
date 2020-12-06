package pattern.mediator;

public class LoginMediator extends Mediator {
	UserField userField;
	PwdField passField;
	ColoredLabel userLbl;
	ColoredLabel passLbl;
	LoginButton loginButton;
	
	public LoginMediator() {
		this.userField = null;
		this.passField = null;
		this.userLbl = null;
		this.passLbl = null;
		this.loginButton = null;
	}
	
	public void add(Component... list) {
		this.userField = (UserField) list[0];
		this.passField = (PwdField) list[1];
		this.userLbl = (ColoredLabel) list[2];
		this.passLbl = (ColoredLabel) list[3];
		this.loginButton = (LoginButton) list[4];
	}
	
	@Override
	public void notifica(Component sender, String context) {
		System.out.println("dialog riceve una notifica");
		if ( sender == loginButton ) {
			System.out.println("è login");
			String username = userField.getValue();
			String password = passField.getValue();
			System.out.println(username.equals(password) ? "si" : "no");
		} else if ( sender == userField ) {
			System.out.println("è userField");
			String username = userField.getValue();
			if ( username.length() > 5 ) {
				userLbl.setColor("#7E11BF");
			}
		} else if ( sender == passField ) {
			System.out.println("è password");
			String password = passField.getValue();
			if ( password.length() > 5 ) {
				passLbl.setColor("#c6e7a0");
			}
		}
	}
}
