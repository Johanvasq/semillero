package org.example.ejercicio_3;

import org.example.ejercicio_1.Cliente;
import org.example.ejercicio_2.ClienteEj2;
import org.example.ejercicio_2.ToolsEj2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MenuCliente {

    public static ArrayList<ClienteEj3> menuCliente(ArrayList<ClienteEj3> clientes){

        Scanner sc = new Scanner(System.in);


        System.out.println("*********** Menú de clientes ********************");
        System.out.println("a. Añadir un nuevo cliente");
        System.out.println("b. Borrar un cliente");
        System.out.println("c. Buscar un cliente");
        System.out.println("d. Mostrar los clientes");
        System.out.println("e. Volver");
        System.out.println("***********************************************");
        System.out.println("Ingrese una opción: ");

        String opcion = sc.nextLine();

        switch (opcion) {
            case "a":
                try {
                    ClienteEj3 cliente = ToolsEj3.guardarCliente();
                    if (cliente != null && ToolsEj3.validarCedula(cliente, clientes)) {
                        clientes.add(cliente);
                        return clientes;
                    } else {
                        throw new Exception();
                    }

                } catch (Exception e) {
                    System.out.println("No es posible registrar el cliente");
                    return clientes;
                }


            case "b":
                try{
                    System.out.println("Lista de clientes");
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println((i+1) + ". nombre: " + clientes.get(i).getNombre() +
                                " cédula: " + clientes.get(i).getCedula());
                    }
                    System.out.println("Ingrese el número de la cédula que desea borrar");
                    Integer valor = Integer.parseInt(sc.nextLine());
                    Integer tamaño = clientes.size();
                    for (ClienteEj3 c : clientes) {
                        if (c.getCedula() == valor) {
                            clientes.remove(c);
                            System.out.println("El cliente fue eliminado");
                            return clientes;
                        }
                    }
                    if (tamaño == clientes.size()) {
                        throw new Exception("La cédula no existe");
                    }

                }catch(Exception e){
                    System.out.println("Cédula invalida");
                    return clientes;
                }
                break;

            case "c":
                try{
                    System.out.println("Ingrese el número de cedula del cliente a buscar: ");
                    Integer valor = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < clientes.size(); i++) {
                        if (clientes.get(i).getCedula() == valor) {
                            System.out.println("El Cliente sen encuentra en la posición: " + (i+1) + ". el cliente se llama " + clientes.get(i).getNombre() +
                                    " y su cédula es: " + clientes.get(i).getCedula());
                            return clientes;
                        }
                    }
                    System.out.println("No se encontro el cliente");
                }catch (Exception e){
                    System.out.println("Ingrese un valor correcto");
                    return clientes;
                }
                return clientes;

            case "d":
                Collections.sort(clientes , Comparator.comparing(ClienteEj3::getNombre));
                for (int i = 0; i < clientes.size(); i++) {
                    if (clientes.get(i) != null) {
                        System.out.println("Cliente número: " + (i+1) + ". el cliente se llama " +
                                clientes.get(i).getNombre() + " y su cédula es: " +
                                clientes.get(i).getCedula());
                    }
                }
                return clientes;

            case "e":
                System.out.println("Regresando al menú principal");
                return clientes;
            default:
                System.out.println("Opción inválida");
                break;
        }

        return clientes;}
}

