package org.unitec.mavenmysql;
import java.sql.*;

public class Conexion {
    //Creamos un metodo para conectarnos 
    public static Connection conectarse(String usuario, String password)throws Exception{
        //Generamos un String que es la cadena de conexion
        String url="jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull";
        //Cargamos el driver
        Class.forName("com.mysql.jdbc.Driver");
        //Conectarnos
        Connection con= DriverManager.getConnection(url,usuario,null);
        System.out.println("Conectado con exito");
        return con;    
    }
    
}
