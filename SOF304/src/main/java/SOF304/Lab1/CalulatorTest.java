package SOF304.Lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class CalulatorTest {
	Calulator calulator;

	@Before
	public void setUp() throws Exception {
		calulator = new Calulator();
	}

	@After
	public void tearDown() throws Exception {
		calulator = null;
	}

	private Calulator createTestSubject() {
		return new Calulator();
	}

	@Test
	public void testAdd() throws Exception {

		assertEquals(15, calulator.add(5, 10));
	}

	@Test
	public void testSub() throws Exception {

		assertEquals(5, calulator.sub(10, 5));
	}

	@Test
	public void testMul() throws Exception {
		
		assertEquals(25, calulator.mul(5, 5));
	}

	@Test
	public void testDiv() throws Exception {

		assertEquals(1, calulator.div(5, 5));
	}

	@Test
	public void testMax() throws Exception {

		assertEquals(true, calulator.checkMax(Integer.MAX_VALUE / 2, Integer.MAX_VALUE / 2));
	}

	@Test
	public void testMin() throws Exception {
		assertEquals(true, calulator.checkMin(Integer.MIN_VALUE / 2, Integer.MIN_VALUE / 2));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCheckLonHonMaxA() throws Exception {
		calulator.checkLonHonMaxA(Integer.MAX_VALUE / 2+1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCheckLonHonMaxB() throws Exception {
		calulator.checkLonHonMaxA(Integer.MAX_VALUE / 2+1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCheckLonHonMinA() throws Exception {
		calulator.checkLonHonMinA(Integer.MIN_VALUE / 2+1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCheckLonHonMinB() throws Exception {
		calulator.checkLonHonMinB(Integer.MIN_VALUE / 2+1);
	}

//	@Test
//	public void testMain() throws Exception {
//		String[] args = new String[] { "" };
//
//		// default test
//		Calulator.main(args);
//	}
}