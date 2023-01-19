package org.example.ejercicio_2;

public class ClienteEj2 {
    private String nombre;
    private Integer cedula;

    public ClienteEj2(String nombre, Integer cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public ClienteEj2() {
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
