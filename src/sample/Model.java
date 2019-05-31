package sample;


import com.fazecast.jSerialComm.SerialPort;


import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;


public class Model {

    public String[] getPortList() {

        String[] noPortList = new String[]{"No Connection"};

        //portList = SerialPortList.getPortNames();

        SerialPort[] allPorts = SerialPort.getCommPorts();

        String[] portList = new String [allPorts.length];

        for (int i = 0; i < allPorts.length; i++) {
            portList[i] = allPorts[i].getDescriptivePortName();
        }

        if (portList.length > 0) {
            return portList;
        } else {
            return noPortList;
        }
    }

    public void sendCommand (String portName, String message) {

        SerialPort serialPort = SerialPort.getCommPort(portName);
        serialPort.setComPortParameters(9600,8,1,0);
        serialPort.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER,0,0);

        serialPort.openPort();
        try {
            serialPort.getOutputStream().write(message.getBytes());
            serialPort.getOutputStream().flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        InputStream in = serialPort.getInputStream();

        System.out.println(serialPort.getNumDataBits());

        byte[] buffer = new byte[5];



            System.out.println(buffer);

        /*try
        {
            for (int j = 0; j < 10; ++j)
                System.out.print((char)in.read());
            in.close();
        } catch (Exception e) { e.printStackTrace(); }*/


        serialPort.closePort();

    }

}