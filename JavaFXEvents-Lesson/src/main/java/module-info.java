module fxaction{
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    exports pl.pdob.fxaction.main to javafx.graphics;
    opens pl.pdob.fxaction.controller to javafx.fxml;
}