package module;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HomePage {

	public static void main(String[] args) throws Exception 
	{
		
     
System.setProperty("webdriver.chrome.driver", "D:\\Selenium Java\\Software\\chromedriver_win32\\chromedriver.exe");
   		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Te");
		Thread.sleep(5000);
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		Thread.sleep(5000);
		String hOMEpAGEtITLE = driver.getTitle();
		if(hOMEpAGEtITLE.equalsIgnoreCase("Web Orders"))
		{
			System.out.println("TC002  Validate Login : Login is successfull ");  
		}
		else
		{
			  File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  FileHandler.copy(file ,new File("D:\\TestAutomation\\Screenshots\\TC002.png"));
			System.out.println("TC002  Validate Login  :Login is not successfull "); 
		}

	}

}
