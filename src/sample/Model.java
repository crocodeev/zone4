package sample;

import com.fazecast.jSerialComm.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;

import java.io.IOException;

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

    public void sendCommand (String portName) {

        SerialPort serialPort = SerialPort.getCommPort(portName);
        serialPort.setComPortParameters(9600,8,1,0);
        serialPort.setComPortTimeouts(SerialPort.TIMEOUT_NONBLOCKING,0,0);

        serialPort.openPort();
        try {
            serialPort.getOutputStream().write("$aM01".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        serialPort.closePort();

    }



}