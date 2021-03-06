
package Ue_05_KoerperGruppe;


/**
 *
 * @author danko
 */
public class TestKoerperGruppe {

    public static void main (String[] args ) {
        KoerperGruppe g = new KoerperGruppe();
        g.setDichte(Koerper.DICHTE_BUCHE);
        
        
      g.add(new Wuerfel(0.1));  
      g.add(new Wuerfel(0.05));
      g.add(new Quader(0.1, 0.1, 0.2, Koerper.DICHTE_BUCHE));
      g.add(new Quader(0.05, 0.1, 0.1));
      g.add(new Kugel(0.1));
      g.add(new Kugel(0.15));
      
      
      System.out.println("Koerpergruppe Besteht aus " + g.size() + "Körpern");
      System.out.println(g);
        
      System.out.println("");
      System.out.println(String.format("Gesamtmasse: %.3fkg", g.gesamtMasse()));
      System.out.println(String.format("Gesamtvolumen: %.3fdm³", g.gesamtVolumen() * 1000));
        
    } 
}
