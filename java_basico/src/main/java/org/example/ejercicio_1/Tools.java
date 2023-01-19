package org.example.ejercicio_1;


import java.util.Scanner;

public class Tools {

    public static Boolean validadorNombre(String nombre) {
        boolean esNumero = (nombre != null && !nombre.matches("[0-9]+")
                && nombre.matches("[a-z]+"));
        return esNumero;
    }

    public static Cliente guardarCliente(){
        Scanner sc  = new Scanner(System.in);
        try{
            System.out.println("Ingrese el nombre del cliente: ");
            String nombre = sc.next().toLowerCase();
            if (Tools.validadorNombre(nombre)) {
                System.out.println("Ingrese la cedula del cliente: ");
                Integer cedula = Integer.parseInt(sc.nextLine());
                System.out.println("Cliente guardado");
                Cliente clienteGuardado = new Cliente(nombre, cedula);
                return clienteGuardado;
            }else {
                throw new Exception();
            }
        }catch (Exception e){
            return null;
        }
    }

    public static Integer scannerInt(){
        Scanner sc  = new Scanner(System.in);
        try{
            Integer i = Integer.parseInt(sc.next());
            return i;
        }catch (Exception e){
            return null;
        }
    }


}


