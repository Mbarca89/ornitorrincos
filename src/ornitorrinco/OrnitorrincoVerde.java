
package ornitorrinco;
import java.util.Scanner;

public class OrnitorrincoVerde extends Castor implements Pato {
    private String nombre;

    public OrnitorrincoVerde(int velocidadNadar, double anchoCola) {
        super(velocidadNadar, anchoCola);
    }

    public OrnitorrincoVerde(String nombre, int velocidadNadar, double anchoCola) {
        super(velocidadNadar, anchoCola);
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public void tocarOrgano() {
        System.out.println("Ingrese una tecla para empezar el órgano:");
        new Scanner(System.in).nextLine();
        System.out.println("Do-Re-Mi");
        System.out.println("Fa-Sol-La-Si");
    }

    public void tocarGuitorgan() {
        System.out.println((nombre!=null?nombre:"(sin nombre)") + " toca el Guitorgan:");
        super.tocarGuitarra();
        this.tocarOrgano();
        System.out.println("¡cuac cuaac…!");
    }

    @Override
    public String toString() {
        return "OrnitorrincoVerde{nombre='" + nombre + "', vel=" + getVelocidadNadar() + ", cola=" + getAnchoCola() + "}";
    }
}
