package org.example.ejercicio_1;




public class Tools {

    public static Boolean validadorNombre(String nombre) {
        boolean esNumero = (nombre != null && !nombre.matches("[0-9]+") && nombre.matches("[a-z]+"));
        return esNumero;
    }


}


