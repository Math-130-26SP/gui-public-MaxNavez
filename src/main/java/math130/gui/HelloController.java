package math130.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField name;
    @FXML
    private TextField position;
    @FXML
    private TextField number;
    @FXML
    private TextField goals;
    @FXML
    private TextField assists;
    @FXML
    private TextField passes;
    @FXML
    private TextField completedPasses;
    @FXML
    private TextField passPer;

    @FXML
    protected void onEnter() {
        System.out.println(name.getText());
        System.out.println(position.getText());
        System.out.println(number.getText());
        System.out.println(goals.getText());
        System.out.println(assists.getText());
        System.out.println(passes.getText());
        System.out.println(completedPasses.getText());
        System.out.println(passPer.getText());

    }
}