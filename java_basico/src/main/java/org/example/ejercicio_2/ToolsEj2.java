package org.example.ejercicio_2;

import java.util.ArrayList;
import java.util.Scanner;

public class ToolsEj2 {

    public static Boolean validadorNombre(String nombre) {
        boolean esNumero = (nombre != null && !nombre.matches("[0-9]+")
                && nombre.matches("[a-z]+") && nombre.matches("[A-Z]+"));
        return esNumero;
    }

    public static ClienteEj2 guardarCliente(){
        Scanner sc  = new Scanner(System.in);
        try{
            System.out.println("Ingrese el nombre del cliente: ");
            String nombre = sc.nextLine();
            if (ToolsEj2.validadorNombre(nombre)) {
                System.out.println("Ingrese la cedula del cliente: ");
                Integer cedula = Integer.parseInt(sc.nextLine());
                System.out.println("Cliente guardado");
                ClienteEj2 guardado = new ClienteEj2(nombre, cedula);
                return guardado;
            }else {
                throw new Exception();
            }
        }catch (Exception e){
            return null;
        }
    }

    public static Boolean validarCedula(ClienteEj2 cliente, ArrayList<ClienteEj2> clientes) {
        for (ClienteEj2 c : clientes) {
            if (c.getCedula() == cliente.getCedula()) {
                System.out.println("La cedula ya existe");
                return false;
            }
        }
        return true;
    }

}


