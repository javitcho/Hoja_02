/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mejia
 */
public class CalculadoraTest {
    
    private Calculadora calculadora;
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testSuma(){
        assertEquals(12,(int) calculadora.resolver("7 5 +"));
    }
    
    @Test
    public void testResta(){
        assertEquals(2,(int) calculadora.resolver("7 5 -"));
    }
    
    @Test
    public void testMult(){
        assertEquals(35,(int) calculadora.resolver("7 5 *"));
    }
    
    @Test
    public void testDiv(){
        assertEquals(3,(int) calculadora.resolver("9 3 /"));
    }
    
    @Test
    public void testOp(){
        assertEquals(15,(int) calculadora.resolver("1 2 + 4 * 3 +"));
    }
}
