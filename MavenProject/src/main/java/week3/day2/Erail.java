package week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		TimeUnit seconds = null;
		driver.manage().timeouts().implicitlyWait(30, seconds);
	WebElement from=driver.findElement(By.id("txtStationFrom"));
	from.clear();
	from.sendKeys("MS");
	from.sendKeys(Keys.TAB);
	from.sendKeys(Keys.ENTER);
	WebElement to=driver.findElement(By.id("txtStationTo"));
	to.clear();
	to.sendKeys("Mdu");
	to.sendKeys(Keys.TAB);
	to.sendKeys(Keys.ENTER);
	driver.findElement(By.id("chkSelectDateOnly")).click();
	WebElement table =driver.findElement(By.tagName("tr"));
	List<WebElement> webTable= driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
	webTable.size();
	
	
	
	
	
	
		
		
		
	}

}
