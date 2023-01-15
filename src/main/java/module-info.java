module SimpleMavenApplication {
    requires java.sql;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.instrument;
    requires dotenv.java;
    exports com.example to javafx.graphics;
}
