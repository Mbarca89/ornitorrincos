/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornitorrinco;

/**
 *
 * @author Mauricio
 */
public class OrnitorrincoAzul extends Castor implements Pato {
    
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
    public void nadar () {
        System.out.println("Estoy nadando con propulsion a " + super.getVelocidadNadar() + propulsion + " Km/H");
    }
    
    @Override
    public void tocarOrgano(){
        return;
    }   
}
