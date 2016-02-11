package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.SecondWalkman;

public class SecondWalkmanTest {

	@Test
	public void testSecondWalkman() {
		SecondWalkman walkman = new SecondWalkman();
		assertFalse(walkman.getTerminal());
		assertFalse(walkman.getTerminal2());
		assertFalse(walkman.getTape());
	}

	@Test
	public void testGetTerminal2() {
		SecondWalkman walkman = new SecondWalkman();
		boolean result = walkman.getTerminal2();
		assertFalse(result);
	}

	@Test
	public void testSetTerminal2() {
		SecondWalkman walkman = new SecondWalkman();
		walkman.setTerminal2(true);
		boolean result = walkman.getTerminal2();
		assertTrue(result);
	}

}
