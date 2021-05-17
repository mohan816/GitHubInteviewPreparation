package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTC {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			
		}
		List<String> win=new ArrayList<String>(windowHandles);
		driver.switchTo().window(win.get(1));
		WebElement moh=driver.findElement(By.xpath("//a[@class='d-block font-weight-bold']"));
		moh.getText();
		System.out.println(moh);
		driver.switchTo().window(win.get(0));
		driver.close();

	}

}
