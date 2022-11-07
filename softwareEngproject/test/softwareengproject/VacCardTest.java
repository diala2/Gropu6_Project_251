/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareengproject;

import java.util.InputMismatchException;
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
public class VacCardTest {
    
    public VacCardTest() {
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
     * Test of getPass method, of class VacCard.
     */
    @Test
    public void testGetPass() {
        System.out.println("getPass");
        VacCard instance = new VacCard();
        int expResult = 0;
        int result = instance.getPass();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setPass method, of class VacCard.
     */
  

    /**
     * Test of getVcNum method, of class VacCard.
     */
    @Test
    public void testGetVcNum()   {
        
        System.out.println("getVcNum");
        VacCard instance = new VacCard(4);
        int expResult = 4;
        int result = instance.getVcNum();
         assertNotSame(expResult, result);
    
    }

    /**
     * Test of setVcNum method, of class VacCard.
     */
  

    /**
     * Test of VacCardWithVCDisplay method, of class VacCard.
     */
    @Test
    public void testVacCardWithVCDisplay() {
        System.out.println("VacCardWithVCDisplay");
        String name = "Diala";
        int pN = 0535517733;
        VacCard instance = new VacCard();
        instance.VacCardWithVCDisplay(name, pN);
   
    }

    /**
     * Test of VacCardWithPassDisplay method, of class VacCard.
     */
    @Test
    public void testVacCardWithPassDisplay() {
        System.out.println("VacCardWithPassDisplay");
        String name = "Diala";
        int pN = 0535517733;
        VacCard instance = new VacCard();
       instance.VacCardWithVCDisplay(name, pN);
         fail();
    }

    /**
     * Test of VcNumberGenerate method, of class VacCard.
     */
    @Test
    public void testVcNumberGenerate() {
        System.out.println("VcNumberGenerate");
        VacCard instance = new VacCard();
        int expResult = 25;
        int result = instance.VcNumberGenerate();
assertNotSame(expResult, result);
    
    }
    
}
