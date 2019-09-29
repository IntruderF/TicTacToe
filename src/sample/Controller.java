package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;

    private List<Button> buttonList;
    private boolean xTurn;

    public void initialize() {
        buttonList = new ArrayList<>();
        buttonList.add(btn1);
        buttonList.add(btn2);
        buttonList.add(btn3);
        buttonList.add(btn4);
        buttonList.add(btn5);
        buttonList.add(btn6);
        buttonList.add(btn7);
        buttonList.add(btn8);
        buttonList.add(btn9);

        xTurn = true;
    }

    public void buttonClicked(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        if (clickedButton.getText().equals("")) {
            if (xTurn) {
                clickedButton.setText("x");
                isOver();
                xTurn = !xTurn;
            } else {
                clickedButton.setText("o");
                isOver();
                xTurn = !xTurn;
            }
        }
    }

    private void isOver() {
        if (btn1.getText().equals("x") && btn2.getText().equals("x") && btn3.getText().equals("x") ||
                btn4.getText().equals("x") && btn5.getText().equals("x") && btn6.getText().equals("x") ||
                btn7.getText().equals("x") && btn8.getText().equals("x") && btn9.getText().equals("x") ||
                btn1.getText().equals("x") && btn4.getText().equals("x") && btn7.getText().equals("x") ||
                btn2.getText().equals("x") && btn5.getText().equals("x") && btn8.getText().equals("x") ||
                btn3.getText().equals("x") && btn6.getText().equals("x") && btn9.getText().equals("x") ||
                btn1.getText().equals("x") && btn5.getText().equals("x") && btn9.getText().equals("x") ||
                btn3.getText().equals("x") && btn5.getText().equals("x") && btn7.getText().equals("x")) {
            for (Button button : buttonList) {
                button.setDisable(true);
            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Game over");
            alert.setHeaderText(null);
            alert.setContentText("x is the winner");
            alert.showAndWait();
        } else if (btn1.getText().equals("o") && btn2.getText().equals("o") && btn3.getText().equals("o") ||
                btn4.getText().equals("o") && btn5.getText().equals("o") && btn6.getText().equals("o") ||
                btn7.getText().equals("o") && btn8.getText().equals("o") && btn9.getText().equals("o") ||
                btn1.getText().equals("o") && btn4.getText().equals("o") && btn7.getText().equals("o") ||
                btn2.getText().equals("o") && btn5.getText().equals("o") && btn8.getText().equals("o") ||
                btn3.getText().equals("o") && btn6.getText().equals("o") && btn9.getText().equals("o") ||
                btn1.getText().equals("o") && btn5.getText().equals("o") && btn9.getText().equals("o") ||
                btn3.getText().equals("o") && btn5.getText().equals("o") && btn7.getText().equals("o")) {
            for (Button button : buttonList) {
                button.setDisable(true);
            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Game over");
            alert.setHeaderText(null);
            alert.setContentText("o is the winner");
            alert.showAndWait();
        }
    }
}
