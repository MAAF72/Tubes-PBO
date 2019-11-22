/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Altair
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Database db = new Database();
        db.connect();
        db.update("UPDATE TASK SET Description='AHAHA' WHERE ID=1");
        try (ResultSet rs = db.query("SELECT * FROM Task")) {
            while (rs != null && rs.next()) {
                System.out.println(rs.getInt("ID") + " " + rs.getString("Name"));
                try (ResultSet rs2 = db.query("SELECT * FROM SUBMISSION WHERE TaskID=" + rs.getInt("ID"))) {
                    while (rs2 != null && rs2.next()) {
                        System.out.println(rs2.getInt("ID") + " " + rs2.getInt("TaskID") + " " + rs2.getString("Language") + " " + rs2.getString("Status") + " " + rs2.getString("Score"));
                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println("Fail Query z :" + ex.getMessage());
        }
    }
    
}
