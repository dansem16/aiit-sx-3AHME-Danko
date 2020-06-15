
package UE_02_serienschaltung;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author danko
 */
public class TestSerienschaltung {
    
    public static void main (String[] args ){
        final Serienschaltung serienschaltung = new Serienschaltung();
       
        try {
            System.out.println("1:" + serienschaltung);
            serienschaltung.addWiderstand(10);
        }
        catch (InvalidResistorValueException ex) {
            System.out.println("Fehler");
            System.out.println(ex.getMessage());  
            throw new TestFailedException(ex);
        }
        
        System.out.println("2:" + serienschaltung);
        serienschaltung.setStrom(0.5);
        
        
        try {
            System.out.println("3:" + serienschaltung);
            serienschaltung.addWiderstand(15);
        }
        catch (InvalidResistorValueException ex) {
            System.out.println("Fehler");
            System.out.println(ex.getMessage());        
        }
        
        try {
            System.out.println("4:" + serienschaltung);
            serienschaltung.addWiderstand(20);
        }
        catch (InvalidResistorValueException ex) {
            System.out.println("Fehler");
            System.out.println(ex.getMessage());
        }
        
        System.out.println("5:" + serienschaltung);
        
        serienschaltung.setStrom(1);
        System.out.println("6:" +serienschaltung);
    
    }
    
    public static class TestFailedException extends RuntimeException {

        public TestFailedException (Throwable cause) {
            super(cause);
        }
        
    }
        
    
    
}
