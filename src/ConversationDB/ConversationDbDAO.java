/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConversationDB;

import Conversation.Conversation;
import java.util.ArrayList;

/**
 *
 * @author AZA
 */
public interface ConversationDbDAO {
    public void addConversation(Conversation conversation);   
    public ArrayList<Conversation> getConversation(String user,String contact);
    
}
