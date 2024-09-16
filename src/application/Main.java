package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			/*
			 * Criando uma instacia do metodo Loader, para manipular a tela antes de
			 * carregar
			 */
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			/* Parent parent = loader.load(); chama o loader e carrega a view (Subtituimos a linha 20 pela 21)*/
			ScrollPane scrollPane = loader.load();
			
			/* Acrecentando dois comando pra ajustar a janela do Scrollpane */
			scrollPane.setFitToHeight(true);
			scrollPane.setFitToWidth(true);
			
			Scene mainScene = new Scene(scrollPane); /* cria o objeto pra primeira cena principal */
			primaryStage.setScene(mainScene);/* palco da sena esta sendo setada como principal */
			primaryStage.setTitle("Sample JavaFX application"); /* definindo um titulo da cena principal */
			primaryStage.show(); /* aqui mostra o palco */
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
