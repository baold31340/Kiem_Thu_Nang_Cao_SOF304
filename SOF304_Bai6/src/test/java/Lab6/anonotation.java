package Lab6;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class anonotation {
	@Test
	public void unitLevel1() {
		System.out.println("testClass: Unit level1 testing");
	}
	
	@Test
	public void unitLevel2() {
		System.out.println("testClass: Unit level2 testing");
	}

	
	@Parameters("param")
	@BeforeMethod
	public void beforeMethod(String p) {
		System.out.println("testClass: before Method with Param: "+p);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("testClass: after Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("testClass: before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("testClass: after Method");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("testClass: before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("testClass: after test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("testClass: before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("testClass: after suite");
	}

}
