package SOF304_Bai6;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class kiemTraTieuDe {
	WebDriver webDriver;
  @Test
  public void kiemTraTieuDeAP() {
	  WebDriverManager.chromedriver().setup();
	  webDriver = new ChromeDriver();
	  String url = "https://ap.poly.edu.vn/";
	  webDriver.get(url);
	  
	  assertEquals(webDriver.getTitle(), "Cao đẳng FPT Polytechnic");
	  webDriver.close();
  }
}
