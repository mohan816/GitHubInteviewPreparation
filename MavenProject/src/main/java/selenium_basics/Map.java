package selenium_basics;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Map {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.zoomcar.com/chennai/search/query?lat=12.9416037&lng=80.2362096&starts=2021-04-24%2008%3A00&ends=2021-04-26%2014%3A00&type=zoom_later&bracket=no_fuel");
		List<WebElement> cars = driver.findElements(By.xpath("//div[@class='details']/h3"));
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='price']"));
		System.out.println(cars.size());
		//System.out.println(prices.getText());
		System.out.println(prices.size());
		HashMap<String, Integer> car=new HashMap<String, Integer>();
	for(int i=0;i<cars.size();i++) {
			
			String text = cars.get(i).getText();
			Integer amount = Integer.parseInt(prices.get(i).getText().replaceAll("\\D", ""));
			car.put(text, amount);
			
		}
		int maxAmount=Integer.MIN_VALUE;
		for (Entry<String, Integer> webElement : car.entrySet()) {
			//System.out.println(webElement.getKey());
			//System.out.println(webElement.getValue());
			Integer amount = webElement.getValue();
			maxAmount = Math.max(maxAmount, amount);
		}
		System.out.println(maxAmount);
			for (Entry<String, Integer> webElement : car.entrySet()) {
				
			Integer	amount = webElement.getValue();
			if(amount==maxAmount)
			{
				System.out.println(webElement.getKey());;
				break;
			}
				
			}
			
		}
		
		
	}

	

