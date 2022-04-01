package assignment1;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ProgrammesTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	//Declaration
	Programmes p;
	
	//Set Up
	@Before
	public void setUp() {
		p = new Programmes();
	}
	
	//Tests
	@Test
	public void testTitle() {
		assertEquals("unassigned", p.getTitle());
	}
	
	@Test
	public void testCode() {
		assertEquals("unassigned", p.getCode());
	}
	
	@Test
	public void testToString() {
		String testStr = "unassigned unassigned";
		assertEquals(testStr, p.toString());
	}
	
	//Tear Down
	@After
	public void tearDown() {
		p = null;
	}

}
