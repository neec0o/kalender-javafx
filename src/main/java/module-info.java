module de.devnico.kalender {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens de.devnico.kalender to javafx.fxml;
    exports de.devnico.kalender;
}