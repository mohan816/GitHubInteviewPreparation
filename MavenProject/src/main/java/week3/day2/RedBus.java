package week3.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		String Unique;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Koyambedu, Chennai");
		driver.findElement(By.xpath("//li[@data-no='1']")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Madurai, All Locations");
		Thread.sleep(5000);
		driver.findElement(By.id("onward_cal")).click();
		//Select Date

		driver.findElement(By.xpath("//td[contains(text(),'4')]")).click();
		//Select Buses
		driver.findElement(By.id("search_btn")).click();
		WebElement numberofbuses = driver.findElement(By.xpath("//span[text()='found']/span"));
		String moh =numberofbuses.getText();
		System.out.println(moh.replaceAll("[a-zA-z]", ""));

		List<String> newList=new ArrayList<String>();

		//ul[@class='bus-items']/div
		//To print the names of all buses
		List<WebElement> getBusName = driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));

		/*for (WebElement print : totalBuses) {
		String all=	print.getText();
		System.out.println(all);
		}*/
		for (WebElement busName : getBusName) {
			newList.add(busName.getText());

		}
		Set<String> remove=new LinkedHashSet<String>(newList);
		for (String string : remove) {
			System.out.println(string);
		}



		//To get the total Number
		List<WebElement> totalBuses = driver.findElements(By.xpath("//ul[@class='bus-items']/div"));
		int total =totalBuses.size();
		System.out.println(total);
		/*List<String> names=new ArrayList<String>();
		Set<String> name = new LinkedHashSet <String>();
		for(int i=1; i<=total; i++) {

			List<WebElement> findElements = driver.findElements(By.xpath("//ul[@class='bus-items']/div[i]"));
		WebElement s=	findElements.get(5);
		System.out.println(s);
		}*/
		/*List<WebElement> getBusName = driver.findElements(By.className("column-two p-right-10 w-30 fl"));

		/*for (WebElement print : totalBuses) {
		String all=	print.getText();
		System.out.println(all);
		}
		for (WebElement busName : getBusName) {
			String Unique =busName.getText();
			System.out.println(Unique);
		}*/
		Thread.sleep(5000);
		WebElement screenShot=driver.findElement(By.xpath("//div[@class='clearfix m-top-16']/div[2]"));
		screenShot.sendKeys(Keys.ENTER);

		File source =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File target=new File("./snaps/New.png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot Captured");








	}

}
