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
import java.util.Scanner;

/**
 *
 * @author SURFACE
 */
public class BookAppointmentTest {
     Scanner input=new Scanner(System.in);
    public BookAppointmentTest() {
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

    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        BookAppointment instance = new BookAppointment(111891770, 2, 7,"oct");
     String expResult = "oct";
      
        String result = instance.getMonth();
        assertEquals(expResult, result);
      
    }

   
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        BookAppointment instance = new BookAppointment(111891770, 2, 7,"oct");
        String expResult = "oct / 7";
        String result = instance.getDate();
        assertEquals(expResult, result);
      
    }

    @Test
    public void testGetPassport_number() {
        System.out.println("getPassport_number");
        BookAppointment instance = new BookAppointment(111891770, 2, 7,"oct");
        int expResult = 111891770;
        int result = instance.getPassport_number();
        assertEquals(expResult, result);
     
    }

   
    @Test
    public void testGetVac() {
        System.out.println("getVac");
        BookAppointment instance = new BookAppointment(111891770, 2, 7,"oct");
        int expResult = 2;
        int result = instance.getVac();
        assertEquals(expResult, result);
   
    }

}
