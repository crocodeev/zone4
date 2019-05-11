package sample;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Controller {

    Model model = new Model();

    @FXML
    private TextField output;
    @FXML
    private ChoiceBox portList;


    @FXML
    private void submit(ActionEvent actionEvent) {

        String[] list = model.getPortList();

        System.out.println(list[0]);

        portList.getItems().addAll(list);
    }

}
