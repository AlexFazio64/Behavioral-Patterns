package pattern.visitor;

import javafx.scene.control.TextArea;

public class VisitorTextArea implements Visitor {
	TextArea logger;
	
	public VisitorTextArea(TextArea log) {
		this.logger = log;
	}
	
	@Override
	public void visitHouse(House h) {
		logger.appendText("Visiting House\n");
		logger.appendText("Owner: " + h.getOwner());
		logger.appendText("\n");
		logger.appendText("BGM: " + h.getBackground());
		logger.appendText("\n");
		logger.appendText("Quest: " + h.getQuest());
		logger.appendText("\n");
		logger.appendText("Reward: " + h.getReward());
		logger.appendText("\n");
	}
	
	@Override
	public void visitLibrary(Library a) {
		logger.appendText("Visiting Library\n");
		logger.appendText("Owner: " + a.getOwner());
		logger.appendText("\n");
		logger.appendText("BGM: " + a.getBackground());
		logger.appendText("\n");
		logger.appendText("Quest: " + a.getQuest());
		logger.appendText("\n");
		logger.appendText("Reward: " + a.getReward());
		logger.appendText("\n");
	}
	
	@Override
	public void visitLightHouse(LightHouse l) {
		logger.appendText("Visiting Lighthouse\n");
		logger.appendText("Owner: " + l.getOwner());
		logger.appendText("\n");
		logger.appendText("BGM: " + l.getBackground());
		logger.appendText("\n");
		logger.appendText("Quest: " + l.getQuest());
		logger.appendText("\n");
		logger.appendText("Reward: " + l.getReward());
		logger.appendText("\n");
	}
}
