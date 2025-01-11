package Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class admininterfaceController {

    private Scene scene1 , scene2;
    private FXMLLoader loader1 , loader2;
    private Stage stage1;

    @FXML
    public Button btnGutilisateurs , btndeconnecter;


    @FXML
void goTogestionutilisateur(ActionEvent event) throws IOException {
        loader1 = new FXMLLoader(getClass().getResource("gererutilisateur.fxml"));
        Parent root = loader1.load();
        scene1 = new Scene(root);
        stage1 = (Stage) btnGutilisateurs.getScene().getWindow();
        stage1.setScene(scene1);
        stage1.centerOnScreen();
    }
    @FXML
    void disconect(ActionEvent event) throws IOException {
        loader1 = new FXMLLoader(getClass().getResource("login.fxml"));
        Parent root = loader1.load();
        scene1 = new Scene(root);
        stage1 = (Stage) btndeconnecter.getScene().getWindow();
        stage1.setScene(scene1);
        stage1.centerOnScreen();
    }







    }
