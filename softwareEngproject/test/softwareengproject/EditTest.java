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
public class EditTest {
    
    public EditTest() {
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
     * Test of editDetails method, of class Edit.
     */
    @Test
    public void testEditDetails() {
        System.out.println("editDetails");
        String name = "Diala Fayoumi";
        int id = 2005033;
        int time = 1;
        int phone_number = 0535517733;
        int card = 1;
        Edit instance = new Edit();
        instance.editDetails(name, id, time, phone_number);
       
    }

   

    /**
     * Test of CancleApp method, of class Edit.
     */
    @Test
    public void testCancleApp() {
        System.out.println("CancleApp");
        String name = "Diala";
        int id = 2005033;
        int time = 1;
        int phone_number = 0535517733;
        int card = 1;
        Edit instance = new Edit();
        instance.CancleApp(name, id, time, phone_number);
    
    }
    
}
