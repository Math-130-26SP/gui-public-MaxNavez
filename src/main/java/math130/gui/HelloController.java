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
    private TextField shots;
    @FXML
    private TextField shotsOnTarget;
    @FXML
    private TextField shotPer;
    @FXML
    private TextField dribbles;
    @FXML
    private TextField completedDribbles;
    @FXML
    private TextField dribblesPer;
    @FXML
    private TextField aerialDuels;
    @FXML
    private TextField aerialDuelsWon;
    @FXML
    private TextField aerialPer;
    @FXML
    private TextField tackles;
    @FXML
    private TextField succesfulTackles;
    @FXML
    private TextField tacklePer;
    @FXML
    private TextField matchImpactScore;


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
        System.out.println(shots.getText());
        System.out.println(shotsOnTarget.getText());
        System.out.println(shotPer.getText());
        System.out.println(dribbles.getText());
        System.out.println(completedDribbles.getText());
        System.out.println(dribblesPer.getText());
        System.out.println(aerialDuels.getText());
        System.out.println(aerialDuelsWon.getText());
        System.out.println(aerialPer.getText());
        System.out.println(tackles.getText());
        System.out.println(succesfulTackles.getText());
        System.out.println(tacklePer.getText());
        System.out.println(matchImpactScore.getText());

    double totals = Double.parseDouble(passes.getText());
    double completed = Double.parseDouble(completedPasses.getText());
        if (totals > 0) {
            double porcentaje = (completed / totals) * 100;
            passPer.setText(String.format("%.2f%%", porcentaje));
        } else {
            passPer.setText("0%");
        }
    }
}