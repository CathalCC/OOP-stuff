package assignment1;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import assignment1.University.Venue;

public class UniversityTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	//Declaration
	University u;
	Venue v;
	
	//Set Up
	@Before
	public void setUp() {
		u = new University();
		v = new Venue();
	}
	//I don't know what the problem is here or if Venue should have its own tester
	
	//Tests
	@Test
	public void testModules() {
		assertEquals("unassigned unassigned", u.getModules());
	}
	
	@Test
	public void testProgrammes() {
		assertEquals("unassigned unassigned", u.getProgrammes());
	}
	
	@Test
	public void testVenue() {
		assertEquals("unassigned 0",u.getVenues());
	}
	
	@Test
	public void testToString() {
		String testStr = "unassigned unassigned unassigned unassigned unassigned 0";
		assertEquals(testStr,u.toString());
	}
	
	//I don't know how to test the adding and removal modules or what I should be giving as my expected result with them
	
	//Tear Down
	@Test
	public void tearDown() {
		u = null;
		v = null;
	}
	

}
