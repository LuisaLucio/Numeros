/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LuisaLucio
 */
public class Numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        int opcion;
        do {
            System.out.println("MENU:");
            System.out.println("1. Registrar un número");
            System.out.println("2. Consultar un número");
            System.out.println("3. Modificar un número");
            System.out.println("4. Eliminar un número");
            System.out.println("5. Insertar un número en una determinada posición");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese El Eúmero A Registrar: ");
                    int numeroRegistrar = sc.nextInt();
                    numeros.add(numeroRegistrar);
                    System.out.println("Número registrado.");
                    break;
                case 2:
                    System.out.print("Ingrese la posición del número a consultar: ");
                    int posicionConsultar = sc.nextInt();
                    if (posicionConsultar >= 0 && posicionConsultar < numeros.size()) {
                        int numeroConsultado = numeros.get(posicionConsultar);
                        System.out.println("El número en la posición " + posicionConsultar + " es: " + numeroConsultado);
                    } else {
                        System.out.println("Posición inválida.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la posición del número a modificar: ");
                    int posicionModificar = sc.nextInt();
                    if (posicionModificar >= 0 && posicionModificar < numeros.size()) {
                        System.out.print("Ingrese el nuevo valor: ");
                        int nuevoValor = sc.nextInt();
                        numeros.set(posicionModificar, nuevoValor);
                        System.out.println("Número modificado correctamente.");
                    } else {
                        System.out.println("Posición inválida.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese la posición del número a eliminar: ");
                    int posicionEliminar = sc.nextInt();
                    if (posicionEliminar >= 0 && posicionEliminar < numeros.size()) {
                        numeros.remove(posicionEliminar);
                        System.out.println("Número eliminado correctamente.");
                    } else {
                        System.out.println("Posición inválida.");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese la posición donde insertar el número: ");
                    int posicionInsertar = sc.nextInt();
                    System.out.print("Ingrese el número a insertar: ");
                    int numeroInsertar = sc.nextInt();
                    if (posicionInsertar >= 0 && posicionInsertar <= numeros.size()) {
                        numeros.add(posicionInsertar, numeroInsertar);
                        System.out.println("Número insertado correctamente.");
                    } else {
                        System.out.println("Posición inválida.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }
}