package Main;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class gererutilisateurController implements Initializable {
    private Scene scene1 , scene2;
    private FXMLLoader loader1 , loader2;
    private Stage stage1;

    @FXML
    private Button btnsupprimer ;
    @FXML
    private Button btnmodifier;
    @FXML
    private Button btnajouter;
    @FXML 
    private Button  btndeconnecter,btnretour;
    @FXML
    TextField tfid;
    @FXML
    TextField tfprenom;
    @FXML
    TextField tfnom ;
    @FXML
    TextField datedate;
    @FXML
    TextField tfmail ;
    @FXML
    TableView<apprenant> table ;
    @FXML
    TableColumn<apprenant , Integer>colid;
    @FXML
    TableColumn<apprenant , String>colprenom;
    @FXML
    TableColumn<apprenant , String>colnom;
    @FXML
    TableColumn<apprenant , String >colmail;






    @FXML
    void supprimerapprenant(ActionEvent event){

    }
    @FXML
    void modifierapprenant(ActionEvent event){

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

    @FXML
    void retour(ActionEvent event) throws IOException {
        loader1 = new FXMLLoader(getClass().getResource("admininterface.fxml"));
        Parent root = loader1.load();
        scene1 = new Scene(root);
        stage1 = (Stage) btnretour.getScene().getWindow();
        stage1.setScene(scene1);
        stage1.centerOnScreen();
    }
    void ajouter(ActionEvent event) throws IOException{

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

