package NangCao;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Bai4_2 {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://live.techpanda.org/");
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

		driver.findElement(By.className("level0")).click();
		assertEquals(driver.getTitle(), "Mobile");

		String before = driver.findElement(By.xpath("//span[contains(text(),'$100.00')]")).getText();
		driver.findElement(By.xpath("//a[contains(text(),'Sony Xperia')]")).click();
		String after = driver.findElement(By.xpath("//span[contains(text(),'$100.00')]")).getText();
		assertEquals(before, after);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
