
package ue04_serienschaltung;


/**
 * Fehlerklasse
 * @author danko
 */
public class InvalidResistorValueException  extends Exception{
    public InvalidResistorValueException (double invalidValue){
        super ("Fehlerhafter widerstandswert" + invalidValue );
    }
    
}
