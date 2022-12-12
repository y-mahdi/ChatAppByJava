/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversation;

/**
 *
 * @author AZA
 */
public class Conversation implements ConversationDAO{
    private String Message,Sender,Receiver,Time;
    public Conversation(String Message,String Sender,String Receiver,String Time){
        this.Message=Message;
        this.Receiver=Receiver;
        this.Sender=Sender;
        this.Time=Time;
    }
    
    @Override
    public String getMessage() {
        return Message;
    }

    @Override
    public String getSender() {
        return Sender;
    }

    @Override
    public String getReceiver() {
        return Receiver;
    }

    @Override
    public String getTime() {
        return Time;
    }
    
}
