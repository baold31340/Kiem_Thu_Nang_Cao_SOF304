package SOF304.Lab2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import SOF304.Lab2.Class.PhuongTrinhBacHai;

public class phuongTrinhBacHaiTest {

	private phuongTrinhBacHai se;

	@Before
	public void setUp() throws Exception {
		se = new phuongTrinhBacHai(2, Double.MAX_VALUE, -3); // 2*x^2 + x - 3 = 0
	}

	@After
	public void tearDown() throws Exception {
		se = null;
	}

//	private phuongTrinhBacHai createTestSubject() {
//		return new phuongTrinhBacHai(null, null, null);
//	}

	@Test
	public void testSolution() throws Exception {
//		phuongTrinhBacHai testSubject;
//		PhuongTrinhBacHai result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = testSubject.Solution();
		
		// Declare an instance of the Roots class
		PhuongTrinhBacHai rt = se.Solution();
		// Solution check x1
		assertEquals(rt.x1, -1.5);
		// Solution check x2
		assertEquals(rt.x2, 1.0);
	}
}