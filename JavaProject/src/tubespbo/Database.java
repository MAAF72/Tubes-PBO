/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Altair
 */
public class Database {
    private final String URL = "jdbc:mysql://localhost:3306/autograder";
    private final String USER = "root";
    private final String PASS = "";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private Connection conn;
    private Statement stmt;
    
    public void connect() {
        if (conn == null) {
            try {
                Class.forName(DRIVER);
                conn = DriverManager.getConnection(URL, USER, PASS);
                
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            } catch (ClassNotFoundException ex) {
                System.out.println("JDBC Driver not found");
            }
        }
    }
    
    public void close() {
        try {
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error when closing connection");
        }
    }
    
    public int update(String sql) {
        int rs = -1;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Gagal update :" + sql);
        }
        return rs;
    }
    
    public ResultSet query(String sql) {
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("Gagal query :" + sql);
        }
        return rs;
    }
}
