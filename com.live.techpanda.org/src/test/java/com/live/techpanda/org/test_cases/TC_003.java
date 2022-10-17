package com.live.techpanda.org.test_cases;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.live.techpanda.org.test_base.TestBase;
import com.live.techpanda.org.page_object.*;

public class TC_003 extends TestBase {

HomePage hp;



	@Test
	public void verificationOfErrorMessage() {
		hp = new HomePage(driver);
		hp.clickMobileMenu();

		driver.findElement(By.xpath("(//button[@title='Add to Cart'])[2]")).click();
		driver.findElement(By.xpath("(//input[@title='Qty'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@title='Qty'])[1]")).sendKeys("1000");
		 driver.findElement(By.xpath("//button[@title='Update']")).click();
		 String err_msg=driver.findElement(By.xpath("//p[@class='item-msg error']")).getText();

		if (err_msg.contains("* The maximum quantity allowed for purchase is 500.")) {
			Assert.assertTrue(true);
			System.out.println("Error message is copied successfully");
		} else {
			Assert.assertTrue(false);
			System.out.println("Error message is copied successfully");
			
			
		
			
			
			
			
			
			
			
			
			
		}

	}

}
