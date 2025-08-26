package ornitorrinco;
import java.util.Random;

public class OrnitorrincoAzul extends Castor {

    private String nombre;
    private int propulsion;

    public OrnitorrincoAzul(String nombre, int velocidadNadar, double anchoCola, int propulsion) {
        super(velocidadNadar, anchoCola);
        this.nombre = nombre;
        this.propulsion = propulsion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(int propulsion) {
        this.propulsion = propulsion;
    }

    @Override
    public void nadar() {
        
        System.out.println(nombre + " esta nadando con propulsión a " + propulsion + " km/h");
    }

    @Override
    public void tocarGuitarra() {
        Random random = new Random();
        System.out.println("El ornitorrinco azul " + nombre + " toca la guitarra:");
        for (int i = 0; i < 3; i++) {
            int cuerda = random.nextInt(6) + 1;
            System.out.println("-> toca cuerda " + cuerda);
        }
        System.out.println("pone Do-Re-Mi");
        System.out.println("Fa-Sol-La-Si");
    }
}
