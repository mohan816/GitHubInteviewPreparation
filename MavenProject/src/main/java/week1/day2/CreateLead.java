package week1.day2 ;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class CreateLead extends BaseClass {
	@Test
	public void createLead(String Company,String LastName,String FirstName) {
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(Company);
		driver.findElementById("createLeadForm_firstName").sendKeys(FirstName);
		driver.findElementById("createLeadForm_lastName").sendKeys(LastName);
		driver.findElementByName("submitButton").click();

	}
	
		
	}
	










