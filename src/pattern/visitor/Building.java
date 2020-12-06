package pattern.visitor;

public interface Building {
	String getBackground();
	
	String getOwner();
	
	String getQuest();
	
	String getReward();
	
	void accept(Visitor v);
}
