package Clase_7;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CarritoTest {
    
    public CarritoTest() {
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
     * Test of precioFinal method, of class Carrito.
     */
    @Test
    public void testPrecioFinal() {
        System.out.println("precioFinal");
        int cantidad = 4;
        Carrito[] vector = new Carrito[5];
        Carrito instance = new Carrito();
        vector[0]= new Carrito (0,0,"x","x",1,100);
        vector[1]= new Carrito (1,0,"x","x",1,100);
        vector[2]= new Carrito (2,0,"x","x",1,100);
        vector[3]= new Carrito (3,0,"x","x",1,100);
        float expResult = 400.0F;
        float result = instance.precioFinal(cantidad, vector);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
