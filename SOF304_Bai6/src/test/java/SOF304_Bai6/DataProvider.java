package SOF304_Bai6;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DataProvider {
	WebDriver webDriver;

	@Test(dataProvider = "duLieu")
	public void kiemTraTieuDeCacTrangWeb(String nameWeb) {
		webDriver.get(nameWeb);
		assertEquals(webDriver.getTitle(), "Cao đẳng FPT Polytechnic");

	}

	@org.testng.annotations.DataProvider(name = "duLieu")
	public Object[][] dp() {
		return new Object[][] { { "https://ap.poly.edu.vn/" }, { "https://lms.poly.edu.vn/" },
				{ "https://cms.poly.edu.vn/" } };
	}

	@org.testng.annotations.DataProvider(name = "duLieu2")
	public Object[][] dp2() {
		return new Object[][] { { "https://ap.poly.edu.vn/", "Cao đẳng FPT Polytechnic" },
				{ "https://lms.poly.edu.vn/",
						"Learning Management System | Hệ thống quản trị học tập | FPT Polytechnic Việt Nam" },
				{ "https://cms.poly.edu.vn/", "| FPT Polytechnic | Course Management System" } };
	}

	@Test(dataProvider = "duLieu2")
	public void kiemTraTieuDeCacTrangWeb2(String nameWeb, String webTitle) {
		webDriver.get(nameWeb);
		assertEquals(webDriver.getTitle(), webTitle);
		System.out.println("web: " + nameWeb + "| title: " + webTitle);
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
