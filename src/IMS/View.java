package IMS;

import javafx.stage.Stage;

public class View {
	private final Model model;
	private Stage stage;
	
	public View(Stage stage, Model model) {
		this.model = model;
		this.stage = stage;
	}
	
	public void start() {
	stage.show();
	}
}
