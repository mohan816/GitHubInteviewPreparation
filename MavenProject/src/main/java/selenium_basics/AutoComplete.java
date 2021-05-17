package selenium_basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/search?q");
		driver.findElementByName("q").sendKeys("C");
		List<WebElement> allElements=driver.findElementsByXPath("//ul[@class='erkvQe']/li");
		int totalSize=allElements.size();
		System.out.println(totalSize);
		allElements.get(6).click();
		
		
		

	}

}
