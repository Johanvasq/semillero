package org.example.ejercicio_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MenuProducto {
    public static ArrayList<Producto> menuProducto(ArrayList<Producto> productos) {

        Scanner sc = new Scanner(System.in);


        System.out.println("*********** Menú de productos ********************");
        System.out.println("a. Añadir un nuevo producto");
        System.out.println("b. Borrar un producto");
        System.out.println("c. Volver");
        System.out.println("***********************************************");
        System.out.println("Ingrese una opción: ");

        String opcion = sc.nextLine();

        switch (opcion) {
            case "a":
                System.out.println("Ingrese el nombre del producto: ");
                
                return productos;
            case "b":

                return productos;
            case "c":
                System.out.println("Regresando al menú principal");
                return productos;
            default:
                System.out.println("Opción inválida");
                break;
        }

        return productos;}
}
