package ES2_2019_EIC12_15.HelloWorld;

import junit.framework.TestCase;

public class tests extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	public void testSomar()
	{
		assertEquals( App.somar(3, 6),9 );
	}
	public void testConc()
	{
		assertEquals( App.conc("aa", "bb"),"aabb" );
	}

}
