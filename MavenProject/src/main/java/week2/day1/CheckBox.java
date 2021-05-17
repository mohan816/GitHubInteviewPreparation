package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		WebElement findElement = driver.findElement(By.xpath("//div[@class='example']/div[1]/input"));
		WebElement findElement1 = driver.findElement(By.xpath("//div[@class='example']/div[2]/input"));
		findElement.click();
		findElement1.click();
		WebElement isChecked = driver.findElement(By.xpath("//div[@class='example'][2]/div/input"));
		boolean selected = isChecked.isSelected();
		System.out.println(selected);
		if(selected==true) {
		System.out.println("Checkbox is Checked");
		//div[@class='example'][3]/div[2]/input
		WebElement mohan = driver.findElement(By.xpath("//div[@class='example'][3]/div[2]/input"));
		mohan.click();
		
		

	}

}
}
