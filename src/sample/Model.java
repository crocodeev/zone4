package sample;

import jssc.SerialPortList;

public class Model {

    public String[] getPortList(){

        String[] portList;
        String[] noPortList = new String[]{"No Connection"};

        portList = SerialPortList.getPortNames();

        if(portList.length > 0){
            return portList;
        }else{
            return noPortList;
        }
    }


}
