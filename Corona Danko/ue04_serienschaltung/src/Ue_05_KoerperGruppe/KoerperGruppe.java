/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ue_05_KoerperGruppe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 *
 * @author danko
 */
class KoerperGruppe {
      private final List<Koerper>koeperListe = new ArrayList<>();
      private double dichte;


    public KoerperGruppe () {
    }
    
    public KoerperGruppe(Collection<Koerper> koerperListe, double dichte){
        this.koeperListe.addAll(koeperListe);
        this.dichte = dichte;
        for (Koerper k : this.koeperListe){
            k.setDichte(dichte);
        }
    }


    public int size () {
        return koeperListe.size();
    }


    public boolean contains (Koerper k) {
        return koeperListe.contains(k);
    }


    public boolean add (Koerper k) {
        return koeperListe.add(k);
    }


    public boolean remove (Koerper k) {
        return koeperListe.remove(k);
    }
    
    public Koerper[] toArray () {
        Koerper  [] rv = new Koerper [koeperListe.size()];
        koeperListe.toArray(rv);
        return rv;
    }


    public double getDichte () {
        return dichte;
    }


    public void setDichte (double dichte) {
        this.dichte = dichte;
        for (Koerper k : this.koeperListe){
            k.setDichte(dichte);
        }
    }


    public List<Koerper> getKoeperListe () {
        return koeperListe;
    }
    
    public double gesamtMasse(){
        double rv = 0.0;
        for( Koerper k : koeperListe){
             rv += k.masse();
        }
        return rv;
    }
    
    
    public double gesamtVolumen(){
        double rv = 0.0;
        for( Koerper k : koeperListe){
             rv += k.volumen();
        }
        return rv;
    }


    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder(100);
        sb.append("[\n");
        boolean firstLine = true;
        for(Koerper k:koeperListe ){
            if(firstLine){
                firstLine = false;
            }else{
                sb.append(",\n");
            }
            sb.append("      ").append(k.toString());
            
        }
        sb.append("[\n");
        return sb.toString();
    }

    
    
    
    
      
      

}
