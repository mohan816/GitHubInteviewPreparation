package selenium_basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//*[text()='OK']").click();
	  
		driver.findElementByPartialLinkText("FLIGHTS").click();
		 Set<String> allWindowHandles=driver.getWindowHandles();
		 //allWindowHandles.size()
		 /*for (String eachHandle : allWindowHandles) {
			 System.out.println(eachHandle);
			
		}
		   */
		   List<String> totalWindows=new ArrayList<String>(allWindowHandles);
		   
		   driver.switchTo().window(totalWindows.get(0));
		   driver.close();
		
		
		
		
		

	}

}
