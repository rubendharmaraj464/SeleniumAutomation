package module;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BrowserSetup {

	public static void main(String[] args) throws Exception 
	{
		    System.setProperty("webdriver.chrome.driver", "D:\\Selenium Java\\Software\\chromedriver_win32\\chromedriver.exe");
	   		
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
			
			driver.manage().window().maximize();
			
			//code

			String Title = driver.getTitle();
			System.out.println(Title);
			
			  if(Title.contentEquals("Web Orders Login")) 
			  {
				  System.out.println("URL is successfuly launched ");
				  
			  }
			  else
			  {
				  File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				  FileHandler.copy(file ,new File("D:\\TestAutomation\\Screenshots\\URLpAGE.png"));
				  System.out.println("URL is not launched");
			  }

	}

}
