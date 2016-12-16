package org.unitec.mavenmysql;
import java.sql.*;
public class DAOtablita {
    /**
     * 
     * @param t este argumento es el objeto de tipo tablita que deseas guardar
     * @throws Exception 
     */
    public static void guardar(Tablita t) throws Exception{
        //Paso 1 conectarnos a mysql
        Connection con=Conexion.conectarse("root",null);
        //Paso 2 generar el statement de sql con la conexion
        PreparedStatement pr=con.prepareStatement("insert into tablita(nombre, sueldo) values(?,?)");
        pr.setString(1,t.getNombre());
        pr.setFloat(2,t.getSueldo());
        pr.execute();
        System.out.println("Objeto tablita guardado con exito");
        
    }
    public static Tablita buscarID(int id) throws Exception{
        Connection con=Conexion.conectarse("root",null);
        Statement st=con.createStatement();
        Tablita t=new Tablita();
        ResultSet res=st.executeQuery("SELECT * FROM TABLITA WHERE ID="+id);
        while(res.next()){
            //A esto se le llama mapeo
            t.setId(id);
            t.setNombre(res.getString("nombre"));
            t.setSueldo(res.getFloat("sueldo"));
        }
        return t;
    }
}
