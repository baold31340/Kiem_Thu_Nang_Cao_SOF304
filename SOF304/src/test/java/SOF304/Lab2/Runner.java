package SOF304.Lab2;

import org.junit.runner.JUnitCore;

/**
 * @author BUI_QUANG_HIEU
 *
 */
public class Runner {
	public static void main(String[] args) {
		JUnitCore runner = new JUnitCore();
		org.junit.runner.Result result = runner.run(giaiThuaTest.class);
		System.out.println("run tests: "+ result.getRunCount());
		System.out.println("failed tests: "+ result.getFailureCount());
		System.out.println("ignored tests: "+ result.getIgnoreCount());
		System.out.println("success: "+ result.wasSuccessful());
	}
}
