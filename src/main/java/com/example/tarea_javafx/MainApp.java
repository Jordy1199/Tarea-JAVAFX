package com.example.tarea_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/com/example/tarea_javafx/fxml/Administrador.fxml"));        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Panel Administrador");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}