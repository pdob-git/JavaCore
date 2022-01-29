module eventmodules {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    exports pl.pdob.eventsmodules.main to javafx.graphics;
    opens pl.pdob.eventsmodules.controller to javafx.fxml;
}