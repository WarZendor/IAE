module com.example.iae {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires zip4j;
    requires java.desktop;

    opens com.example.iae to javafx.fxml;
    exports com.example.iae;
}