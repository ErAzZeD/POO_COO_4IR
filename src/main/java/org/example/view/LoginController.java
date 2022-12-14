package org.example.view;

import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.example.controler.StartSessionController;

import java.io.IOException;

public class LoginController {

    public TextField loginText;
    Stage myStage;

    public void setStage(Stage s) {
        myStage = s;
    }

    public void startSession(MouseEvent m) throws IOException {
        HelloApplication ha = new HelloApplication(loginText.getText());
        ha.start(new Stage());
        myStage.close();
    }
    public void validateOK(MouseEvent mouseEvent) throws IOException {
        /* TODO : Verify the username to check if it is used
           if yes : tell to the user to retry
           if no : validate and go to the main frame
         */
        StartSessionController s = new StartSessionController();
        s.verifyPseudo(loginText.getText());
    }

    public void loginEnter(KeyEvent keyEvent) throws IOException {
        if (keyEvent.getCode().equals(KeyCode.ENTER)) {
            validateOK(null);
        }
    }


}
