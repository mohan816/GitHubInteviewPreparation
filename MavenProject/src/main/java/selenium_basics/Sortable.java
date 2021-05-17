package selenium_basics;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver moh=new ChromeDriver();
		moh.get("http://www.leafground.com/pages/sortable.html");
		List<WebElement> source=moh.findElementsByXPath("//ul[@id='sortable']");
		WebElement source1=source.get(0);
		WebElement target=source.get(5);
	
		//WebElement target=moh.findElementByXPath("//ul[@id='sortable']/li[6]");
		Actions builder=new Actions(moh);
		builder.clickAndHold(source1).moveToElement(target).release(source1).build().perform();
		

	}

}
