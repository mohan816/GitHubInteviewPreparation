package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		 driver.switchTo().frame("iframeResult");
		 driver.findElement(By.xpath("//button[contains(text(),'Try')]")).click();
		 //driver.switchTo().defaultContent();
		 driver.switchTo().alert().accept();
		// driver.switchTo().frame("iframeResult");
	 WebElement findElement = driver.findElement(By.id("demo"));
	String text= findElement.getText();
	System.out.println(text);
	 
		
		

	}

}

