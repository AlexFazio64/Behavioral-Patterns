package pattern.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pattern.interpreter.ContainsExpression;
import pattern.interpreter.Expression;
import pattern.interpreter.LiteralExpression;
import pattern.interpreter.UppercaseExpression;

public class RootController {
	public Button contains;
	public Button literal;
	public Button uppercase;
	public TextField exp1;
	public TextField exp2;
	public Label result;
	
	public void execContains(ActionEvent actionEvent) {
		if ( !( exp1.getText().length() >= 1 ) || !( exp2.getText().length() >= 1 ) ) {
			result.setText("input 2 strings to compare...");
			return;
		}
		
		Expression e1 = new LiteralExpression(exp1.getText());
		Expression e2 = new LiteralExpression(exp2.getText());
		
		result.setText("Result: " + new ContainsExpression(e1, e2).interpret());
	}
	
	public void execLiteral(ActionEvent actionEvent) {
		if ( !( exp1.getText().length() >= 1 ) ) {
			return;
		}
		
		Expression e1 = new LiteralExpression(exp1.getText());
		
		result.setText("Result: " + e1.interpret());
	}
	
	public void execUppercase(ActionEvent actionEvent) {
		if ( !( exp1.getText().length() >= 1 ) ) {
			return;
		}
		
		Expression e1 = new LiteralExpression(exp1.getText());
		
		result.setText("Result: " + new UppercaseExpression(e1).interpret());
	}
}
