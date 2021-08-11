/* Program name: com.marcelocerritos.Calculadora1
* Author: Marcelo Cerritos
* Description: Programa que calcula el IVA de tres productos utilizando HashMap, y calcula el total de todos */

package com.marcelocerritos;


import java.util.*;
import java.util.Map.Entry;

public class IvaTresProductos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> productos = new HashMap<>();
        Iterator iterator;
        double totalAPagar = 0, totalIVA = 0;
        boolean valid;

        System.out.println("Bienvenido, presione INTRO para continuar");
        do{
            try{
                for(int i=0; i<3; i++){
                    scanner.nextLine();
                    String nombrePlaceholder;
                    double precioPlaceholder;
                    System.out.printf("Nombre del producto %d\n>>",(i+1));
                    nombrePlaceholder = scanner.nextLine();
                    System.out.printf("Precio del producto %d\n>>",(i+1));
                    precioPlaceholder = scanner.nextDouble();
                    productos.put(nombrePlaceholder,precioPlaceholder);
                    System.out.println("____________________________________");
                }

                iterator = productos.entrySet().iterator();
                while(iterator.hasNext()){
                    Entry pair = (Entry)iterator.next();
                    String productoActual = (String) pair.getKey();
                    double precioActual = (Double) pair.getValue(), ivaActual = precioActual*0.13, totalActual = (precioActual+ivaActual);
                    System.out.printf("Producto: %s\nPrecio unitario: $%.2f\nIVA: $%.2f\nTotal: $%.2f\n",
                            productoActual, precioActual,ivaActual , totalActual);
                    totalAPagar += totalActual;
                    totalIVA += ivaActual;
                    iterator.remove();
                }
                System.out.println("____________________________________");
                System.out.printf("Total IVA: $%.2f    Total a Pagar: $%.2f",totalIVA, totalAPagar);
                valid = true;
            }catch(InputMismatchException ex){
                System.out.println("Error, datos incorrectos, por favor intente de nuevo");
                valid = false;
            }
        }while(!valid);
    }
}
