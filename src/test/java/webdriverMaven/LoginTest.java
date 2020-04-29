package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {
		

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();

	}

	@Test
	public void doLogin() {

		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("marco.bersani@spot.it");
		driver.findElement(By.id("identifierNext")).click();
		// driver.findElement(By.id("password")).sendKeys("sdsd");
		// driver.findElement(By.id("SignIn")).click();
		
	}

	@AfterSuite
	public void tearDown() {

		driver.quit();
	}

}
