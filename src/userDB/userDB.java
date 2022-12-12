/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userDB;
import DBConnection.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import user.user;

/**
 *
 * @author AZA
 */
public class userDB implements userDbDAO{
    Connection connection;
    Statement Sttmnt;
    ResultSet Result;
    public userDB(){
        try {
            connection =DBConnection.getInstance();
            Sttmnt=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);  
        } catch (Exception e) {
        }
        
    }
    @Override
    public void addUser(user user) {
        try {
            Sttmnt.executeUpdate("insert into userChat values('"+user.getUserName()+"','"+user.getPwd()+"','"+user.getLName()+"','"+user.getFName()+"')");
        } catch (SQLException ex) {
            
        }
    }

    @Override
    public boolean login(String username, String password) {
        boolean var=true;
        try {
            Result=Sttmnt.executeQuery("select count(*) as cont from userChat where username="+username);
            while(Result.next()){
                if(Result.getInt("cont")==0){
                    var=false;
                }
                else{
                    Result=Sttmnt.executeQuery("select password from userChat where username="+username);
                    while(Result.next()){
                        if(Result.getString("password")==password){
                            var=true;
                        }
                        else{
                            var=false;
                        }
                    }
                }
            }
            
        } catch (Exception e) {
            
        }
        return var;
    }

    @Override
    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
