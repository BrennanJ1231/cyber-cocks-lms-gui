package controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import lms.App;

public class LoginController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}