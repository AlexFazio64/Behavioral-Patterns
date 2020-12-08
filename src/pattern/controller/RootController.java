package pattern.controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import pattern.observer.Publisher;
import pattern.observer.User;

import java.util.ArrayList;

public class RootController {
	public TextField notificationTxt;
	public VBox unsubbed;
	public VBox subbed;
	Publisher youtube_channel;
	ArrayList<User> users;
	int selected;
	
	public void initialize() {
		selected = -1;
		youtube_channel = new Publisher();
		users = new ArrayList<>();
		
		users.add(new User("alexfazio64"));
		users.add(new User("armorofberserk"));
		users.add(new User("daniereu"));
		users.add(new User("videogamedunkey"));
		users.add(new User("pewdiepie"));
		users.add(new User("linustechtips"));
		
		users.forEach(e -> unsubbed.getChildren().add(e));
	}
	
	public void sub(ActionEvent actionEvent) {
		ObservableList<Node> children = unsubbed.getChildren();
		ArrayList<User> subbing = new ArrayList<>();
		for (Node child: children) {
			User u = (User) child;
			if ( u.isSel() ) {
				subbing.add(u);
				u.setSel();
				youtube_channel.subscribe(u);
			}
		}
		
		subbing.forEach(a -> {
			subbed.getChildren().add(a);
			unsubbed.getChildren().remove(a);
		});
	}
	
	public void unsub(ActionEvent actionEvent) {
		ObservableList<Node> children = subbed.getChildren();
		ArrayList<User> unsubbing = new ArrayList<>();
		for (Node child: children) {
			User u = (User) child;
			if ( u.isSel() ) {
				unsubbing.add(u);
				u.setSel();
				youtube_channel.unsubscribe(u);
			}
		}
		
		unsubbing.forEach(a -> {
			unsubbed.getChildren().add(a);
			subbed.getChildren().remove(a);
		});
	}
	
	public void sendNotif(ActionEvent actionEvent) {
		if ( notificationTxt.getText().length() >= 1 ) {
			youtube_channel.sendNotification(notificationTxt.getText());
			notificationTxt.setText("");
		}
	}
}
