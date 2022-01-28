module fxevents {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    exports pl.pdob.fxmltview.main to javafx.graphics;
    opens pl.pdob.fxmltview.controller to javafx.fxml;
}