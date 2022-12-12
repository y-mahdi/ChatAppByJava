/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConversationDB;

import Conversation.Conversation;
import java.util.ArrayList;
import DBConnection.DBConnection;
import java.sql.*;
/**
 *
 * @author AZA
 */
public class ConversationDB implements ConversationDbDAO{
    Connection connection;
    ResultSet Result;
    Statement Statement;
    
    public ConversationDB(){
        try {
           connection =DBConnection.getInstance();
           Statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY); 
        } catch (Exception e) {
        }
        
    }
    @Override
    public void addConversation(Conversation conversation) {
        try {
            Statement.executeUpdate("insert into userChat values('"+conversation.getMessage()+"','"+conversation.getSender()+"','"+conversation.getSender()+"')");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Conversation> getConversation(String user, String contact) {
        ArrayList<Conversation> ListConversation =new ArrayList<Conversation>();
        try {
            Result=Statement.executeQuery("select message,Sender,Receiver,time_con from conversations where sender in ('"+user+"','"+contact+"') and Receiver in ('"+user+"','"+contact+"')");
            while(Result.next()){
                ListConversation.add(new Conversation(Result.getString("message"),Result.getString("Sender"),Result.getString("Receiver"),Result.getString("time_con")));
            }
        } catch (Exception e) {
        }
        return ListConversation;
    }
    
}
