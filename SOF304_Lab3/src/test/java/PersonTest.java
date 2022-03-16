
import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PersonTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void testExpectedException() {
		exception.expect(IllegalArgumentException.class);
		new Person("Fpoly", -1);
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testExpectedException2() {
		new Person("Fpoly", Integer.MAX_VALUE+1);
	}
	
	@Test
	public void testExpectedException3() {
		
		try {
			new Person("Fpoly", Integer.MAX_VALUE+1);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
		}
	}
}
