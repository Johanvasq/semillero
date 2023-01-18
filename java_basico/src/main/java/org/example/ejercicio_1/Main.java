package org.example.ejercicio_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Cliente clientes[] = new Cliente[4];
        clientes[0] = new Cliente("Maria", 10);
        clientes[1] = new Cliente("Pedro", 10);
        clientes[2] = new Cliente("Carlos", 10);
        clientes[3]= new Cliente("Sara", 10);

        Scanner sc = new Scanner(System.in);

        String opcion;

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

            opcion = sc.nextLine();

            switch (opcion) {
                case "a":
                    try {
                        if (clientes.length == 10) {
                            System.out.println("Debe borrar un cliente antes de poder ingresar uno nuevo");
                            throw new Exception();
                        }
                        Cliente cliente = Tools.guardarCliente();
                        if (cliente != null) {
                            clientes = Arrays.copyOf(clientes, clientes.length + 1);
                            clientes[clientes.length - 1] = cliente;
                        } else {
                            throw new Exception();
                        }

                    } catch (Exception e) {
                        System.out.println("No es posible usar el valor");
                    }
                    break;

                case "b":
                    try{

                        System.out.println("Lista de clientes");
                        for (int i = 0; i < clientes.length; i++) {
                            System.out.println((i+1) + ". nombre: " + clientes[i].getNombre() +
                                    " cedula: " + clientes[i].getCedula());
                        }
                        System.out.println("Ingrese la posición del cliente a borrar: ");
                        Integer valor = Tools.scannerInt() - 1;
                        if (valor == null){throw new Exception();}

                        if (valor >= 0 && valor <= clientes.length - 1) {
                            for (int i = valor; i < clientes.length - 1; i++) {
                                clientes[i] = clientes[i + 1];
                            }
                            if (clientes.length > 4){
                                clientes = Arrays.copyOf(clientes, clientes.length - 1);
                            }else {
                                clientes[clientes.length - 1] = null;
                            }
                            System.out.println("Cantidad de clientes registrados: " + clientes.length);

                        }else {
                            throw new Exception();
                        }
                    }catch(Exception e){
                        System.out.println("Opción invalida");
                    }

                    break;

                case "c":
                    try{
                        System.out.println("Ingrese el número de cedula del cliente a buscar: ");
                        Integer valor = Tools.scannerInt();
                        if (valor == null){throw new Exception();}
                        for (int i = 0; i < clientes.length; i++) {
                            if (clientes[i].getCedula() == valor) {
                                System.out.println("El Cliente sen encuentra en la posición: " + (i+1) + ". el cliente se llama " + clientes[i].getNombre() +
                                        " y su cédula es: " + clientes[i].getCedula());
                                break;
                            }
                        }
                        System.out.println("No se encontro el cliente");
                    }catch (Exception e){
                        System.out.println("Ingrese un valor correcto");
                    }
                    break;

                case "d":
                    for (int i = 0; i < clientes.length; i++) {
                        if (clientes[i]!= null) {
                            System.out.println("Cliente número: " + (i+1) + ". el cliente se llama " + clientes[i].getNombre() +
                                    " y su cédula es: " + clientes[i].getCedula());
                        }
                    }


                    break;

                case "e":
                    controlador = false;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

        }while(controlador);

        System.out.println("El programa ha finalizado");

    }
}