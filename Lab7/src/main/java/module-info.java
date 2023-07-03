module com.example.lab7 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.Lab7 to javafx.fxml;
    exports com.example.Lab7;
    exports com.example.Lab7.controller;
    opens com.example.Lab7.controller to javafx.fxml;
}