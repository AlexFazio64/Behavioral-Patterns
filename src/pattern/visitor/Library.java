package pattern.visitor;

public class Library implements Building {
	String background;
	String owner;
	String quest;
	String reward;
	
	public Library() {
		background = "watch?v=IZdnJLdmRlI";
		owner = "Devola & Popola";
		quest = "Herbal Remedies";
		reward = "500 gold";
	}
	
	@Override
	public String getBackground() {
		return background;
	}
	
	@Override
	public String getOwner() {
		return owner;
	}
	
	@Override
	public String getQuest() {
		return quest;
	}
	
	@Override
	public String getReward() {
		return reward;
	}
	
	@Override
	public void accept(Visitor v) {
		v.visitLibrary(this);
	}
}
