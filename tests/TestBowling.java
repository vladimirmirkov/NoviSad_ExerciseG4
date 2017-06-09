import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test_Frame()
	{
		int firstThrow = 2;
		int secondThrow = 5;
		Frame f = new Frame(firstThrow, secondThrow);
		
		assertEquals(firstThrow, f.getFirstThrow());
		assertEquals(secondThrow, f.getSecondThrow());
	}
	
	@Test
	public void test_ScoreOfSingleFrame()
	{
		int firstThrow = 2;
		int secondThrow = 5;
		Frame f = new Frame(firstThrow, secondThrow);
		
		assertEquals(7, f.score());
	}
	
	@Test
	public void test_IsStrike()
	{
		int firstThrow = 10;
		int secondThrow = 0;
		Frame f = new Frame(firstThrow, secondThrow);
		
		assertTrue(f.isStrike());
	}
	
	@Test
	public void test_IsSpare()
	{
		int firstThrow = 2;
		int secondThrow = 8;
		Frame f = new Frame(firstThrow, secondThrow);
		
		assertTrue(f.isSpare());
	}
	/*@Test
	public void test() {
		fail("Not yet implemented");
	} */

}
