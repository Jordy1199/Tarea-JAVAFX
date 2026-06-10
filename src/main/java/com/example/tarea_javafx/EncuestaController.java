package com.example.tarea_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class EncuestaController {

    @FXML private ToggleGroup grupo1;
    @FXML private ToggleGroup grupo2;
    @FXML private ToggleGroup grupo3;
    @FXML private ToggleGroup grupo4;
    @FXML private Label lblResultado;

    @FXML
    private void handleCalcular() {
        int puntaje = 0;
        int correctas = 0;
        int incorrectas = 0;

        // Respuesta correcta P1: Python
        RadioButton sel1 = (RadioButton) grupo1.getSelectedToggle();
        if (sel1 != null && sel1.getText().equals("Python")) {
            puntaje += 5;
            correctas++;
        } else if (sel1 != null) {
            incorrectas++;
        }

        // Respuesta correcta P2: Programación Orientada a Objetos
        RadioButton sel2 = (RadioButton) grupo2.getSelectedToggle();
        if (sel2 != null && sel2.getText().equals("Programación Orientada a Objetos")) {
            puntaje += 5;
            correctas++;
        } else if (sel2 != null) {
            incorrectas++;
        }

        // Respuesta correcta P3: Un framework para interfaces gráficas en Java
        RadioButton sel3 = (RadioButton) grupo3.getSelectedToggle();
        if (sel3 != null && sel3.getText().equals("Un framework para interfaces gráficas en Java")) {
            puntaje += 5;
            correctas++;
        } else if (sel3 != null) {
            incorrectas++;
        }

        // Respuesta correcta P4: .fxml
        RadioButton sel4 = (RadioButton) grupo4.getSelectedToggle();
        if (sel4 != null && sel4.getText().equals(".fxml")) {
            puntaje += 5;
            correctas++;
        } else if (sel4 != null) {
            incorrectas++;
        }

        lblResultado.setText("Puntaje: " + puntaje + "/20  |  Correctas: " + correctas + "  |  Incorrectas: " + incorrectas);
    }

    @FXML
    private void handleVolver(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/example/tarea_javafx/fxml/Administrador.fxml"));
            Stage nuevoStage = new Stage();
            nuevoStage.setScene(new Scene(loader.load()));
            nuevoStage.setTitle("Panel Administrador");
            nuevoStage.show();

            Stage stageActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageActual.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}