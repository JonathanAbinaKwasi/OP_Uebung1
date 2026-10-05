package gui;

import javafx.application.Application;
import javafx.stage.Stage;
import business.CsvDateiLeser;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		new Anwendungssystem(primaryStage);
	}

	public static void main(String[] args) {
		launch(args);
		CsvDateiLeser cdl = new CsvDateiLeser();
		String ueberschrift = cdl.getUeberschrift();
		System.out.println(ueberschrift);
	}
}