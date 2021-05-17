package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OnlineBirthCertificateRegistrationForm {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.birthcertificate.org.in/application-form/?application=New%20Birth%20Certificate");
	WebElement	click =driver.findElement(By.id("datepicker"));
	click.click();
	click.sendKeys("25 / 07 / 2001");
		//driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).sendKeys("");
		 

	}

}
