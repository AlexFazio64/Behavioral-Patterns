package pattern.visitor;

public class House implements Building {
	String background;
	String owner;
	String quest;
	String reward;
	
	public House() {
		background = "watch?v=qCKEXPXtrEU";
		owner = "Yonah";
		quest = "Yonah's Home Cooking";
		reward = "none";
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
		v.visitHouse(this);
	}
}
