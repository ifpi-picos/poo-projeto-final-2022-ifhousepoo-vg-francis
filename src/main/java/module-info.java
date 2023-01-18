module IFHouse {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.instrument;
    requires dotenv.java;
    exports com.example to javafx.graphics, javafx.fxml;
    opens com.example to javafx.fxml;
    exports com.example.Controllers to javafx.fxml, javafx.graphics;
    opens com.example.Controllers to javafx.fxml;
}
