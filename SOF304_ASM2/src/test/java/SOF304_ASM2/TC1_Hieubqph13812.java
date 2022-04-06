package SOF304_ASM2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TC1_Hieubqph13812 {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://live.techpanda.org/");
	}

	@Test
	public void f() {
		driver.findElement(By.className("level0")).click();
		String before=  driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/h2[1]/a[1]")).getText();
		System.out.println(before);
		driver.findElement(By.xpath(" //body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/h2[1]/a[1]")).click();
		String after=  driver.findElement(By.xpath("//span[contains(text(),'Sony Xperia')]")).getText();
		System.out.println(after);
		
		assertEquals(before, after);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
