package IMS;

import javafx.application.Application;
import javafx.stage.Stage;

public class IMS extends Application{
	private Model model;
	private  View view;
	private Controller controller;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		model = new Model();
		view = new View(stage, model);
		controller = new Controller(model, view);
		view.start();
	}
}
