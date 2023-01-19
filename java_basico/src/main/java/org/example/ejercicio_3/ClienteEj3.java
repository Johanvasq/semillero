package org.example.ejercicio_3;

import java.util.ArrayList;

public class ClienteEj3 {
    private String nombre;
    private Integer cedula;

    private ArrayList<Producto> productos;

    public ClienteEj3(String nombre, Integer cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public ClienteEj3() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre = '" + nombre + '\'' +
                ", cedula = " + cedula +
                '}';
    }
}
