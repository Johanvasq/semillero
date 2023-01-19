package org.example.ejercicio_2;



import java.util.*;

public class MainEjercicio2 {
    public static void main(String[] args) {
        ArrayList<ClienteEj2> clientes = new ArrayList<>();
        clientes.add(new ClienteEj2("Laura", 12));
        clientes.add(new ClienteEj2("Juan", 15));
        clientes.add(new ClienteEj2("Adrian", 80));


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
                    try {
                        ClienteEj2 cliente = ToolsEj2.guardarCliente();
                        if (cliente != null && ToolsEj2.validarCedula(cliente, clientes)) {
                            clientes.add(cliente);
                        } else {
                            throw new Exception();
                        }

                    } catch (Exception e) {
                        System.out.println("No es posible registrar el cliente");
                    }
                    break;

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
                        for (ClienteEj2 c : clientes) {
                            if (c.getCedula() == valor) {
                                clientes.remove(c);
                                System.out.println("El cliente fue eliminado");
                                break;
                            }
                        }
                        if (tamaño == clientes.size()) {
                            throw new Exception("La cédula no existe");
                        }

                    }catch(Exception e){
                        System.out.println("Cédula invalida");
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
                                break;
                            }
                        }
                        System.out.println("No se encontro el cliente");
                    }catch (Exception e){
                        System.out.println("Ingrese un valor correcto");
                    }
                    break;

                case "d":
                    Collections.sort(clientes , Comparator.comparing(ClienteEj2::getNombre));
                    for (int i = 0; i < clientes.size(); i++) {
                        if (clientes.get(i) != null) {
                            System.out.println("Cliente número: " + (i+1) + ". el cliente se llama " +
                                    clientes.get(i).getNombre() + " y su cédula es: " +
                                    clientes.get(i).getCedula());
                        }
                    }
                    break;

                case "e":
                    controlador = false;
                    System.out.println("Ejecución finalizada");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

        }while(controlador);

        System.out.println("El programa ha finalizado");

    }
}
