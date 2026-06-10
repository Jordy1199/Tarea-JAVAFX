package com.example.tarea_javafx;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.application.Platform;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtContrasena;
    @FXML private ComboBox<String> cmbRol;
    @FXML private Label lblMensaje;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cmbRol.setItems(FXCollections.observableArrayList("Administrador", "Cajero"));
        cmbRol.getSelectionModel().selectFirst();
    }

    @FXML
    private void handleIngresar() {
        String usuario = txtUsuario.getText().trim();
        String contrasena = txtContrasena.getText().trim();
        String rol = cmbRol.getValue();

        if (usuario.isEmpty() || contrasena.isEmpty()) {
            lblMensaje.setText("Complete todos los campos.");
            return;
        }

        if (rol.equals("Administrador") && usuario.equals("Admin") && contrasena.equals("admin1234")) {
            abrirVentana("/com/example/tarea_javafx/fxml/Administrador.fxml", "Panel Administrador");
        } else if (rol.equals("Cajero") && usuario.equals("cliente") && contrasena.equals("cliente1234")) {
            abrirVentana("/com/example/tarea_javafx/fxml/Cajero.fxml", "Panel Cajero");
        } else {
            lblMensaje.setText("Credenciales incorrectas.");
        }
    }

    private void abrirVentana(String ruta, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(ruta));
            Stage nuevoStage = new Stage();
            nuevoStage.setScene(new Scene(loader.load()));
            nuevoStage.setTitle(titulo);
            nuevoStage.show();

            Stage stageActual = (Stage) txtUsuario.getScene().getWindow();
            stageActual.close();
        } catch (Exception e) {
            lblMensaje.setText("Error al abrir ventana.");
            e.printStackTrace();
        }
    }

    @FXML
    private void handleSalir() {
        Platform.exit();
    }
}