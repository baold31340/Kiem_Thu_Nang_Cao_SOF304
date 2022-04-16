package KiemTraThu;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TC_1 {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://live.techpanda.org/");

	}

	@Test
	public void f() {
		driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("//header/div[1]/div[5]/div[1]/ul[1]/li[1]/a[1]")).click();
		driver.findElement(
				By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/a[1]")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Hieu");
		driver.findElement(By.xpath("//input[@id='middlename']")).sendKeys("Quang");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Bui");
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("hieubqph13808@fpt.edu.vn");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='is_subscribed']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();

		String kqThucTe = driver.findElement(By.xpath("//strong[contains(text(),'Hello, Hieu Quang Bui!')]")).getText();
		assertEquals("Hello, Hieu Quang Bui!", kqThucTe);

		driver.findElement(By.xpath("//a[contains(text(),'TV')]")).click();
		driver.findElement(By.xpath(
				"//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[3]/ul[1]/li[1]/a[1]"))
				.click();
		driver.findElement(By.xpath("//span[contains(text(),'Share Wishlist')]")).click();
		driver.findElement(By.xpath("//textarea[@id='email_address']")).sendKeys("buiquanghieu@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Bui Quang Hieu");
		driver.findElement(By.xpath("//span[contains(text(),'Share Wishlist')]")).click();

		String kqSendThucTe = driver.findElement(By.xpath("//span[contains(text(),'Your Wishlist has been shared.')]"))
				.getText();
		assertEquals("Your Wishlist has been shared.", kqSendThucTe);
	}

	@AfterTest
	public void afterTest() {
//	  driver.close();
	}

}
