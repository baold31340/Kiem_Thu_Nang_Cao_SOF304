package DemoTestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersTest {
//	private String inputString;
//	private String expected;


	@Parameters({ "title_website","url" })
	@Test
	public void test(String title_website, String url) {
		WebDriverManager.chromedriver().setup();
		WebDriver webDriver = new ChromeDriver();
		String title_expected ="";
		webDriver.manage().window().maximize();
		webDriver.get(url);
		title_expected = webDriver.getTitle();

		assertEquals(title_expected, title_website);
		webDriver.close();

	}
}
