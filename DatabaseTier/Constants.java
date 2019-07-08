/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseTier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Windows
 */
public enum Constants {
    CONNECTOR();


    static private final String JDBC_LOCATION="jdbc:mysql://localhost:3306/sure";
    static private final String JDBC_USERNAME="root";
    static private final String JDBC_PASSWORD="sure";
    static public Connection connector;
    static public Statement state;
    static public ResultSet result;
    static public PreparedStatement prepared;
    static{
        try {
            connector=DriverManager.getConnection(JDBC_LOCATION,JDBC_USERNAME,JDBC_PASSWORD);
            state=connector.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);  
        } catch (SQLException ex) {
            Logger.getLogger(Constants.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
}
