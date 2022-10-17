package com.live.techpanda.org.test_cases;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.live.techpanda.org.page_object.HomePage;
import com.live.techpanda.org.test_base.TestBase;
import com.live.techpanda.org.utility.Helperclass;

public class TC_007 extends TestBase{
	HomePage hp;
	@Test
	public void verificationOfPreviousOrder() throws IOException {
		 hp=new HomePage(driver);
		 hp.clickMyAccount();
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pooja22@gmail.com");
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd@123");
		 driver.findElement(By.xpath("//button[@title='Login']")).click();
		 driver.findElement(By.xpath("//a[text()='My Orders']")).click();
		 driver.findElement(By.xpath("(//a[text()='View Order'])[3]")).click();
		 
		
		driver.findElement(By.xpath("//a[text()='Print Order']")).click();
		String parent_window=driver.getWindowHandle();
		Set<String>windows=driver.getWindowHandles();
		for(String window:windows) {
			if (parent_window!=window) {
				
			
			driver.switchTo().window(window);
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File("./screenshot/pdffile.png");
			
			FileHandler.copy(source, target);
			

			
			}
			
			
		}
			
		}
	
	
	

} 
