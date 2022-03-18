
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
		exception.expectMessage("Invalid age: " + 17);
		new Person("Hieubq", 17);
		new Person("Hieubq", 66);
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testExpectedException2() {
		new Person("Hieubq", 17);
		new Person("Hieubq", 66);
	
	}
	
	@Test
	public void testExpectedException3() {
		
		try {
			new Person("Hieubq", 66);
			new Person("Hieubq", 17);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println("Bắt được tình huống ngoại lệ");
		}
	}
	
	@Test
	public void testExpectedException4() {
		
		try {
			new Person("Hieubq", 66);
			new Person("Hieubq", 17);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
		}
	}
	
	
}
