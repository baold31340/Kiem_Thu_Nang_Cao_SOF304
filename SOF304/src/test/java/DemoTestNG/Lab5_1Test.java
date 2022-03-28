package DemoTestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab5_1Test {

	

	@Test (groups = "LMS")
	public void timKiemLMSFpoly() {
		WebDriverManager.chromedriver().setup();
		WebDriver webDriver = new ChromeDriver();
		String url = "https://lms.poly.edu.vn/";
		String title_website = "Learning Management System | Hệ thống quản trị học tập | FPT Polytechnic Việt Nam";
		String title_expected ="";
		webDriver.manage().window().maximize();
		webDriver.get(url);
		title_expected = webDriver.getTitle();

		assertEquals(title_expected, title_website);
		webDriver.close();
	}
	
	
//	@Test
//	public void loginFacebook() {
//		WebDriverManager.chromedriver().setup();
//		WebDriver webDriver = new ChromeDriver();
//		String url = "https://www.facebook.com/";
//		webDriver.manage().window().maximize();
//		webDriver.get(url);
//		webDriver.findElement(By.name("email")).sendKeys("0965718906");
//		webDriver.findElement(By.name("pass")).sendKeys("Hieu113.");
//		webDriver.findElement(By.name("login")).click();
////		WebElement webElement = webDriver.findElements(By.name("login")).get(1);
////		Actions actions = new Actions(webDriver).click(webElement);
////		actions.build().perform();
////		webDriver.close();
//	}
}
