module fxevents {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    exports pl.pdob.fxevents.main to javafx.graphics;
    opens pl.pdob.fxevents.controller to javafx.fxml;
}