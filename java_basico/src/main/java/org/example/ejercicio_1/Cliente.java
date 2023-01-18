package org.example.ejercicio_1;

public class Cliente {
    private String nombre;
    private Integer cedula;

    public Cliente(String nombre, Integer cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public Cliente() {
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
}
