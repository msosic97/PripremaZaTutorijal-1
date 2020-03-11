package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
    public TextField nameField;
    public TextField emailField;
    public PasswordField passField;

    public void Button(ActionEvent actionEvent) {
        nameField.setText("Muhamed");
        emailField.setText("msosic1@etf.unsa.ba");
        passField.setText("0000");
    }
}
//Zbog vjezbe dodao sam neke actions za Button