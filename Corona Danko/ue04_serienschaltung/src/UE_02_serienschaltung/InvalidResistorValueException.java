
package UE_02_serienschaltung;


/**
 * Fehlerklasse
 * @author danko
 */
public class InvalidResistorValueException  extends Exception{
        private final double invalidValue;
    
    public InvalidResistorValueException (double invalidValue){
        super ("Fehlerhafter widerstandswert" + invalidValue );
        this.invalidValue = invalidValue;
    }
    public double getInvalidValue(){
        return invalidValue;
    }
    
}
