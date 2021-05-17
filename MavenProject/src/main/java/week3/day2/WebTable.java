package week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/table.html");
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		int web=findElements.size();
		System.out.println(web);
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='table_id']//tr/th"));
		int web1=column.size();
		System.out.println(web1);
		WebElement percentage=driver.findElement(By.xpath("//td[text()='Learn to interact with Elements']//following::td"));
		percentage.getText();
		System.out.println(percentage);
		

			
		
		
		
		

	}

}
