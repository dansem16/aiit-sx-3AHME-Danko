
package Ue_03_objects_in_java;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author danko
 */
public class Person implements Cloneable {
    public   String firstname;
    public final  String surname;


    public Person (String firstname, String surname) {
        if(firstname == null || firstname.isBlank()){
            throw new IllegalArgumentException("Inalid Firstname");
        }
        if(surname == null || surname.isBlank()){
            throw new IllegalArgumentException("Inalid Surname");
        }
        this.firstname = firstname;
        this.surname = surname;
    }


    public String getFirstname () {
        return firstname;
    }


    public void setFirstname (String firstname) {
        this.firstname = firstname;
    }
    


    public String getSurname () {
        return surname;
    }


    @Override
    public String toString () {
        return surname + " " + firstname;
    }


    @Override
    public Person clone (){
        try {
            return (Person) super.clone(); //To change body of generated methods, choose Tools | Templates.
        }
        catch (CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
    }
    
     @Override
    public boolean equals (Object obj) {
        if (this == obj){
            return true;
        }
        
        if (obj == null){
            return false;
        }
        
        if( getClass() != obj.getClass()){
            return false;
        }
        final Person other = (Person) obj;
        if(!Objects.equals(firstname, other.firstname)) {
            return false;
        }
        if(!Objects.equals(surname, other.surname)) {
            return false;
        }
        
        return true;  
    }


    @Override
    public int hashCode () {
        int hc = firstname.hashCode(); 
        hc = hc * 59 +surname.hashCode();
        return hc;
    }
    
}
