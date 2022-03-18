
import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class JUnitMessageTest {

	JUnitMessage jUnitMessage;
	public String message = "FPoly exception";
	
	@Before
	public void setUp() throws Exception {
		jUnitMessage = new JUnitMessage(message);
	}

	@After
	public void tearDown() throws Exception {
		jUnitMessage =null;
	}

//	private JUnitMessage createTestSubject() {
//		return new JUnitMessage("");
//	}

	@Test(expected = ArithmeticException.class)
	public void testPrintMessage() throws Exception {
		System.out.println("FPoly JUnit Message exception is printing");
		jUnitMessage.printMessage();
	}

	@Test
	public void testPrintHiMessage() throws Exception {
		message = "Hi!" + message;
		System.out.println("FPoly JUnit Message is printing");
		assertEquals(message, jUnitMessage.printHiMessage());
	}
}