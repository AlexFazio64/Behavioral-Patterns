package pattern.visitor;

public class LightHouse implements Building {
	String background;
	String owner;
	String quest;
	String reward;
	
	public LightHouse() {
		background = "watch?v=X0eieyeViS0";
		owner = "Lighthouse Lady";
		quest = "Closure";
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
		v.visitLightHouse(this);
	}
}
