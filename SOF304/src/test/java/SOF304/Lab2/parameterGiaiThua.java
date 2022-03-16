package SOF304.Lab2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class parameterGiaiThua {

	private int numberInput;
	private long expected;

	giaiThua giaiThua;

	@Before
	public void setUp() {
		giaiThua = new giaiThua();
	}

	@After
	public void tearnDown() {
		giaiThua = null;
	}

	public parameterGiaiThua(int numberInput, long expected) {
		super();
		this.numberInput = numberInput;
		this.expected = expected;
	}

	@Parameterized.Parameters

	public static Collection input() {
		return Arrays.asList(new Object[][] { 
			{ 1, 1 }, 
			{ 2, 2 }, 
			{ 3, 6 }, 
			{ 4, 24 }, 
			{ 5, 120 }, 
			{ 6, 720 } 
			});
	}

	@Test
	public void testParameter() {
		long kq = giaiThua.giaiThua(numberInput);
		
		assertEquals(expected, kq);
	}

}
