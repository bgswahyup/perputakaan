module com.perpus {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.perpus to javafx.fxml;
    exports com.perpus;
}
