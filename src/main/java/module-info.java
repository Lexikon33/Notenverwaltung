module com.example.notenverwaltung {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.notenverwaltung to javafx.fxml;
    exports com.example.notenverwaltung;
}