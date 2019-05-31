package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;


public class Controller {

    Model model = new Model();


    //first box

        //input selectors
    @FXML private RadioButton zone1sourceA;
    @FXML private RadioButton zone1sourceB;
    @FXML private RadioButton zone1sourceC;
    @FXML private RadioButton zone1sourceD;

    private ToggleGroup inputSelectorZone1 = new ToggleGroup();

    @FXML private RadioButton zone2sourceA;
    @FXML private RadioButton zone2sourceB;
    @FXML private RadioButton zone2sourceC;
    @FXML private RadioButton zone2sourceD;

    private ToggleGroup inputSelectorZone2= new ToggleGroup();

    @FXML private RadioButton zone3sourceA;
    @FXML private RadioButton zone3sourceB;
    @FXML private RadioButton zone3sourceC;
    @FXML private RadioButton zone3sourceD;

    private ToggleGroup inputSelectorZone3= new ToggleGroup();

    @FXML private RadioButton zone4sourceA;
    @FXML private RadioButton zone4sourceB;
    @FXML private RadioButton zone4sourceC;
    @FXML private RadioButton zone4sourceD;

    private ToggleGroup inputSelectorZone4= new ToggleGroup();


    @FXML private Text indicatorZone1;
    @FXML private Text indicatorZone2;
    @FXML private Text indicatorZone3;
    @FXML private Text indicatorZone4;

    @FXML private Slider sliderVolMusZone1;
    @FXML private Slider slidervolMicZone1;
    @FXML private Slider sliderVolMusZone2;
    @FXML private Slider slidervolMicZone2;
    @FXML private Slider sliderVolMusZone3;
    @FXML private Slider slidervolMicZone3;
    @FXML private Slider sliderVolMusZone4;
    @FXML private Slider slidervolMicZone4;

    @FXML private Label labelZone1;
    @FXML private Label labelZone2;
    @FXML private Label labelZone3;
    @FXML private Label labelZone4;





    //main

    @FXML
    private ChoiceBox portList;


    //methods


    public void initialize(){
        this.zone1sourceA.setToggleGroup(inputSelectorZone1);
        this.zone1sourceB.setToggleGroup(inputSelectorZone1);
        this.zone1sourceC.setToggleGroup(inputSelectorZone1);
        this.zone1sourceD.setToggleGroup(inputSelectorZone1);

        this.zone2sourceA.setToggleGroup(inputSelectorZone2);
        this.zone2sourceB.setToggleGroup(inputSelectorZone2);
        this.zone2sourceC.setToggleGroup(inputSelectorZone2);
        this.zone2sourceD.setToggleGroup(inputSelectorZone2);

        this.zone3sourceA.setToggleGroup(inputSelectorZone3);
        this.zone3sourceB.setToggleGroup(inputSelectorZone3);
        this.zone3sourceC.setToggleGroup(inputSelectorZone3);
        this.zone3sourceD.setToggleGroup(inputSelectorZone3);

        this.zone4sourceA.setToggleGroup(inputSelectorZone4);
        this.zone4sourceB.setToggleGroup(inputSelectorZone4);
        this.zone4sourceC.setToggleGroup(inputSelectorZone4);
        this.zone4sourceD.setToggleGroup(inputSelectorZone4);

        this.showAvPorts();
    }

    private void showAvPorts () {

        String[] list = model.getPortList();

        portList.getItems().addAll(list);
    }

    @FXML
    private void send(ActionEvent actionEvent) {

        String portNameRaw = portList.getValue().toString();

        String portNameCut = portNameRaw.substring(portNameRaw.length()-5, portNameRaw.length()-1);

        //model.sendCommand(portNameCut);

    }


    // ZONE1




    public void setInputSelectorZone1 () {

        if(this.inputSelectorZone1.getSelectedToggle().equals(this.zone1sourceA))
        {
            String command = commandCreator("1", "S", "04");
            String port = getPortName();
            model.sendCommand(port, command);
        }
        if(this.inputSelectorZone1.getSelectedToggle().equals(this.zone1sourceB))
        {
            String command = commandCreator("1", "S", "03");
            String port = getPortName();
            model.sendCommand(port, command);
        }
        if(this.inputSelectorZone1.getSelectedToggle().equals(this.zone1sourceC))
        {
            String command = commandCreator("1", "S", "02");
            String port = getPortName();
            model.sendCommand(port, command);
        }
        if(this.inputSelectorZone1.getSelectedToggle().equals(this.zone1sourceD))
        {
            String command = commandCreator("1", "S", "01");
            String port = getPortName();
            model.sendCommand(port, command);
        }
    }

    // ZONE2

    public void setInputSelectorZone2 () {

        if(this.inputSelectorZone2.getSelectedToggle().equals(this.zone2sourceA))
        {
            String command = commandCreator("2", "S", "04");
            String port = getPortName();
            model.sendCommand(port, command);
        }
        if(this.inputSelectorZone2.getSelectedToggle().equals(this.zone2sourceB))
        {
            String command = commandCreator("2", "S", "03");
            String port = getPortName();
            model.sendCommand(port, command);
        }
        if(this.inputSelectorZone2.getSelectedToggle().equals(this.zone2sourceC))
        {
            String command = commandCreator("2", "S", "02");
            String port = getPortName();
            model.sendCommand(port, command);
        }
        if(this.inputSelectorZone2.getSelectedToggle().equals(this.zone2sourceD))
        {
            String command = commandCreator("2", "S", "01");
            String port = getPortName();
            model.sendCommand(port, command);
        }
    }

