package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Walkman;

public class WalkmanTest {

	@Test
	public void testWalkman() {
		Walkman walkman = new Walkman();
		assertFalse(walkman.getTerminal());
		assertFalse(walkman.getTape());
	}

	@Test
	public void testGetTerminal() {
		Walkman walkman = new Walkman();
		boolean result = walkman.getTerminal();
		assertFalse(result);
	}

	@Test
	public void testSetTerminal() {
		Walkman walkman = new Walkman();
		walkman.setTerminal(true);
		boolean result = walkman.getTerminal();
		assertTrue(result);
	}

	@Test
	public void testSetTape() {
		Walkman walkman = new Walkman();
		walkman.setTape(true);
		boolean result = walkman.getTape();
		assertTrue(result);
	}

	@Test
	public void testgetTape() {
		Walkman walkman = new Walkman();
		boolean result = walkman.getTape();
		assertFalse(result);
	}

	@Test
	public void testStartMusic() {
		Walkman walkman = new Walkman();
		walkman.setTape(true);
		walkman.startMusic();

		walkman.setTape(false);
		walkman.startMusic();

	}

	@Test
	public void testStopMusic() {
		Walkman walkman = new Walkman();
		walkman.stopMusic();
	}

}
