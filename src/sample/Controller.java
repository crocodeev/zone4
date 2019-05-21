package sample;

import com.intellij.jarRepository.services.artifactory.Endpoint;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

import java.net.URL;

public class Controller {

    Model model = new Model();

    //first box

        //input selectors
    @FXML private RadioButton zone1sourceA;
    @FXML private RadioButton zone1sourceB;
    @FXML private RadioButton zone1sourceC;
    @FXML private RadioButton zone1sourceD;

    private ToggleGroup inputSelectorZone1 = new ToggleGroup();






    //main

    @FXML
    private ChoiceBox portList;

    @FXML
    private Button getInfo;

    //methods


    public void initialize(){
        this.zone1sourceA.setToggleGroup(inputSelectorZone1);
        this.zone1sourceB.setToggleGroup(inputSelectorZone1);
        this.zone1sourceC.setToggleGroup(inputSelectorZone1);
        this.zone1sourceD.setToggleGroup(inputSelectorZone1);
    }

    @FXML
    private void submit(ActionEvent actionEvent) {

        String[] list = model.getPortList();

        System.out.println(list[0]);

        portList.getItems().addAll(list);
    }

    @FXML
    private void send(ActionEvent actionEvent) {

        String portName = portList.getValue().toString();

        model.sendCommand(portName);

    }


    // ZONE1

    public void setInputSelectorZone1 () {

        if(this.inputSelectorZone1.getSelectedToggle().equals(this.zone1sourceA))
            System.out.println("A");
        if(this.inputSelectorZone1.getSelectedToggle().equals(this.zone1sourceB))
            System.out.println("B");
        if(this.inputSelectorZone1.getSelectedToggle().equals(this.zone1sourceC))
            System.out.println("C");
        if(this.inputSelectorZone1.getSelectedToggle().equals(this.zone1sourceD))
            System.out.println("D");
    }

}
