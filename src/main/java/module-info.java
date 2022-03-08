module app {
    requires javafx.controls;
    requires javafx.fxml;

    opens app to javafx.fxml;
    exports app;
    exports gui;
    opens gui to javafx.fxml;
    exports gui.util;
    opens gui.util to javafx.fxml;
    exports model.entities;
    opens model.entities to javafx.fxml;
    exports model.services;
    opens model.services to javafx.fxml;
}