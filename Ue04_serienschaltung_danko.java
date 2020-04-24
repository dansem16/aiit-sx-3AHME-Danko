/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue04_serienschaltung;


/**
 *
 * @author danko
 */
public class Ue04_serienschaltung {
    private   double strom;
    private   double spannung;
    private   double [] widerstandFeld ; 

    
    private void updateSpannung (){
        int i;
        for(i= null; i < length ; i++)
        this.spannung= strom *  widerstandFeld [i];
    }
    
    public void addWiderstand(double widerstandInOhm){
        
   
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
        return "Ue04_serienschaltung{" + "strom=" + strom + ", spannung=" + spannung + ", widerstandFeld=" + widerstandFeld + '}';
    }
    

  
    
}
