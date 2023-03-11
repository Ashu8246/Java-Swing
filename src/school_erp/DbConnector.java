/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_erp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ashu
 */
public class DbConnector {
    
    static Connection con =null;
    static Statement st = null;
    
    /**
     *
     */
    public void Connection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","root");
            System.out.println("Connected");
            
            
        }
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
    }


}