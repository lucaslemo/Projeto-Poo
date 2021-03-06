package br.edu.ufca.app;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SistemaCliente extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/fxml/loginCliente.fxml"));
		Scene scene = new Scene(root, 400, 450);
		primaryStage.setMaximized(false);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Sistema de Gerenciamento de Fazendas");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);		
	}
}
