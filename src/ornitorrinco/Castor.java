
package ornitorrinco;
import java.util.Random;

public class Castor {
    
    private int velocidadNadar;
    private double anchoCola;

    public Castor(int velocidadNadar, double anchoCola) {
        this.velocidadNadar = velocidadNadar;
        this.anchoCola = anchoCola;
    }

    public int getVelocidadNadar() {
        return velocidadNadar;
    }

    public void setVelocidadNadar(int velsocidadNadar) {
        this.velocidadNadar = velocidadNadar;
    }

    public double getAnchoCola() {
        return anchoCola;
    }

    public void setAnchoCola(double anchoCola) {
        this.anchoCola = anchoCola;
    }
    
    
    public void nadar(){
        System.out.println("Estoy nadando a "+velocidadNadar +" km/hr" );
    }
    
    public void tocarGuitarra() {
        Random r = new Random();
        System.out.println("El castor toca la guitarra:");
        for (int i = 0; i < 3; i++) {
            int cuerda = r.nextInt(6) + 1;
            System.out.println("Tocando cuerda " + cuerda);
        }
    }
}
