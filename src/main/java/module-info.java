module com.example.javaproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens Main to javafx.fxml;
    exports Main;
}