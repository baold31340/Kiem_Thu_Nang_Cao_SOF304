package Lab6;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class lab6_3 {
	WebDriver webDriver;

	

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		webDriver = new ChromeDriver();
		System.out.println("kiem tra dang nhap website Guru99/v4");
		webDriver.get("http://www.demo.guru99.com/V4/");
		webDriver.findElement(By.name("uid")).sendKeys("mngr394913");
		webDriver.findElement(By.name("password")).sendKeys("revegAz");
		webDriver.findElement(By.name("btnLogin")).click();
	}
	
	
	@Test
	public void kiemTraLogionDungTrang() {
		assertEquals(webDriver.getCurrentUrl(), "https://www.demo.guru99.com/V4/manager/Managerhomepage.php");
		System.out.println("Đăng nhập đúng trang");
	}
	
	
	@Test
	public void kiemTraLoginDungTieuDe() {
		assertEquals(webDriver.getTitle(), "Guru99 Bank Manager HomePage");
		System.out.println("Tiêu đề của trang web là: "+webDriver.getTitle());
	}
	
	@Test
	public void kiemTraLoginDungChaoMung() {
		String chaoMungString = webDriver.findElement(By.className("heading3")).getText();
		assertEquals(chaoMungString, "Welcome To Manager's Page of Guru99 Bank");
		System.out.println("Dòng chào mừng của trang web là: "+chaoMungString);
	}

	@AfterTest
	public void afterTest() {
		webDriver.close();
	}

}
