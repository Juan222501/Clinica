module co.edu.uniquindio.clinica {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.clinica to javafx.fxml;
    exports co.edu.uniquindio.clinica;
}