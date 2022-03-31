package SOF304_Bai6;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class kiemThuTieuDeVoiParameter {
	WebDriver webDriver;

	@Parameters("fpoly")
	@Test
	public void kiemTraTieuDeTrangWeb(String name) {

		webDriver.get(name);

		assertEquals(webDriver.getTitle(), "Cao đẳng FPT Polytechnic");
		System.out.println("done !");
	}

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		webDriver = new ChromeDriver();
		System.out.println("Start Test");
	}

	@AfterTest
	public void afterTest() {
		webDriver.close();
		System.out.println("Stop Test");
	}

}
