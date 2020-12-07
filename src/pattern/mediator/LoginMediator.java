package pattern.mediator;

public class LoginMediator extends Mediator {
	UserField userField;
	PwdField passField;
	ColoredLabel userLbl;
	ColoredLabel passLbl;
	LoginButton loginButton;
	
	public void add(Component... list) {
		this.userField = (UserField) list[0];
		this.passField = (PwdField) list[1];
		this.userLbl = (ColoredLabel) list[2];
		this.passLbl = (ColoredLabel) list[3];
		this.loginButton = (LoginButton) list[4];
	}
	
	@Override
	public void notifica(Component sender, String context) {
		if ( sender == loginButton ) {
			String username = userField.getValue();
			String password = passField.getValue();
			loginButton.setColor(username.equals(password) ? "#00FF00" : "FF0000");
		} else if ( sender == userField ) {
			if ( context.equals("long") ) {
				userLbl.setColor("#00FF00");
			} else if ( context.equals("short") ) {
				userLbl.setColor("#FF0000");
			}
		} else if ( sender == passField ) {
			if ( context.equals("long") ) {
				passLbl.setColor("#00FF00");
			} else if ( context.equals("short") ) {
				passLbl.setColor("#FF0000");
			}
		}
	}
}