    // ZONE3

    public void setInputSelectorZone3 () {

        if(this.inputSelectorZone3.getSelectedToggle().equals(this.zone3sourceA))
        {
            String command = commandCreator("3", "S", "04");
            String port = getPortName();
            model.sendCommand(port, command);
        }
        if(this.inputSelectorZone3.getSelectedToggle().equals(this.zone3sourceB))
        {
            String command = commandCreator("3", "S", "03");
            String port = getPortName();
            model.sendCommand(port, command);
        }
        if(this.inputSelectorZone3.getSelectedToggle().equals(this.zone3sourceC))
        {
            String command = commandCreator("3", "S", "02");
            String port = getPortName();
            model.sendCommand(port, command);
        }
        if(this.inputSelectorZone3.getSelectedToggle().equals(this.zone3sourceD))
        {
            String command = commandCreator("3", "S", "01");
            String port = getPortName();
            model.sendCommand(port, command);
        }
    }

    // ZONE4

    public void setInputSelectorZone4 () {

        if(this.inputSelectorZone4.getSelectedToggle().equals(this.zone4sourceA))
        {
            String command = commandCreator("4", "S", "04");
            String port = getPortName();
            model.sendCommand(port, command);
        }
        if(this.inputSelectorZone4.getSelectedToggle().equals(this.zone4sourceB))
        {
            String command = commandCreator("4", "S", "03");
            String port = getPortName();
            model.sendCommand(port, command);
        }
        if(this.inputSelectorZone4.getSelectedToggle().equals(this.zone4sourceC))
        {
            String command = commandCreator("4", "S", "02");
            String port = getPortName();
            model.sendCommand(port, command);
        }
        if(this.inputSelectorZone4.getSelectedToggle().equals(this.zone4sourceD))
        {
            String command = commandCreator("4", "S", "01");
            String port = getPortName();
            model.sendCommand(port, command);
        }
    }

    //ALL

    @FXML
    private void setMusVolZone(MouseEvent mouseEvent) {

        String port = getPortName();

        Slider s = (Slider) mouseEvent.getSource();
        String value = String.valueOf(Math.round(s.getValue()));
        String id = s.getId().substring(16);

        displayVolume(id,value);
        displayLabel(id, "mus volume");

        String command = commandCreator(id, "V",value);
        model.sendCommand(port, command);

    }

    @FXML
    private void setMicVolZone(MouseEvent mouseEvent) {

        String port = getPortName();

            Slider s = (Slider) mouseEvent.getSource();
            String value = String.valueOf(Math.round(s.getValue()));
            String id = s.getId().substring(16);

            displayVolume(id,value);
            displayLabel(id, "mic volume");

            String command = commandCreator(id, "C", value);
            model.sendCommand(port, command);


    }


    // MUTE

    @FXML
    private void muteMusZone (ActionEvent actionEvent) {

        String port = getPortName();

        ToggleButton mute = (ToggleButton) actionEvent.getSource();
        boolean isSelected = mute.isSelected();
        String id = mute.getId().substring(11);


        if (isSelected){
            String command = commandCreator(id, "M", "01");
            model.sendCommand(port, command);
            mute.setStyle("-fx-background-color: red");
        }else{
            String command = commandCreator(id, "M", "02");
            model.sendCommand(port, command);
            mute.setStyle("-fx-background-color: white");
        }
    }

    @FXML
    private void muteMicZone (ActionEvent actionEvent) {

        String port = getPortName();

        ToggleButton mute = (ToggleButton) actionEvent.getSource();
        boolean isSelected = mute.isSelected();
        String id = mute.getId().substring(11);


        if (isSelected){
            String command = commandCreator(id, "M", "03");
            model.sendCommand(port, command);
            mute.setStyle("-fx-background-color: red");
        }else{
            String command = commandCreator(id, "M", "04");
            model.sendCommand(port, command);
            mute.setStyle("-fx-background-color: white");
        }
    }


    //SYNC



  /*  @FXML
    private void syncData(){

        String port = getPortName();

        model.sendCommand(port, "$aM03");
        String answer = model.getAnswer();


    }
*/

    //UTILS

    private void displayVolume(String id, String value){


        switch (id){
            case "1": indicatorZone1.setText(value);
                        break;
            case "2": indicatorZone2.setText(value);
                break;
            case "3": indicatorZone3.setText(value);
                break;
            case "4": indicatorZone4.setText(value);
                break;
            default: indicatorZone1.setText("ER");
                        break;
        }
    }

    private void displayLabel(String id, String value){


        switch (id){
            case "1": labelZone1.setText(value);
                break;
            case "2": labelZone2.setText(value);
                break;
            case "3": labelZone3.setText(value);
                break;
            case "4": labelZone4.setText(value);
                break;
            default: labelZone1.setText("error");
                break;
        }
    }

    private String commandCreator (String id, String cmd, String value){

        String command;

        switch (id){
            case "1": command = "$a"+cmd+value;
                        break;
            case "2": command = "$b"+cmd+value;
                break;
            case "3": command = "$c"+cmd+value;
                break;
            case "4": command = "$d"+cmd+value;
                break;
            default: command = "0";
                        break;
        }

        return command;
    }

    private String getPortName() {

        if ( portList.getValue() == null ) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("No one port selected");
            alert.showAndWait();
        }

        String portNameRaw = portList.getValue().toString();

        String portNameCut = portNameRaw.substring(portNameRaw.length()-5, portNameRaw.length()-1);

        return portNameCut;
    }
}
