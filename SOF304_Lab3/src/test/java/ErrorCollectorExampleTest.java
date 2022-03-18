import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;

public class ErrorCollectorExampleTest {

	@Rule
	public ErrorCollector collector = new ErrorCollector();

	@Test
	public void example() {
		collector.addError(new Throwable("Lỗi ở dòng 1"));
		collector.addError(new Throwable("Lỗi ở dòng 2"));

		System.out.print("Hello ");
		
		try {
			
			Assert.assertTrue("A"=="A");
		} catch (Throwable e) {
			collector.addError(e);
		}

		System.out.println("Bùi Quang Hiếu");
	}
}
