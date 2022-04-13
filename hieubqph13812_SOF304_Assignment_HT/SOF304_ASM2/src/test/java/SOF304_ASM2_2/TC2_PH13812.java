package SOF304_ASM2_2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TC2_PH13812 {

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
		driver.findElement(By.xpath(
				"//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[2]/div[1]/div[3]/ul[1]/li[2]/a[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[3]/div[1]/div[3]/ul[1]/li[2]/a[1]"))
				.click();
//		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/button[1]"))
//				.click();

		WebDriver webDriver2 = new ChromeDriver();
		webDriver2.get("http://live.techpanda.org/index.php/catalog/product_compare/index/");
		String title = webDriver2.findElement(By.xpath("//h1[contains(text(),'Compare Products')]")).getText();
		assertEquals(title, "COMPARE PRODUCTS");
		webDriver2.close();
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
