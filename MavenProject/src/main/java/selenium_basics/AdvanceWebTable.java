package selenium_basics;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvanceWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sorttable.html");
	List<WebElement> headerList=driver.findElementsByXPath("//table[@id='table_id']/thead/tr/th");
	int headerListSize=headerList.size();
	System.out.println(headerListSize);
	for(int i=1;i<=headerListSize;i++)
	{
	WebElement headerPrint=driver.findElementByXPath("//table[@id='table_id']/thead/tr/th[" + i +"]");
	System.out.print(headerPrint.getText());
	System.out.print("         ");
	}
	List<WebElement> tableRows=driver.findElementsByXPath("//table[@id='table_id']//tbody/tr");
	for(int i=1;i<=tableRows.size();i++)
	{
		List<WebElement> tableColumns=driver.findElementsByXPath("//table[@id='table_id']//tbody/tr/td");
		int size=tableColumns.size();
		System.out.println("         ");
		for(int j=1;j<=3;j++)
		{
		WebElement tableText=driver.findElementByXPath("//table[@id='table_id']//tbody/tr["+i+"]  /td["+j+"]");
	String text=tableText.getText();
	System.out.print(text);
	//System.out.print("         ");
	
	
	
	
			
		}

	}

		

	}

}
