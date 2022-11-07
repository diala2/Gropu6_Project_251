/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareengproject;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.lang.Exception;
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
public class HomePageTest {
    
    public HomePageTest() {
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
     * Test of main method, of class HomePage.
     */
    @Test
    public void testMain() throws Exception {
    
        System.out.println("main");
        String[] args = null;
        HomePage.main(args);
         fail();
    }

    /**
     * Test of DisplayMainMenu method, of class HomePage.
     */
    @Test
    public void testDisplayMainMenu()throws NoSuchElementException  {
        System.out.println("DisplayMainMenu");
        HomePage.DisplayMainMenu();
   
    }

    
}
