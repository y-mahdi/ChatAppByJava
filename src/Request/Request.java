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
public class Request implements RequestDAO<Object>,Serializable{
    String Type;
    Object Req;
    public Request(Object Request,String type){
        this.Type=Type;
        this.Req=Request;
    }
    @Override
    public String getType() {
        return Type;
    }

    @Override
    public Object getRequestContent() {
        return Req;
    }
    
}
