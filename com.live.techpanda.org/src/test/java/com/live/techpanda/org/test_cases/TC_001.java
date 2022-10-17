package com.live.techpanda.org.test_cases;


import com.live.techpanda.org.page_object.*;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Target;
import java.time.Duration;
import java.util.List;


import javax.swing.text.Element;
import javax.xml.transform.Source;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.live.techpanda.org.test_base.TestBase;
import com.myvtechsolutions.orangehrm0358.page_object.HomePage;

public class TC_001 extends TestBase {
com.live.techpanda.org.page_object.HomePage hp;

	
	@Test(priority = 1)
	public void appURLTitleVerification() {
		if(driver.getPageSource().contains("Home page")) {
			Assert.assertTrue(true);
			System.out.println("page title is verified");
			}
		else {Assert.assertTrue(false);
			System.out.println("page title is not verified");
			
		}
	
}
	
	
	@Test(dependsOnMethods = {"appURLTitleVerification"},priority = 2 ,alwaysRun =true)
	public void visibilityOfMobileLink() {
		hp=new HomePage(driver);
		hp.visibilityofMobileMenu();
		}
	
	@Test(priority = 3)
	public void verifyMobilePageTitle() {
		hp=new HomePage(driver);
		hp.clickMobileMenu();
		if(driver.getTitle().contains("Mobile")) {
			Assert.assertTrue(true);
			System.out.println("page title is verified after clicking mobile menu");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("page title is not verified after clicking mobile menu");
		}
	}										
	
	
	
	@Test(priority =4 )
	public void isDropdownByName() {
		hp=new HomePage(driver);
		hp.clickMobileMenu();
		 WebElement delement = driver.findElement(By.xpath("(//select[@title='Sort By'])"));
		
		        Select sel = new Select(delement);
		      sel.selectByVisibleText("Name");
		     System.out.println("element by name is sorted");
		     }
@Test(priority =5)
public void sortingProductsByName() throws IOException { 
	hp=new HomePage(driver);
	hp.clickMobileMenu();
	 WebElement delement = driver.findElement(By.xpath("(//select[@title='Sort By'])"));
	 Select sel = new Select(delement);
     sel.selectByVisibleText("Name");
TakesScreenshot ts = (TakesScreenshot)driver;
File source= ts.getScreenshotAs(OutputType.FILE);
File target = new File("./Screenshot/mobile_img_byname.png");
FileHandler.copy(source,target);


}

}
//Day2 Sprint
//Day 3


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


