module fxctrl{
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    exports pl.pdob.fxctrl.main to javafx.graphics;
    opens pl.pdob.fxctrl.controller to javafx.fxml;
}