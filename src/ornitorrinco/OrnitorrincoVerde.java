/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ornitorrinco;
import java.util.Scanner;

/**
 *
 * @author Nicolino Uchiha
 */
public class OrnitorrincoVerde extends Castor implements MamaPata {
    private String nombre;
    private double pico = PICOTAMANIO;
    private double patas = PATASTANANIO;

    public OrnitorrincoVerde(String nombre, double longiCola, double velocidad) {
        super(longiCola, velocidad);
        this.nombre = nombre;
    }

    public void tocarOrgano() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese una tecla para empezar el órgano");
        sc.nextLine();
        System.out.println("Do-Re-Mi");
        System.out.println("Fa-Sol-La-Si");
    }

    public void tocarGuitorgan() {
        System.out.println(nombre + " toca el Guitorgan:");
        super.tocarGuitarra();
        this.tocarOrgano();
        System.out.println("cuac cuaac…!");
    }

}
