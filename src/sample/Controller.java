package sample;

import com.intellij.jarRepository.services.artifactory.Endpoint;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Controller {

    Model model = new Model();


    @FXML
    private ChoiceBox portList;


    @FXML
    private void submit(ActionEvent actionEvent) {

        //String[] list = model.getPortList();

        //System.out.println(list[0]);

        Object[] list = model.getAnothePortList();

        portList.getItems().addAll(list);
    }

    @FXML
    private void send(ActionEvent actionEvent) {

        String comName = portList.getValue().toString();

        model.sendCommand(comName);

    }
}
