/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareengproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SURFACE
 */
public class DetalisTest {
    
    public DetalisTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Detalis.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Detalis instance = new Detalis("Diala", 2005033, 2,0535517733);
        int expResult = 2005033;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Detalis.
     */
  

    /**
     * Test of getName method, of class Detalis.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Detalis instance = new Detalis("Diala", 2005033, 2,0535517733);
        String expResult = "Diala";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

 
    /**
     * Test of getTime method, of class Detalis.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        Detalis instance = new Detalis("Diala", 2005033, 2,0535517733);
        int expResult = 2;
        int result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

   

    /**
     * Test of getPhone_number method, of class Detalis.
     */
    @Test
    public void testGetPhone_number() {
        System.out.println("getPhone_number");
        Detalis instance = new Detalis("Diala", 2005033, 2,0535517733);
        int expResult = 0535517733;
        int result = instance.getPhone_number();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

   
   
}
