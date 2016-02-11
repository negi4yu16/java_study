package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Point;

public class PointTest {

	@Test
	public void testClear() {
		Point p = new Point();
		p.x = 10.0;
		p.y = 20.0;

		p.clear();
		//期待値
		double expectedX = 0.0;
		double expectedY = 0.0;
		assertEquals(0,0);
		System.out.println(p.x);
		System.out.println(expectedX);
		//double型でassertする場合は許容誤差を入力すること。
		assertEquals(p.x, expectedX, 0.0);
		assertEquals(p.y,expectedY,0.0);
	}

	@Test
	public void testDistance() {
		Point p = new Point();
		Point q = new Point();
		p.x = 0;	p.y = 0;
		q.x = 3;	q.y = 4;

		double result = p.distance(q);

		assertEquals(result, 5, 0.0);

	}

	@Test
	public void testMoveDoubleDouble() {
		Point p = new Point();
		p.move(10,10);
		assertEquals(p.x, 10, 0.0);
		assertEquals(p.y, 10, 0.0);
	}

	@Test
	public void testMovePoint() {
		Point p = new Point();
		Point q = new Point();
		p.x = 10; p.y = 10;
		q.x = 20; q.y = 20;

		p.move(q);

		assertEquals(p.x, 20, 0.0);
		assertEquals(p.y, 20, 0.0);
	}


}
