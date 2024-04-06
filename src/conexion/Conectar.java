/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author santi
 */
public class Conectar {
    Connection conectar=null;
    public Connection conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/biblioteca","root","");
        }catch(Exception e){
            System.out.print(e.getMessage());
                    
        }
        return conectar;
    }
}
