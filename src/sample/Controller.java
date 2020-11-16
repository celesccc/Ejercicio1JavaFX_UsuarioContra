package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private TextField idTFlUser;
    @FXML
    private PasswordField idTFPassword;
    @FXML
    private Label idShowPassword;
    @FXML
    private Button idButton;

    public void showPassword(MouseEvent event) {
        idShowPassword.setText(idTFPassword.getText());
    }

    public void pressButton(MouseEvent event) {
        idButton.setText("Botón pulsado");
    }

}
