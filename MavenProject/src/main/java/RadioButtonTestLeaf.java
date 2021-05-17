import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonTestLeaf {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/");
		driver.findElementByXPath("//img[@alt='Radio Button']").click();
		driver.findElement(By.id("no")).click();
		/*WebElement yesClick=driver.findElementByXPath("//label[@for='yes']/input");
		yesClick.click();*/
		WebElement unChecked=driver.findElementByXPath("//label[@for='Unchecked']/input[@value='0']");
		boolean isSelected=unChecked.isSelected();
		if(isSelected==true)
		{
			System.out.println("already selected");}

		else {
			System.out.println("not selected");

		}
		System.out.println("isSelected" + isSelected);
		WebElement isChecked=driver.findElementByXPath("//label[@for='Checked']/input[@value='1']");
		boolean yesChecked= isChecked.isSelected();
		if(yesChecked==true)
		{
			System.out.println("already selected");}

		else {
			System.out.println("not selected");

		}
		//div[@class='large-6 small-12 columns']/input[@value='0']
		WebElement ageGroup1=driver.findElementByXPath("//div[@class='large-6 small-12 columns']/input[@value='0']");
		WebElement ageGroup =driver.findElementByXPath("//div[@class='large-6 small-12 columns']/input[@value='1']");
		if(ageGroup.isSelected())
		{
			System.out.println("Choice is already selected");
		}
		//WebElement ageGroup1=driver.findElementByXPath("//div[@class='large-6 small-12 columns']/input[@value='0']");
		else if(ageGroup1.isSelected()){
			ageGroup1.click();}
		else
		{
			WebElement ageGroup2 =driver.findElementByXPath("//div[@class='large-6 small-12 columns']/input[@value='1']");
			ageGroup2.click();
		}
	} 



}





