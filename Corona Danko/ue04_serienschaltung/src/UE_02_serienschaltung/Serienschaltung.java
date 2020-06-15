/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UE_02_serienschaltung;
import java.util.*;

/**
 *
 * @author danko
 */
public class Serienschaltung {

    
    private double strom;
    private double spannung;
    private double widerstandFeld[];
    ArrayList list = new ArrayList();

    
    public void updateSpannung() {
        if (widerstandFeld == null){
            spannung = 0;
        } else {
            for (int i = 0; i < widerstandFeld.length; i++){
                spannung += strom * widerstandFeld[i];
            }
        }
    }

    public void addWiderstand(double widerstandInOhm) throws InvalidResistorValueException //throws InvalidResistorValueException
    {
        if(widerstandInOhm < 0 || widerstandInOhm > 10E6)//10⁶
        {
            throw new InvalidResistorValueException(widerstandInOhm);
                
        }
    
        if(widerstandFeld == null){
            widerstandFeld = new double[1];
            widerstandFeld[0]= widerstandInOhm;
        } else { 
            final double [] neuesFeld = new double[widerstandFeld.length];
            for(int i = 0 ; i < widerstandFeld.length; i++){
                neuesFeld[neuesFeld.length - 1 ] = widerstandInOhm;
                widerstandFeld = neuesFeld;
            }
                
           updateSpannung();
           
        }
        
    }

    public double getStrom() 
    {

       return strom; 
    }

    public void setStrom(double strom) 
    {
        this.strom = strom;
        updateSpannung();
    } 

    public double getSpannung() 
    {

        return spannung;
    }

    @Override
    public String toString() 
    {
        return "Serienschaltung{" + "strom=" + strom + ", spannung=" + spannung + ", widerstand=" + widerstandFeld + '}';
    }
}
    


    

