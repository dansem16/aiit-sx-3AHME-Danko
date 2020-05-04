/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue_3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author danko
 */
public class TaschenrechnerTest {
    
    public TaschenrechnerTest () {
    }
    

    @BeforeClass
    public static void setUpClass () {
    }
    

    @AfterClass
    public static void tearDownClass () {
    }
    

    @Before
    public void setUp () {
    }
    

    @After
    public void tearDown () {
    }


    /**
     * Test of getAdditionsResult method, of class Taschenrechner.
     */
    @Test
    public void testGetAdditionsResult () {
        System.out.println("getAdditionsResult");
        Taschenrechner instance = null;
        double expResult = 0.0;
        double result = instance.getAdditionsResult();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of getSubtractionResult method, of class Taschenrechner.
     */
    @Test
    public void testGetSubtractionResult () {
        System.out.println("getSubtractionResult");
        Taschenrechner instance = null;
        double expResult = 0.0;
        double result = instance.getSubtractionResult();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of getMultiplicationResult method, of class Taschenrechner.
     */
    @Test
    public void testGetMultiplicationResult () {
        System.out.println("getMultiplicationResult");
        Taschenrechner instance = null;
        double expResult = 0.0;
        double result = instance.getMultiplicationResult();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of getDivisionResult method, of class Taschenrechner.
     */
    @Test
    public void testGetDivisionResult () {
        System.out.println("getDivisionResult");
        Taschenrechner instance = null;
        double expResult = 0.0;
        double result = instance.getDivisionResult();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
