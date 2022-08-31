package network;

import java.io.*;
import java.net.Socket;
import java.util.Date;

public class SocketClientSample {
    public static void main(String[] args) {
        SocketClientSample sample = new SocketClientSample();
        sample.sendSocketSample();
    }

    public void sendSocketSample(){
        for (int loop = 0; loop < 3; loop++) {
            sendAndReceiveSocketData();

        }
        sendAndReceiveSocketData();
    }

    public void sendAndReceiveSocketData(){
        Socket socket = null;
        try{
            System.out.println("Client : Connecting");
            socket = new Socket("127.0.0.1",9999);
            System.out.println("Clinet : Connect Status = " + socket.isConnected());
            Thread.sleep(1000);
            byte[] readByte = new byte[256];
            InputStream stream = socket.getInputStream();
            BufferedInputStream in = new BufferedInputStream(stream);
            in.read(readByte);
            System.out.println("Client:received data="+new String(readByte).trim());
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
