package edu.uniandes.ecos;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    /**
     * Test of calcularVariables method, of class App.
     */
    public void testCalcularVariables() {
        System.out.println("calcularVariables");
        Double xvar = null;
        Double numSegvar = null;
        Double dofvar = null;
        App.calcularVariables(1.1, 10.0, 9.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularP method, of class App.
     */
    public void testCalcularP() {
        System.out.println("calcularP");
        App.calcularP();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calulcarF method, of class App.
     */
    public void testCalulcarF() {
        System.out.println("calulcarF");
        Double val = null;
        Double expResult = null;
        Double result = App.calulcarF(val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumatoriaImpares method, of class App.
     */
    public void testSumatoriaImpares() {
        System.out.println("sumatoriaImpares");
        Double s = null;
        Double expResult = null;
        Double result = App.sumatoriaImpares(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumatoriaPares method, of class App.
     */
    public void testSumatoriaPares() {
        System.out.println("sumatoriaPares");
        Double s = null;
        Double expResult = null;
        Double result = App.sumatoriaPares(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of factorial method, of class App.
     */
    public void testFactorial() {
        System.out.println("factorial");
        Double N = null;
        Double expResult = null;
        Double result = App.factorial(N);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getP method, of class App.
     */
    public void testGetP() {
        System.out.println("getP");
        Double expResult = null;
        Double result = App.getP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setP method, of class App.
     */
    public void testSetP() {
        System.out.println("setP");
        Double P = null;
        App.setP(P);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
