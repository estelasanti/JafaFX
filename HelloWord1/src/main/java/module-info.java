module com.example.helloword1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helloword1 to javafx.fxml;
    exports com.example.helloword1;
}