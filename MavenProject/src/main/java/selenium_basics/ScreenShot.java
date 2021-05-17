package selenium_basics;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		Date date = new Date();
		String strDate=date.toString();
		String newTime=strDate.replaceAll(":", "");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Window.html");
		File source=driver.getScreenshotAs(OutputType.FILE);
		File target=new File("./snaps/window_"+newTime+".png");
		FileUtils.copyFile(source, target);
		

	}

}
