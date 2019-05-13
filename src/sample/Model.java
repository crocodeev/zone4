package sample;

import com.fazecast.jSerialComm.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;

public class Model {

    public String[] getPortList() {

        String[] portList;
        String[] noPortList = new String[]{"No Connection"};

        portList = SerialPortList.getPortNames();



        if (portList.length > 0) {
            return portList;
        } else {
            return noPortList;
        }
    }

    public void sendCommand(String comName) {

        Integer message = 1;
        byte messageInByte = message.byteValue();

        SerialPort serialPort = SerialPort.getCommPort(comName);
        serialPort.setComPortParameters(9600,8,1,0);
        //serialPort.setComPortTimeouts(SerialPort.TIMEOUT_WRITE_BLOCKING,0,0);

        serialPort.openPort();
        serialPort.getOutputStream().write(messageInByte);
        serialPort.closePort();


    }

    public com.fazecast.jSerialComm.SerialPort[] getAnothePortList(){

        com.fazecast.jSerialComm.SerialPort[] pList = com.fazecast.jSerialComm.SerialPort.getCommPorts();

        return pList;
    }
}