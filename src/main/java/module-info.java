module app.javafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.javafxjdbc to javafx.fxml;
    exports app.javafxjdbc;
}