package pass2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TC2 {
	WebDriver driver;

	@DataProvider(name = "emailShare")
	public Object[][] dp() {
		return new Object[][] { { "124@gmail.com" }, { "125@gmail.com" }, { "126@gmail.com" }, { "127@gmail.com" },
				{ "128@gmail.com" } };
	}

	@Test(dataProvider = "emailShare")
	public void f(String email) {
		// TV
		driver.findElement(By.xpath("//a[contains(text(),'TV')]")).click();

		// Thêm vào yêu thích
		driver.findElement(By.xpath(
				"//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[3]/ul[1]/li[1]/a[1]"))
				.click();

		// Bấm share washlist
		driver.findElement(By.xpath("//span[contains(text(),'Share Wishlist')]")).click();

		// chèn email
		driver.findElement(By.xpath("//textarea[@id='email_address']")).sendKeys(email);

		// Bấm share
		driver.findElement(By.xpath("//span[contains(text(),'Share Wishlist')]")).click();

		// kiểm tra
		String sendString = driver.findElement(By.xpath("//span[contains(text(),'Your Wishlist has been shared.')]"))
				.getText();
		assertEquals(sendString, "Your Wishlist has been shared.");

	}

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://live.techpanda.org/");

		// bấm link account
		driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/a[1]/span[2]")).click();

		// bấm my account
		driver.findElement(By.xpath("//header/div[1]/div[5]/div[1]/ul[1]/li[1]/a[1]")).click();

		// create
		driver.findElement(By.xpath("//span[contains(text(),'Create an Account')]")).click();

		// nhập thông tin
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Bui");
		driver.findElement(By.xpath("//input[@id='middlename']")).sendKeys("Quang");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Hieu");
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("hieubq12345855@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys("123456");
		driver.findElement(By.xpath("//label[contains(text(),'Sign Up for Newsletter')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();

		// Lấy dòng chữ hello
		String hello = driver.findElement(By.xpath("//strong[contains(text(),'Hello, Bui Quang Hieu!')]")).getText();

		// Kiểm tra

		assertEquals(hello, "Hello, Bui Quang Hieu!");
	}

	@AfterTest
	public void afterTest() {
	}

}
