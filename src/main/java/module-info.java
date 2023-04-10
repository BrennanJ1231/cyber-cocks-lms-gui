module lms {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;

    opens lms to javafx.fxml;
    exports lms;

    opens model to javafx.fxml;
    exports model;
}
