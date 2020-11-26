package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
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

    @FXML
    public void showPassword(MouseEvent event) {
        idShowPassword.setText(idTFPassword.getText());
    }

    @FXML
    public void onClickedMouseShowPassword(MouseEvent event) {
        idShowPassword.setText("Mostrar contraseña");
    }

    @FXML
    public void pressButton(MouseEvent event) {
        idButton.setText("Botón pulsado");

    }

    @FXML
    public void soltarButton(MouseEvent event) {
        idButton.setText("Guardar");
    }

    @FXML
    public void onKeyPressed(KeyEvent key) {
        idShowPassword.setText(key.getCharacter());
    }

}
