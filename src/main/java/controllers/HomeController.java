package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import lms.App;

public class HomeController implements Initializable {
    @FXML
    private void onLoginClicked(ActionEvent event) throws IOException {
      App.setRoot("login");
    }
    private void onSignupClicked(ActionEvent event) throws IOException {
        App.setRoot("signup");
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'initialize'");
    }
}
