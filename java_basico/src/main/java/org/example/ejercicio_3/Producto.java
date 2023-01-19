package org.example.ejercicio_3;

public class Producto {
    private String nombre;
    private double cantidad;
    private double valorUnitario;
    private double valorAntesIva;
    private double valorIva;
    private double valorTotal;

    public Producto() {
    }

    public Producto(String nombre, double valorUnitario) {
        this.nombre = nombre;
        this.valorUnitario = valorUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorAntesIva() {
        return valorAntesIva;
    }

    public void setValorAntesIva(double valorAntesIva) {
        this.valorAntesIva = valorAntesIva;
    }

    public double getValorIva() {
        return valorIva;
    }

    public void setValorIva(double valorIva) {
        this.valorIva = valorIva;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
