package SOF304_ASM2_2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TC1_PH13812 {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://live.techpanda.org/");
	}

	@Test
	public void f() {

		driver.findElements(By.className("level0")).get(0).click();
		driver.findElements(By.className("btn-cart")).get(1).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).clear();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).sendKeys("1000");
		driver.findElement(By.xpath("//span[contains(text(),'Empty Cart')]")).click();
		String errorString = driver.findElement(By.xpath("//h1[contains(text(),'Shopping Cart is Empty')]")).getText();
		assertEquals(errorString, "SHOPPING CART IS EMPTY");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
