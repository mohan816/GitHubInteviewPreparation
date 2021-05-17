package selenium_basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://chennaicorporation.gov.in/online-civic-services/birthCertificate.do?do=show");
		File Source=driver.getScreenshotAs(OutputType.FILE);
		File target=new File("./selenium_basics/radio.png");
		FileUtils.copyFile(Source, target);
		driver.findElementByName("registrationNumber").sendKeys("156");

		driver.findElementByName("childName").sendKeys("Mohan");
		WebElement femaleGender = driver.findElementByXPath("//input[@value='M']");
		femaleGender.click();
		WebElement dropDown=driver.findElementByName("sel_day");
		dropDown.click();
		Select day=new Select(dropDown);
		day.selectByValue("25");
		WebElement monthDropDown=driver.findElementByName("sel_month");
		monthDropDown.click();
		Select month =new Select(monthDropDown);
		month.selectByVisibleText("October");
		WebElement yearDropDown=driver.findElementByName("sel_year");
		Select year=new Select(yearDropDown);
		year.selectByValue("1996");
		WebElement placeOfBirth = driver.findElementByXPath("//input[@value='2']");
		placeOfBirth.click();
		driver.findElementByName("nameOfFather").sendKeys("Natarajan");
		driver.findElementByName("nameOfMother").sendKeys("Rani");
		Thread.sleep(30000);
		driver.findElementByClassName("vote").click();
		String text = driver.findElementByClassName("tableRow").getText();
		System.out.println(text);
		
		



	}

}
