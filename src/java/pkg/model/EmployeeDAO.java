/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import pkg.model.Employee;

/**
 *
 * @author hp
 */
public class EmployeeDAO {
    Connection conn;
    PreparedStatement psmt;
    ResultSet rs;
    public Connection setConnect(){
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost;database=Northwind";
        String user = "sa";
        String password = "123";
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return conn;
    }
    
    public int removeEmp(String id){
        int status = 0;
        conn = setConnect();
        String sql = "DELETE Employee WHERE EmployeeID=?";
        try {
            psmt =conn.prepareStatement(sql);
            psmt.setString(1, id);
            
            status = psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return  status;
    }
}
