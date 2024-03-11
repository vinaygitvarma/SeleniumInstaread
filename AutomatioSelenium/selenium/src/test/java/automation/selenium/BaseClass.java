package automation.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;

	@BeforeClass
	public void capabiliies() {
		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@BeforeClass(dependsOnMethods = "capabiliies")
	public void browser() {
		driver.get("https://instaread.co/");
	}
}
