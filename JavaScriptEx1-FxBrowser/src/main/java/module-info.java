module fxbrowser {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.web;

    exports pl.pdob.fxbrowser to javafx.graphics;
    opens pl.pdob.fxbrowser to javafx.fxml;
}