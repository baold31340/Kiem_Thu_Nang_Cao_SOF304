package SOF304.Lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.processing.Generated;

import org.junit.Test;

public class CalulatorTest {

	private Calulator createTestSubject() {
		return new Calulator();
	}

	@Test
	public void testAdd() throws Exception {
		Calulator testSubject;
		int a = 5;
		int b = 10;
		int result;
		int kyvong = 15;

		// default test
		testSubject = createTestSubject();
		result = testSubject.add(a, b);
		assertEquals(kyvong, result);
	}

	@Test
	public void testSub() throws Exception {
		Calulator testSubject;
		int a = 10;
		int b = 5;
		int result;
		int kyvong = 5;

		// default test
		testSubject = createTestSubject();
		result = testSubject.sub(a, b);
		assertEquals(kyvong, result);
	}

	@Test
	public void testMul() throws Exception {
		Calulator testSubject;
		int a = 5;
		int b = 5;
		int result;
		int kyvong = 25;

		// default test
		testSubject = createTestSubject();
		result = testSubject.mul(a, b);
		assertEquals(kyvong, result);
	}

	@Test
	public void testDiv() throws Exception {
		Calulator testSubject;
		int a = 5;
		int b = 5;
		int result;
		int kyvong = 1;

		// default test
		testSubject = createTestSubject();
		result = testSubject.div(a, b);
		assertEquals(kyvong, result);
	}
}