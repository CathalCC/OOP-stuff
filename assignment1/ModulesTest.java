package assignment1;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ModulesTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	//Declaration
	Modules m;
	
	//Set Up
	@Before
	public void setUp() {
		m = new Modules();
	}
	
	//Tests
	@Test
	public void testTitle() {
		assertEquals("unassigned",m.getTitle());
	}
	
	@Test
	public void testCode() {
		assertEquals("unassigned",m.getCode());
	}
	
	@Test
	public void testToString() {
		String testStr = "unassigned unassigned";
		assertEquals(testStr, m.toString());
	}
	
	//Tear Down
	@After
	public void tearDown() {
		m = null;
	}
	
}
