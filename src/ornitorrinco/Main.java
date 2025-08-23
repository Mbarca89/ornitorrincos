/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornitorrinco;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Mauricio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        LocalDate today = LocalDate.now();
        System.out.println("Fecha de ejecución: " + today);
        
        System.out.println("Ingresa el nombre del OrnitorrincoVerde:");
        
        String nombreOrnitorrincoVerde = scanner.nextLine();
        
        System.out.println("Ingresa la longitud de cola del OrnitorrincoVerde:");
        
        double colaVerde = scanner.nextDouble();
        
        System.out.println("Ingresa la velocidad de nado del padre (para el OrnitorrincoVerde):");
        
        double velVerde = scanner.nextDouble();
        
        
        
        
                

    }
    
}
