package SOF304.Lab2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.processing.Generated;

import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class giaiThuaTest {

	private giaiThua createTestSubject() {
		return new giaiThua();
	}

	@Test
	public void testGiaiThua() throws Exception {
		giaiThua testSubject;
		int input = 5;
		long result;
		long exp = 120;
		// default test
		testSubject = createTestSubject();
		result = testSubject.giaiThua(input);
		assertEquals(exp, result);
	}
}