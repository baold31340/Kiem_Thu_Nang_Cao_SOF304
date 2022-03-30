package DemoTestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
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

//	@DataProvider(name = "dataPr")
//	public static Object[][] dataProviderMethod() {
//		return new Object[][] { { "aaa", 111, true }, { "bbb", 222, false } };
//	}
//
//	@Test(dataProvider = "dataPr")
//	public void test(String data, int number, boolean condition) {
//		System.out.println("data: " + data + " number: " + number + " condition: " + condition);
//	}
//	
//	@Parameters({ "BrowserName" })
//	@Test
//	public void kiemTraTen( String url) {
//		System.out.println(url);
//	}
//
//	@Parameters({ "OptionalValue" })
//	@Test
//	public void kiemTraTenWeb(@Optional("OptionalValue") String url) {
//		System.out.println(url);
//	}
}
