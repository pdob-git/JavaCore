module fxproperties {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    exports pl.pdob.fxproperties.main to javafx.graphics;
    opens pl.pdob.fxproperties.controller to javafx.fxml;
}