
package UE_06_Serienschaltung_2_0;

import java.util.Locale;


/**
 *
 * @author danko
 */
public class Component {
    private String id;
    private double value;
    private double voltage;
    private double current;
    
    public Component(String id,double value ){
        
    }


    public String getId () {
        return id;
    }
    

    public double getValue () {
        return value;
    }


    public double getVoltage () {
        return voltage;
    }


    public void setVoltage (double voltage) {
        this.voltage = voltage;
    }


    public double getCurrent () {
        return current;
    }


    public void setCurrent (double current) {
        this.current = current;
    }
    
    public double power(){
        return current * voltage;   
    }
    
    public String formattedValue(){
        return null;
        
    }
    
    public String formattedValue(Locale locale){
        return null;
        
    }


    @Override
    public String toString () {
        return "Component{" + "id=" + id + ", value=" + value + ", voltage=" + voltage + ", current=" + current + '}';
    }
    
    public final String unit(){
        return null;
        
    }
    
    public final String energy(){
        return null;
        
    }
    
    
    
}
