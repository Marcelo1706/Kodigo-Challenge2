/* Program name: com.marcelocerritos.Calculadora1
 * Author: Marcelo Cerritos
 * Description: Programa que calcula el IVA de un producto */
package com.marcelocerritos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IvaUnProducto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nombreProducto;
        double precioProducto, ivaProducto;
        boolean valid;

        System.out.println("Bienvenido, presione INTRO para continuar");
        do{
            try{
                scanner.nextLine();
                System.out.print("Nombre del producto:\n>> ");
                nombreProducto = scanner.nextLine();
                System.out.print("Precio del producto:\n>> ");
                precioProducto = scanner.nextDouble();
                ivaProducto = precioProducto*0.13;
                System.out.printf("Producto: %s\nPrecio unitario: $%.2f\nIVA: $%.2f\nTotal: $%.2f",
                        nombreProducto, precioProducto, ivaProducto, (precioProducto + ivaProducto));
                valid = true;
            }catch (InputMismatchException ex){
                System.out.println("Los datos ingresados no son correctos, intente de nuevo.");
                valid = false;
            }
        }while(!valid);


    }
}
