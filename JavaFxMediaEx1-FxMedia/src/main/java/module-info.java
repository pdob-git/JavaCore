module fxmedia {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.media;

    exports pl.pdob.fxmedia;
    opens pl.pdob.fxmedia to javafx.fxml, javafx.media;
}