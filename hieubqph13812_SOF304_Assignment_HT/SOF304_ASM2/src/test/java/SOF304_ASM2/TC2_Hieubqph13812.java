package SOF304_ASM2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TC2_Hieubqph13812 {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://live.techpanda.org/");
	}

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void f() {
		exception.expect(IllegalArgumentException.class);
		driver.findElements(By.className("level0")).get(0).click();
		driver.findElements(By.className("btn-cart")).get(0).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).clear();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).sendKeys("-1");

		driver.findElement(By.xpath("//span[contains(text(),'Empty Cart')]")).click();

	}

	@Test
	public void f2() {
		driver.findElements(By.className("level0")).get(0).click();
		driver.findElements(By.className("btn-cart")).get(0).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).clear();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).sendKeys("1");

		driver.findElement(By.xpath("//span[contains(text(),'Empty Cart')]")).click();
		String errorString = driver.findElement(By.xpath("//h1[contains(text(),'Shopping Cart is Empty')]")).getText();
		assertEquals(errorString, "SHOPPING CART IS EMPTY");

	}

	@Test
	public void f3() {
		driver.findElements(By.className("level0")).get(0).click();
		driver.findElements(By.className("btn-cart")).get(0).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).clear();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).sendKeys("0");
		driver.findElement(By.xpath("//span[contains(text(),'Empty Cart')]")).click();
		String errorString = driver.findElement(By.xpath("//h1[contains(text(),'Shopping Cart is Empty')]")).getText();
		assertEquals(errorString, "SHOPPING CART IS EMPTY");

	}

	@Test
	public void f4() {
		driver.findElements(By.className("level0")).get(0).click();
		driver.findElements(By.className("btn-cart")).get(0).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).clear();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).sendKeys("499");
		driver.findElement(By.xpath("//span[contains(text(),'Empty Cart')]")).click();
		String errorString = driver.findElement(By.xpath("//h1[contains(text(),'Shopping Cart is Empty')]")).getText();
		assertEquals(errorString, "SHOPPING CART IS EMPTY");

	}

	@Test
	public void f5() {
		driver.findElements(By.className("level0")).get(0).click();
		driver.findElements(By.className("btn-cart")).get(0).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).clear();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).sendKeys("500");
		driver.findElement(By.xpath("//span[contains(text(),'Empty Cart')]")).click();
		String errorString = driver.findElement(By.xpath("//h1[contains(text(),'Shopping Cart is Empty')]")).getText();
		assertEquals(errorString, "SHOPPING CART IS EMPTY");

	}

	@Test
	public void f6() {
		exception.expect(IllegalArgumentException.class);
		driver.findElements(By.className("level0")).get(0).click();
		driver.findElements(By.className("btn-cart")).get(0).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).clear();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).sendKeys("501");
		driver.findElement(By.xpath("//span[contains(text(),'Empty Cart')]")).click();
		String errorString = driver.findElement(By.xpath("//h1[contains(text(),'Shopping Cart is Empty')]")).getText();
		assertEquals(errorString, "SHOPPING CART IS EMPTY");

	}

	@DataProvider(name = "duLieu")
	public Object[][] dp() {
		return new Object[][] { { -1 }, { 0 }, { 1 }, { 499 }, { 500 }, { 501 } };
	}

	@Test(dataProvider = "duLieu")
	public void kiemTraTieuDeCacTrangWeb2(int value) {
		exception.expect(IllegalArgumentException.class);
		driver.findElements(By.className("level0")).get(0).click();
		driver.findElements(By.className("btn-cart")).get(0).click();
//			  driver.findElement(By.className("input-text")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).clear();
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).sendKeys(String.valueOf(value));
		driver.findElement(By.xpath("//span[contains(text(),'Empty Cart')]")).click();
		

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
