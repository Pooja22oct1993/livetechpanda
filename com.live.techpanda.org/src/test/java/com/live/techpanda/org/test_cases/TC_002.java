package com.live.techpanda.org.test_cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.live.techpanda.org.test_base.TestBase;
import com.live.techpanda.org.utility.Helperclass;
import com.live.techpanda.org.page_object.HomePage;

public class TC_002 extends TestBase {
HomePage hp;
	
	
	
	@Test
	public void costTitleVerification() throws IOException {
		hp=new HomePage(driver);
		hp.clickMobileMenu();
		String title1 = driver.findElement(By.xpath("//span[text()='$100.00']")).getText();
		System.out.println("title1="+title1);
		driver.findElement(By.linkText("SONY XPERIA")).click();
		String title2 = driver.findElement(By.xpath("//span[@class='price']")).getText();
		System.out.println("title2="+title1);
		if (title1.equals(title2)) {
			Assert.assertTrue(true);
			Helperclass.captureScreenshotOf(driver, "price_img");
			System.out.println("Title are verified");
			}
		else {
			Assert.assertTrue(false);
			System.out.println("Title are not verified");
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
