module cssnotepad {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports pl.pdob.cssnotepad.main to javafx.graphics;
    opens pl.pdob.cssnotepad.controller to javafx.fxml;
}