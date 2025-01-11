package Main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static Main.DBConnection.connect;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("admininterface.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
        connect();


    }
}