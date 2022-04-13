package SOF304_ASM1;

import org.junit.runner.*;

/**
 * @author BUI_QUANG_HIEU
 *
 */
public class TestRunner {
	public static void main(String[] args) {
		JUnitCore runner = new JUnitCore();
		Result result = runner.run(TestSuite.class);
		System.out.println("\n-----------------------------------------");
		System.out.println("run tests: "+ result.getRunCount());
		System.out.println("failed tests: "+ result.getFailureCount());
		System.out.println("ignored tests: "+ result.getIgnoreCount());
		System.out.println("success: "+ result.wasSuccessful());
	}
}
