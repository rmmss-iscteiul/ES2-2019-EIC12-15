package ES2_2019_EIC12_15.HelloWorld;

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
    public void testSomar()
    {
        assertEquals( App.somar(4, 5),9 );
    }
    public void testConc()
    {
        assertEquals( App.conc("aa", "bb"),"aabb" );
    }
}
