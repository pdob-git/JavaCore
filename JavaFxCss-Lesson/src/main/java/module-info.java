module fxcss {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;


    exports pl.pdob.fxcss.app to javafx.graphics;
    opens pl.pdob.fxcss.controller to javafx.fxml;
}