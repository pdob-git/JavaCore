module fxaction{
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    exports pl.pdob.fxmlctrl.main to javafx.graphics;
    opens pl.pdob.fxmlctrl.controller to javafx.fxml;
}