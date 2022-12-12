/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketClient;

import Request.Request;

/**
 *
 * @author AZA
 */
public class SocketClient implements Runnable{
    Request Req;
    public SocketClient(Request Req){
        this.Req=Req;
    } 
    @Override
    public void run() {
        
    }
}
