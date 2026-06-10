package com.example.tarea_javafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;

public class CajeroController {

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