package SOF304_Bai6;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class kiemThuTieuDeVoiParemeter2 {
	WebDriver webDriver;

	@Parameters({"fpoly","noiDung"})
	@Test
	public void kiemTraTieuDeTrangWeb(String name, String noiDung) {

		webDriver.get(name);

		assertEquals(webDriver.getTitle(), "Cao đẳng FPT Polytechnic");
		System.out.println("Kiểm tra tiêu đề trang "+ name + " " + noiDung);
		System.out.println("done !");
	}

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		webDriver = new ChromeDriver();
		System.out.println("Start Test");
	}

	@AfterTest
	public void afterTest() {
		webDriver.close();
		System.out.println("Stop Test");
	}
}
