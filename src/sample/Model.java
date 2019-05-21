package sample;

import b.d.f.S;
import com.fazecast.jSerialComm.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

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

        /*SerialPort serialPort = SerialPort.getCommPort(portName);
        serialPort.setComPortParameters(9600,8,1,0);
        serialPort.setComPortTimeouts(SerialPort.TIMEOUT_NONBLOCKING,0,0);

        serialPort.openPort();
        try {
            serialPort.getOutputStream().write("$aM01".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        serialPort.closePort();*/

        jssc.SerialPort serialPort = new jssc.SerialPort(portName);
        try{
            serialPort.openPort();
            serialPort.setParams(jssc.SerialPort.BAUDRATE_9600, jssc.SerialPort.DATABITS_8, jssc.SerialPort.STOPBITS_1, jssc.SerialPort.PARITY_NONE);
            serialPort.writeBytes("aM01".getBytes());
            serialPort.closePort();
        } catch (SerialPortException e) {
            e.printStackTrace();
        }


    }





}