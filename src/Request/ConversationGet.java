/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Request;

import java.io.Serializable;

/**
 *
 * @author AZA
 */
public class ConversationGet implements getRequestDAO,Serializable{
    String Owner;
    String Type="getConv";
    public ConversationGet(String Owner){
        this.Owner=Owner;
    }

    @Override
    public String getType() {
        return Type;
    }

    

    @Override
    public String getOwner() {
        return Owner;
    }
}
