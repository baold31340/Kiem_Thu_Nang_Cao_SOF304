package Lab6;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab6_3_lms {

	@Parameters({ "url", "user", "password" })
	@Test
	public void testTieuDe(String url, String user, String password) {
		WebDriver webDriver;
		WebDriverManager.chromedriver().setup();
		webDriver = new ChromeDriver();
		System.out.println("kiem tra dang nhap website Guru99/v4");
		webDriver.get(url);
		webDriver.findElement(By.name("uid")).sendKeys(user);
		webDriver.findElement(By.name("password")).sendKeys(password);
		webDriver.findElement(By.name("btnLogin")).click();

//		Alert alert = webDriver.switchTo().alert();

		
		try {
			assertEquals(webDriver.getTitle(), "Guru99 Bank Manager HomePage");
			System.out.println("Tiêu đề của trang web là: " + webDriver.getTitle());
		} catch (Exception e) {
			System.out.println("Tên đăng nhập hoặc mật khẩu bị sai !");
		}
		webDriver.close();

//		
	}
}
