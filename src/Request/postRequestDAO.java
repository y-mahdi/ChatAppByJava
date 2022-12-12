/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Request;

/**
 *
 * @author AZA
 */
public interface postRequestDAO<T> {
    
    public String getObjectType();
    public void setObjectType();
    public T getObject();
    
}
