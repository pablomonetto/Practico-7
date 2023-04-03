package Clase_7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DescuentoFijoTest {
    
    public DescuentoFijoTest() {
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
     * Test of valorFinal method, of class DescuentoFijo.
     */
    @Test
    public void testValorFinal() {
        System.out.println("valorFinal");
        float valorInicial = 1000.0F;
        DescuentoFijo instance = new DescuentoFijo();
        instance.setDesc(100);
        float expResult = 900.0F;
        float result = instance.valorFinal(valorInicial);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
