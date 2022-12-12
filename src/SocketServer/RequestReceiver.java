/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketServer;

import Conversation.Conversation;
import Request.*;
import java.sql.*;


/**
 *
 * @author AZA
 */
public class RequestReceiver{
    
    ResultSet Result;
    public RequestReceiver(Request Req){
        Connection Conn;
        Statement St;
        try {
            Conn=DBConnection.DBConnection.getInstance();
            St=Conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            if(Req.getType()=="getConv"){
            ConversationGet Conversationinfo=(ConversationGet) Req.getRequestContent();
            Result=St.executeQuery("select * from conversations where Receiver='"+Conversationinfo.getOwner()+"' or Sender='"+Conversationinfo.getOwner()+"'");
            
        }
        else if(Req.getType()=="postConv"){
            conversationPost ConvPost=(conversationPost)Req.getRequestContent();
            Conversation val=ConvPost.getObject();
            Result = St.executeQuery("insert into conversation values('"+val.getMessage()+"','"+val.getSender()+"','"+val.getReceiver()+"')");
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        
        
        
    }
    public ResultSet getReqResult(){
        return Result;
    }
}
