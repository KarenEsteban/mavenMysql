package org.unitec.mavenmysql;

public class Tablita {
    private Integer id;
    private String nombre;
    private Float sueldo;
    
    //Inicializar atributos
    public Tablita(String nombre, Float sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    //Constructor de defecto
    public Tablita() {
    }
    
    //Encapsular atributos
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }
    
}
