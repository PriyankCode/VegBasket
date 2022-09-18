package Greencart.teste2e;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Greencart.businessfunctionalities.baseClass;

public class addIntoCart extends baseClass 
{


	@BeforeClass
	public void driveSetup() {
		setUp();
	
	}
	
	

	@Test
	public void add2cart() throws InterruptedException {
		
		//Adding brocolli into Cart
		
		driver.findElement(By.xpath("//h4[text()='Brocolli - 1 Kg']/parent::div//div[3]//button")).click();
		driver.findElement(By.xpath("//div[@class='cart']//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(1000L);
		
		String totalAmount = driver.findElement(By.xpath("//span[@class='totAmt']")).getText();
		System.out.println(totalAmount);
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select")).click();
		Select s = new Select(driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select")));
		s.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		}

}
