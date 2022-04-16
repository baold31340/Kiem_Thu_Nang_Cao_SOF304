package SOF304_ASM2_2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NiemJava4 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.name("email")).sendKeys("0395962002");
	  driver.findElement(By.name("pass")).sendKeys("Hieu2809.");
	  driver.findElement(By.name("login")).click();
	  
//	  driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[2]/span[1]/span[1]/div[1]/div[1]/svg[1]/path[1]")).click();
//	  driver.findElement(By.xpath("//body/div[@id='mount_0_0_kj']/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[2]/span[1]/span[1]/div[1]/div[1]/*[1]")).click();
	  //	  driver.findElement(By.xpath("//body/div[@id='mount_0_0_eP']/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]")).click();
//	  driver.findElement(By.xpath("//body/div[@id='mount_0_0_eP']/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]")).sendKeys("Nguyễn Ngọc Bích Hoa");
  }
  @BeforeTest
  public void beforeTest() {
	  
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
  }

  @AfterTest
  public void afterTest() {
	  
//	  driver.close();
  }

}
