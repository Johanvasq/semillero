package org.example.ejercicio_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Cliente cliente1 = new Cliente("Maria", 10);
        Cliente cliente2 = new Cliente("Pedro", 10);
        Cliente cliente3 = new Cliente("Carlos", 10);
        Cliente cliente4 = new Cliente("Sara", 10);

        Cliente clientes[] = new Cliente[4];
        clientes[0] = cliente1;
        clientes[1] = cliente2;
        clientes[2] = cliente3;
        clientes[3]= cliente4;


        Scanner sc = new Scanner(System.in);
        Boolean controlador = true;

        do {

            System.out.println("*********** Menú principal ********************");
            System.out.println("a. Añadir un nuevo cliente");
            System.out.println("b. Borrar un cliente");
            System.out.println("c. Buscar un cliente");
            System.out.println("d. Mostrar los clientes");
            System.out.println("e. salir");
            System.out.println("***********************************************");
            System.out.println("Ingrese una opción: ");

            String opcion = sc.nextLine();
            switch (opcion) {
                case "a":
                    try{
                        System.out.println("Ingrese el nombre del cliente: ");
                        String nombre = sc.nextLine();
                        if (Tools.validadorNombre(nombre)){
                            System.out.println("Ingrese la cedula del cliente: ");
                            Integer cedula = sc.nextInt();
                            System.out.println("Cliente guardado");
                            clientes = Arrays.copyOf(clientes, clientes.length + 1);
                            clientes[clientes.length - 1] = new Cliente(nombre, cedula);
                            sc.nextLine();
                        }else{
                            throw new Exception();
                        }
                    }catch (Exception e){
                        System.out.println("No es posible usar el valor");
                        sc.nextLine();
                    }
                    break;

                case "b":
                    break;

                case "c":
                    break;

                case "d":
                    break;

                case "e":
                    controlador = false;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
            //sc.close();
        }while(controlador);

        System.out.println("El programa ha finalizado");

    }
}