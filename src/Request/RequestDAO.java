/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Request;

/**
 *
 * @author AZA
 * @param <T>
 */
public interface RequestDAO<T> {
    public String getType();
    public T getRequestContent();
    
}
