package org.example.ejercicio_3;

import org.example.ejercicio_2.ClienteEj2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainEjercicio3 {
    public static void main(String[] args) {
        ArrayList<ClienteEj3> clientes = new ArrayList<>();
        clientes.add(new ClienteEj3("Laura", 12));
        clientes.add(new ClienteEj3("Juan", 15));
        clientes.add(new ClienteEj3("Adrian", 80));

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Jabon", 1590.10));

        Scanner sc = new Scanner(System.in);


        Boolean controlador = true;

        do {
            System.out.println("*********** Menú principal ********************");
            System.out.println("a. Menú de clientes");
            System.out.println("b. Menú de productos");
            System.out.println("c. salir");
            System.out.println("***********************************************");
            System.out.println("Ingrese una opción: ");

            String opcion = sc.next();

            switch (opcion) {
                case "a":
                    clientes = MenuCliente.menuCliente(clientes, productos);
                    break;

                case "b":
                    productos = MenuProducto.menuProducto(productos);


                    break;

                case "c":

                    break;


                default:
                    System.out.println("Opción inválida");
                    break;
            }

        }while(controlador);

        System.out.println("El programa ha finalizado");

    }
}
