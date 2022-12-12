/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author AZA
 */
public class user implements userDAO{
    private String FirstName,LastName,username,password;
    public user(String FirstName,String LastName,String username,String password){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.username=username;
        this.password=password;
    }
    @Override
    public String getLName() {
        return LastName;
    }

    @Override
    public String getFName() {
        return FirstName;
    }

    @Override
    public String getPwd() {
        return password;
    }

    @Override
    public String getUserName() {
        return username;
    }
    
}
