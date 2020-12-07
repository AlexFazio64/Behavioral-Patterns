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
		primaryStage.setTitle("Iterator");
		primaryStage.setResizable(false);
		primaryStage.setWidth(600);
		primaryStage.setHeight(400);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
