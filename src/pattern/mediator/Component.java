package pattern.mediator;

public abstract class Component {
	Mediator dialog;
	
	public Component(Mediator dialog) {
		this.dialog = dialog;
	}
	
	public String getValue() {
		return "";
	}
	
	public void setColor(String color) {
	}
	
	public abstract void notifica();
}
