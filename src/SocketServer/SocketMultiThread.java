/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketServer;

import Request.Request;
import java.io.*;
import java.net.*;

/**
 *
 * @author AZA
 */
public class SocketMultiThread implements Runnable{
    public SocketMultiThread(){
    
    }
    @Override
    public void run() {
        try {
            Request Req;
            RequestReceiver RequestReceiver;
            ServerSocket listen = new ServerSocket(5000);
            Socket connectionSocket = listen.accept();
            ObjectInputStream inputfromclient = new ObjectInputStream(connectionSocket.getInputStream());
            ObjectOutputStream outfromClient = new ObjectOutputStream(
            connectionSocket.getOutputStream());
            Req = (Request) inputfromclient.readObject();
            RequestReceiver=new RequestReceiver(Req);
            outfromClient.writeObject(RequestReceiver.getReqResult());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
