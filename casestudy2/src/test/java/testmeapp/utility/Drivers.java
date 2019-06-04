package testmeapp.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Drivers {
	@Test
	public static WebDriver give(String s)
	{
		if(s.equals("chrome"))
		{
			String chromePath="C:\\seleniumfol\\chromedriver_win32\\chromedriver.exe";
			
			  System.setProperty("webdriver.chrome.driver", chromePath);
			 return new ChromeDriver();
	}
		else if(s.equals("Internetexplorer"))
		{
			String iePath="C:\\seleniumfol\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver",iePath);
			return new InternetExplorerDriver();
					
		}
		else
			return null;
	}
		}
	
 
