package selenium_basics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement findElementByLinkText = driver.findElementByXPath("//a[@class='desktop-main']");
		Actions builder = new Actions(driver);
		builder.moveToElement(findElementByLinkText).perform();
		driver.findElementByPartialLinkText("Casual").click();
		List<WebElement> total=driver.findElementsByXPath("//ul[@class='results-base']/li");
		int size=total.size();
		System.out.println(size);
	WebElement text=driver.findElement(By.xpath("//ul[@class='results-base']"));
	System.out.println(text);
		
		

	}

}
