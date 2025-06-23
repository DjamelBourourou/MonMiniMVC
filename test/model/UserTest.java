/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class UserTest {
    
    public UserTest() {
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
     * Test of getNom method, of class User.
     */
    @Test
    public void testGetNom() {
       
        User user = new User("Doe","John");
       
      
        assertEquals("Doe", user.getNom());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPrenom method, of class User.
     */
    @Test
    public void testGetPrenom() {
     
        User user= new User("Doe","John");
    
    
        assertEquals("John", user.getPrenom());
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
