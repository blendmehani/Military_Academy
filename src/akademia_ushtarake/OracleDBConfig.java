/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akademia_ushtarake;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Blendi
 */
public class OracleDBConfig {
     public static Connection getConnection() {
       Connection connection = null;
       try{
       Class.forName("oracle.jdbc.driver.OracleDriver");
       connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:fiekdb", "akademiaushtarake", "Blendi261195");     
       }
       catch(Exception e){
           e.printStackTrace();
       }
       return connection;      
               }
    
}
