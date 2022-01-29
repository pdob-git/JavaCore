module fxevents {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    exports pl.pdob.fxmltctrl.main to javafx.graphics;
    opens pl.pdob.fxmltctrl.controller to javafx.fxml;
}