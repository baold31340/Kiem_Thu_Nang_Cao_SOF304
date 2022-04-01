package Lab6;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class firsttestngfile {
	WebDriver webDriver;

	@Test
	public void kiemTraTieuDeAPVoiAnotion() {
		String url = "https://lms.poly.edu.vn/";
		webDriver.get(url);

		assertEquals(webDriver.getTitle(), "Learning Management System | Hệ thống quản trị học tập | FPT Polytechnic Việt Nam");
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
