package demo71;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bai4 {
	WebDriver driver;

	@BeforeTest
	public void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://live.techpanda.org/");

	}

	@AfterTest
	public void destroy() {
		driver.close();
	}

	@Test
	public void Test1() {
		assertEquals(driver.getTitle(), "Home page");
	}

	@Test
	public void Test2() {
		String exp = driver.findElement(By.tagName("h2")).getText();
		System.out.println(exp);
		assertEquals(exp.trim(), "THIS IS DEMO SITE FOR");
	}

	@Test
	public void Test3() {
		int i = 0;
		driver.get("http://live.techpanda.org/index.php/mobile.html");
		assertEquals(driver.getTitle(), "Mobile");
		
		Select selectBox = new Select(driver.findElement(By.tagName("select")));
		selectBox.selectByValue("http://live.techpanda.org/index.php/mobile.html?dir=asc&order=name");
		List<WebElement> list = driver.findElements(By.className("product-name"));
		String mongmuon[] = { "IPHONE", "SAMSUNG GALAXY", "SONY XPERIA" };
		for (WebElement x : list) {

			assertEquals(x.getText().trim(), mongmuon[i].trim());
			i++;
		}
	}

	@Test
	public void Test4() {
		driver.get("http://live.techpanda.org/index.php/mobile.html");
		driver.get("http://live.techpanda.org/index.php/mobile/sony-xperia.html");
		assertEquals(driver.findElement(By.className("price")).getText().trim(), "$100.00");

	}

}
