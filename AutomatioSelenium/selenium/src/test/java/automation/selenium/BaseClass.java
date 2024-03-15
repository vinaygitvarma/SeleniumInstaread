package automation.selenium;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;

	@BeforeClass
	public void capabiliies() throws IOException {
		// ChromeOptions options = new ChromeOptions();
		String filePath = System.getProperty("user.dir") + "/TestData.properties";
		FileReader reader = new FileReader(filePath);
		Properties props = new Properties();
		props.load(reader);
		System.out.println(props.getProperty("browser"));
		if(props.getProperty("browser").equals("chrome")) {
			System.out.println("test");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
	}

//	@BeforeClass(dependsOnMethods = "capabiliies")
//	public void browser() {
//		driver.get("https://instaread.co/");
//	}
}
