/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketServer;

import Request.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author AZA
 */
public class SocketServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        while(true){
            new Thread(new SocketMultiThread()).start();
        }
        
    }
}
