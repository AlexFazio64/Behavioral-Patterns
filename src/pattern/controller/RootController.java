package pattern.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import pattern.template.AbstractBuilder;
import pattern.template.CementBuilder;
import pattern.template.WoodBuilder;

public class RootController {
	public TextArea logger;
	AbstractBuilder builder;
	String house = "I'm #s1, firstly I am going to #s2,\nafter that, I #s3,\nand finally I #s4.\nI'm done, here is your #s5...";
	
	public void buildWood(ActionEvent actionEvent) {
		builder = new WoodBuilder(house, "house");
		logger.appendText(builder.getFinishedProduct());
		logger.appendText("\n");
	}
	
	public void buildCement(ActionEvent actionEvent) {
		builder = new CementBuilder(house, "house");
		logger.appendText(builder.getFinishedProduct());
		logger.appendText("\n");
	}
}
