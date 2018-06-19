/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.*;

/**
 *
 * @author Chasmer
 */
public class DBConnect {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DBConnect()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            this.con = DriverManager.getConnection("jdbc:mysql://szuflandia.pjwstk.edu.pl:3306/s17100","s17100","Mat.Rus");
            System.out.println("Udane polaczenie!");
        }
        catch(Exception e)
        {
            System.out.println("Error:" + e);
        }
    }
}
