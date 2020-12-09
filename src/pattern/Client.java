package pattern;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Client extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("view/root.fxml"));
		primaryStage.setScene(new Scene(loader.load()));
		primaryStage.setTitle("Chain of responsibility");
		primaryStage.setResizable(false);
		primaryStage.setWidth(800);
		primaryStage.setHeight(400);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static String getRes(String name) {
		return Client.class.getResource("resources/" + name).toString();
	}
}
