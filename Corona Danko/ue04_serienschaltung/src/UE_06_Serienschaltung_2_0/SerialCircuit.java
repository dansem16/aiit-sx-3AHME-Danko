
package UE_06_Serienschaltung_2_0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 *
 * @author danko
 */
public class SerialCircuit {
    private List<Component>componentListe = new ArrayList<>();
    private double current;
    
    public SerialCircuit(Collection<Component> component){
        this.componentListe.addAll(component);
    }


    public double getCurrent () {
        return current;
    }


    public void setCurrent (double current) {
        this.current = current;
    }
    
    public double totalVoltage(){
        double rv = 0.0;
        for(Component c : componentListe){
            rv += c.getVoltage();
        }
        return rv;   
    }
    
    public double totalPower(){
        double rv = 0.0;
        for(Component c : componentListe){
            rv = c.getValue() * c.getCurrent();
        }
        return rv;
        
    }
    
    public double totalEnergy(){
        double rv = 0.0;
        for(Component c : componentListe){
            rv = c.energy();
        }
        return rv;
        
    }
    
    
    
}
