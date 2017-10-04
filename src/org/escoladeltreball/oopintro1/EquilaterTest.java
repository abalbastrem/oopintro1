/**a
 * 
 */
package org.escoladeltreball.oopintro1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author iaw46994355
 *
 */
public class EquilaterTest {
	
	Equilater equilater;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		equilater = new equilater(10.0,2.0);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.escoladeltreball.oopintro1.Equilater#perimeter()}.
	 */
	@Test
	public void testPerimeter() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.escoladeltreball.oopintro1.Equilater#area()}.
	 */
	@Test
	public void testArea() {
		fail("Not yet implemented"); // TODO
	}

}
