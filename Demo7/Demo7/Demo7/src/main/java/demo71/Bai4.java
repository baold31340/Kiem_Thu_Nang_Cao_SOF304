package demo71;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

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
		driver.findElement(By.className("level0")).click();
	}

	@Test
	public void Test4() {
		driver.get("http://live.techpanda.org/index.php/mobile.html");
		driver.get("http://live.techpanda.org/index.php/mobile/sony-xperia.html");
		assertEquals(driver.findElement(By.className("price")).getText().trim(), "$100.00");

	}

}
