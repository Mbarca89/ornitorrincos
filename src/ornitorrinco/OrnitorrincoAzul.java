package ornitorrinco;

public class OrnitorrincoAzul extends Castor {

    private int propulsion;

    public OrnitorrincoAzul(int propulsion, int velocidadNadar, double anchoCola) {
        super(velocidadNadar, anchoCola);
        this.propulsion = propulsion;
    }

    public int getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(int propulsion) {
        this.propulsion = propulsion;
    }

    @Override
    public void nadar() {
        System.out.println("Estoy nadando con propulsion a " + super.getVelocidadNadar() + propulsion + " Km/H");
    }

    @Override
    public void tocarOrgano() {
        return;
    }
}
