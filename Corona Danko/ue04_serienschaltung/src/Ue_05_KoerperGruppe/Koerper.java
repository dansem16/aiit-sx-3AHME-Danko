/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ue_05_KoerperGruppe;


/**
 *
 * @author danko
 */
public abstract class Koerper {
    
    public static final double DICHTE_EICHE = 670; 
    public static final double DICHTE_BUCHE = 690; 
    
    
    protected double dichte;


    public Koerper (double dichte) {
        if (dichte < 0){
            throw new IllegalArgumentException("invalid parameter dichte");
        }
        
        this.dichte = dichte;
    }


    public double getDichte () {
        return dichte;
    }


    public void setDichte (double dichte) {
        this.dichte = dichte;
    }
    
    public abstract double oberflaeche ();
    public abstract double volumen ();
    
    
    public double masse() {
        return volumen() * dichte;
    }

    
    
    
    
      
    
}
