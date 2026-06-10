package com.example.tarea_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdminController {

    @FXML
    private void handleEncuesta(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/example/tarea_javafx/fxml/Encuesta.fxml"));
            Stage nuevoStage = new Stage();
            nuevoStage.setScene(new Scene(loader.load()));
            nuevoStage.setTitle("Encuesta");
            nuevoStage.show();

            Stage stageActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageActual.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleCerrarSesion(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/example/tarea_javafx/fxml/Login.fxml"));
            Stage nuevoStage = new Stage();
            nuevoStage.setScene(new Scene(loader.load()));
            nuevoStage.setTitle("Login");
            nuevoStage.show();

            Stage stageActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageActual.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}