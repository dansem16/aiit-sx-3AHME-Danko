
package Ue_05_KoerperGruppe;

import java.util.Locale;


/**
 *
 * @author danko
 */
public class Wuerfel extends Koerper{
    
    private double a; //Kantenlaenge

    public Wuerfel (double a){
        super(0.0);
        if(a<=0){
            throw new IllegalArgumentException("invalid paramet a");
        }
        this.a = a;
    }

    public Wuerfel (double a, double dichte) {
        super(dichte);
        this.a = a;
    }


    public double getA () {
        return a;
    }


    public void setA (double a) {
        this.a = a;
    }
    

    @Override
    public double oberflaeche () {
        return 6 * a * a;
    }


    @Override
    public double volumen () {
        return a * a * a;
    }


    @Override
    public String toString () {
        return String.format(Locale.ENGLISH, "{\"a\":%e,\"dichte\":%e}", a, dichte);
    }
    
    
    
}
