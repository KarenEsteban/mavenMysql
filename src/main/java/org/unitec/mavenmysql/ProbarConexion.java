package org.unitec.mavenmysql;

import java.sql.*;

public class ProbarConexion {
    public static void main(String[] args) {
        try{
            //Connection con=Conexion.conectarse("root", null);
            //Generamos un objeto de tipo Tablita
            Tablita t=new Tablita("Karen",90000f);
            DAOtablita.guardar(t);
        }catch(Exception e){
            System.out.println(e.getMessage());   
        }
    }
}
