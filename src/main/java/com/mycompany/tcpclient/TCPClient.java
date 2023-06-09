/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tcpclient;

import com.mycompany.fileutil.FileUtil;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author SamNar
 */
public class TCPClient {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 6789);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        byte[] bytes = FileUtil.readBytes("C:\\Users\\SamNar\\Desktop\\Foto\\cvfotojpg.jpg");
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
        //outputStream.write("Salam".getBytes());
        socket.close();
    }
}
