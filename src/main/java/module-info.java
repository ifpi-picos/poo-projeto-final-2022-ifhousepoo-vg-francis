module IFHouse {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.instrument;
    exports com.example to javafx.graphics, javafx.fxml;
    opens com.example to javafx.fxml;
    exports com.example.Controllers to javafx.fxml, javafx.graphics;
    exports com.example.Entidades to com.example.Controllers;
    exports com.example.Exceptions to com.example.Entidades;
    opens com.example.Controllers to javafx.fxml;
    opens com.example.Entidades to javafx.base;
}
