package pattern.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import pattern.chain_of_responsibillity.ColorHandler;
import pattern.chain_of_responsibillity.FabricHandler;
import pattern.chain_of_responsibillity.Handler;
import pattern.chain_of_responsibillity.MaterialHandler;

public class RootController {
	public HBox main;
	public TextField expr;
	Handler color;
	Handler fabric;
	Handler material;
	
	public void initialize() {
		color = new ColorHandler();
		fabric = new FabricHandler();
		material = new MaterialHandler();
		
		main.getChildren().addAll(color, fabric, material);
		
		color.setNext(fabric);
		fabric.setNext(material);
	}
	
	public void sendRequest(ActionEvent actionEvent) {
		color.handle(expr.getText());
	}
}
