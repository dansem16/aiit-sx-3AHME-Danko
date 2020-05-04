
package ue_3;


/**
 *
 * @author danko
 */
 class Taschenrechner {
    double a;
    double b;

    Taschenrechner (double a, double b) {
       this.a = a;
       this.b = b;
   }

    double getAdditionsResult() { 
       double rv;
       rv= a + b;
       return rv;
   }

    double getSubtractionResult() { 
       double rv;
       rv = a - b;
       return rv;
   }

    double getMultiplicationResult() { 
       double rv;
       rv = a * b;
       return rv;
   }

    double getDivisionResult() { 
       double rv;
       rv = a / b;
       return rv;
   }


    
}










