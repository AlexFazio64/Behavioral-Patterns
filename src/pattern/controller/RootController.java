package pattern.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import pattern.state.Automaton;

public class RootController {
	public TextField string;
	public BorderPane pane;
	private Automaton string_recognizer;
	
	public void next(ActionEvent actionEvent) {
		if ( string_recognizer != null && string_recognizer.isValid() ) {
			string_recognizer.evaluate();
		} else {
			string_recognizer = null;
		}
	}
	
	public void set(ActionEvent actionEvent) {
		string_recognizer = new Automaton(string.getText());
		pane.setCenter(string_recognizer);
	}
}
