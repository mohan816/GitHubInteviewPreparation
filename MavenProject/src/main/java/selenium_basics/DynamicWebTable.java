package selenium_basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {
	

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://erail.in/trains-between-stations/new-delhi-NDLS/mumbai-central-BCT");
		List<WebElement> headerRows=driver.findElements(By.xpath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']//tr"));
		int totalHeader=headerRows.size();
		System.out.println(totalHeader);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		int totalRows=rows.size();
		System.out.println(totalRows);
	/*	if(a==1)
		{
			List<WebElement> headerColumns=driver.findElements(By.xpath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']//tr["+a+"]/td"));
			for(int b=1;b<=headerColumns.size();b++)
			{
				WebElement headerText=driver.findElement(By.xpath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']//tr["+a+"]/td["+b+"]"));
				//WebElement headerText=driver.findElement(By.xpath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']//tr["+a+"]/td["+b+"]"));

				
		
	*/


				for(int i=1;i<=totalRows;i++)
				{
					List<WebElement> columns = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td"));
					for(int j=1;j<=columns.size();j++)
					{
						WebElement text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td["+j+"]"));
						
						
						System.out.println(text.getText());

					}

				}
			
		
		
		driver.quit();
	}

}


