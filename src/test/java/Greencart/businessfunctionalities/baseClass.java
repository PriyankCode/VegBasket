package Greencart.businessfunctionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {

	public static String driverPath = System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe";
	public WebDriver driver;
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
	}
	
	public void Endup() {
		driver.close();
		
	}
	
}
