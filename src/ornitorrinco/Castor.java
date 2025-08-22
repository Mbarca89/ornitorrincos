
package ornitorrinco;


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

    public void setVelocidadNadar(int velocidadNadar) {
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
    public void tocaGuitarra(){
        System.out.println("Estoy tocando la guitarra");
    }
}
