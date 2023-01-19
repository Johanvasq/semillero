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

        String opcion = sc.next();

        switch (opcion) {
            case "a":
                try {
                    System.out.println("Ingrese el nombre del producto: ");
                    String nombre = sc.next();
                    System.out.println("Ingrese el valor del producto: ");
                    Double valor = Double.parseDouble(sc.next());
                    if (!nombre.isEmpty() && !valor.isNaN()){
                        productos.add(new Producto(nombre, valor));
                        System.out.println("Producto añadido correctamente");
                        return productos;
                    }else {
                        System.out.println("Ingrese los datos correctamente");
                        return productos;
                    }

                }catch (Exception e) {
                    System.out.println("Por favor ingresa un valor correcto");
                }
                return productos;
            case "b":
                try {
                    System.out.println("Ingrese el nombre del producto a eliminar: ");
                    String nombre = sc.next().toLowerCase();
                    if (!nombre.isEmpty()) {
                        productos.removeIf(p -> p.getNombre().equals(nombre));
                        return productos;
                    }else {
                        throw new Exception();
                    }
                }catch (Exception e) {
                    System.out.println("Por favor ingresa un valor correcto");
                }

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
