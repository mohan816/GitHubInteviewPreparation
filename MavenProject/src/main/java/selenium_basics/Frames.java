package selenium_basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
		WebElement frame = driver.findElement(By.id("Click"));
		frame.click();
		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		driver.switchTo().defaultContent();
		List<WebElement> totalTags=driver.findElementsByTagName("iframe");
		int tags=totalTags.size();
		System.out.println(tags);


		//WebElement nestedFrame=driver.findElement(By.id("frame2"));
		//WebElement nested=driver.findElement(By.id("frame2"));
		//driver.switchTo().frame(nested);
		//driver.findElement(By.id("Click1")).click();
		//driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();


		//driver.switchTo().defaultContent();




	}

}
