package pattern.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import pattern.Client;
import pattern.visitor.*;

import java.util.ArrayList;

public class RootController {
	public ImageView pic1;
	public ImageView pic2;
	public ImageView pic3;
	public TextArea logger;
	VisitorTextArea player;
	ArrayList<Building> game_map;
	
	public void initialize() {
		pic1.setImage(new Image(Client.getRes("1.png")));
		pic2.setImage(new Image(Client.getRes("2.png")));
		pic3.setImage(new Image(Client.getRes("3.png")));
		player = new VisitorTextArea(logger);
		game_map = new ArrayList<>();
		game_map.add(new House());
		game_map.add(new Library());
		game_map.add(new LightHouse());
	}
	
	public void print1(MouseEvent mouseEvent) {
		game_map.get(0).accept(player);
	}
	
	public void print2(MouseEvent mouseEvent) {
		game_map.get(1).accept(player);
	}
	
	public void print3(MouseEvent mouseEvent) {
		game_map.get(2).accept(player);
	}
	
	public void printAll(ActionEvent actionEvent) {
		game_map.forEach(e -> e.accept(player));
	}
}
