/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Request;

import Conversation.Conversation;
import java.io.Serializable;

/**
 *
 * @author AZA
 */
public class conversationPost implements postRequestDAO<Conversation>,Serializable{
    Conversation Conversation;
    String type="postConv";
    public conversationPost(Conversation conversation){
        this.Conversation=conversation;
    }
    @Override
    public String getObjectType() {
        return type;
    }

    @Override
    public void setObjectType() {
        this.type=type;
    }

    @Override
    public Conversation getObject() {
        return Conversation;
    }
    
}
