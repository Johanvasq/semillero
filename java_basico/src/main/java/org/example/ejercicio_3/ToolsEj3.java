package org.example.ejercicio_3;



import java.util.ArrayList;
import java.util.Scanner;

public class ToolsEj3 {

    public static Boolean validadorNombre(String nombre) {
        boolean esNumero = (nombre != null && !nombre.matches("[0-9]+")
                && nombre.matches("[a-z]+") && nombre.matches("[A-Z]+"));
        return esNumero;
    }

    public static ClienteEj3 guardarCliente(){
        Scanner sc  = new Scanner(System.in);
        try{
            System.out.println("Ingrese el nombre del cliente: ");
            String nombre = sc.nextLine();
            if (ToolsEj3.validadorNombre(nombre)) {
                System.out.println("Ingrese la cedula del cliente: ");
                Integer cedula = Integer.parseInt(sc.nextLine());
                System.out.println("Cliente guardado");
                ClienteEj3 guardado = new ClienteEj3(nombre, cedula);
                return guardado;
            }else {
                throw new Exception();
            }
        }catch (Exception e){
            return null;
        }
    }

    public static Boolean validarCedula(ClienteEj3 cliente, ArrayList<ClienteEj3> clientes) {
        for (ClienteEj3 c : clientes) {
            if (c.getCedula() == cliente.getCedula()) {
                System.out.println("La cedula ya existe");
                return false;
            }
        }
        return true;
    }

}


