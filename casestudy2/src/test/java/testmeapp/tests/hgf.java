package testmeapp.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import testmeapp.utility.Drivers;


public class hgf {
	WebDriver  driver;
    String url="http://10.232.237.143:443/TestMeApp/";
	@Test
  public void crossbrowser() 
	{
	 driver=Drivers.give("chrome");
	driver.get(url);
		}
	@Test(priority=1)
	public void signin() throws InterruptedException
	{
		driver.findElement(By.linkText("SignUp")).click();
		driver.findElement(By.name("userName")).sendKeys("mahalakshmi");
		Thread.sleep(3000);
		driver.findElement(By.id("err")).click();
		String available=driver.findElement(By.id("err")).getText();
		if(available.equals("Available"))
		{	
		
		driver.findElement(By.name("firstName")).sendKeys("maha");
		driver.findElement(By.name("lastName")).sendKeys("lakshmi");
		driver.findElement(By.name("password")).sendKeys("12345678");
		
		driver.findElement(By.name("confirmPassword")).sendKeys("12345678");
		driver.findElement(By.xpath("(//input[@id='gender'])[@value='Female']")).click();
		driver.findElement(By.id("emailAddress")).sendKeys("maha@gmail.com");
		driver.findElement(By.id("mobileNumber")).sendKeys("9865765430");
		driver.findElement(By.id("dob")).sendKeys("20/03/1998");
		driver.findElement(By.id("address")).sendKeys("bangalore");
		driver.findElement(By.id("securityQuestion")).click();
		
		 Actions action=new Actions(driver);
		 action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.name("answer")).sendKeys("red");
		driver.findElement(By.name("Submit")).click();
	}

	}

}
