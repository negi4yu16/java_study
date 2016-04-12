package test.ex05;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.ex05.StringPrint;

public class StringPrintTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPrint1() {
		String str = "abcdefg";
		char c1 = 'b';
		char c2 = 'f';
		StringPrint.print(str, c1, c2);
	}

	@Test
	public void testPrint2() {
		String str = "abcdefg";
		char c1 = 'e';
		char c2 = 'a';
		StringPrint.print(str, c1, c2);
	}

}
