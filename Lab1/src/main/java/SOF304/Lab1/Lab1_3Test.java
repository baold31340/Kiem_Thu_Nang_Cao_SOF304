package SOF304.Lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.processing.Generated;

import org.junit.Test;

public class Lab1_3Test {

	private Lab1_3 createTestSubject() {
		return new Lab1_3();
	}

	@Test
	public void testIsEventNumber() throws Exception {
		Lab1_3 testSubject;
		int input = 0;
		boolean result;
		boolean kyvong = true;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isEventNumber(input);
		assertEquals(kyvong, result);
	}

	@Test
	public void testSoLe() throws Exception {
		Lab1_3 testSubject;
		int input = 1;
		boolean result;
		boolean kyvong = true;

		// default test
		testSubject = createTestSubject();
		result = testSubject.soLe(input);
		assertEquals(kyvong, result);
	}
}