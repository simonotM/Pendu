module com.application.pendu {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.application.pendu to javafx.fxml;
    exports com.application.pendu;
}