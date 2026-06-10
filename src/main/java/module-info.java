module com.example.tarea_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.tarea_javafx to javafx.fxml;
    exports com.example.tarea_javafx;
}