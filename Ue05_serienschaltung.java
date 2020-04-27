/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue05_serienschaltung;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author danko
 */
public class Ue05_serienschaltung {
    private   double strom;
    private   double spannung;
    private   double [] widerstandFeld ; 

    
    private void updateSpannung (){
        int i;
        for(i= 0; i < 15 ; i++)
        this.spannung= strom *  widerstandFeld [i];
    }
    
    public void addWiderstand( double widerstandInOhm){
        int i=0;
        
        this.widerstandFeld [i] = widerstandInOhm ;
        if(widerstandInOhm < 0){
            System.out.println("Fehler");
        }
        i++;
}

   
    public class invalidResistorValueException(){
        
    }
   

 
    
    
    public double getStrom(){
       
        return strom;
    
    } 
    
    public void setStrom(double strom){
        this.strom = strom;
    
}
    
    public double getSpannung(){
        return spannung;
    }
    


    @Override
    public String toString () {
        return "Ue05_serienschaltung{" + "strom=" + strom + ", spannung=" + spannung + ", widerstandFeld=" + Arrays.toString(widerstandFeld) + '}';
    }
    

  
    
}

