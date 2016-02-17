package test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import src.BadDataSetException;
import src.MyUtilities;

public class MyUtilitiesTest {

	@Test
	public void testGetDataSet1() {
		MyUtilities util = new MyUtilities();
		try {
			double [] result = util.getDataSet("test");
			fail("throw error");
		} catch (Exception e) {
			assertThat(e, instanceOf(BadDataSetException.class));		}
	}
	@Test
	public void testGetDataSet2() {
		MyUtilities util = new MyUtilities();
		try {
			double [] result = util.getDataSet("sample");
			assertEquals(result[0], 1.0, 0.0);
			assertEquals(result[1], 1.2, 0.0);
		} catch (Exception e) {
			fail("error");
		}
	}

	@Test
	public void testReadDataSet() {
		/*testGetDataSet2でテストできるので未実施*/
	}

}
