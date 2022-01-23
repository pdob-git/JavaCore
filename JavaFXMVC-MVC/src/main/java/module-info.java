module mvc {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    exports pl.pdob.mvc to javafx.graphics;
    opens pl.pdob.mvc to javafx.fxml;
}