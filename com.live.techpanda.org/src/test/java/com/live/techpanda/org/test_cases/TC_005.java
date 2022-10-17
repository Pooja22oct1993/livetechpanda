package com.live.techpanda.org.test_cases;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.live.techpanda.org.page_object.HomePage;
import com.live.techpanda.org.test_base.TestBase;


public class TC_005 extends TestBase {

	
		HomePage hp;
		
		@Test
		public void createAccountEcom() {
			hp=new HomePage(driver);
	driver.findElement(By.linkText("MY ACCOUNT")).click();
	driver.findElement(By.xpath("//a[@title='Create an Account']")).click();
	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("abcd");
	driver.findElement(By.xpath("//input[@id='middlename']")).sendKeys("efgh");
	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("hijk");
	driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("pooja22@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abcd@123");
	driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys("abcd@123");
	driver.findElement(By.xpath("//button[@title='Register']")).click();
	if (driver.getPageSource().contains("My Dashboard")) {
		Assert.assertTrue(true);
		System.out.println("New user is successfully registered");
		
	}
	else {
		Assert.assertTrue(false);
		System.out.println("New user is not successfully registered");
	}
	
	driver.findElement(By.xpath("(//a[@class='level0 '])[2]")).click();
	driver.findElement(By.xpath("//a[@class='link-wishlist']")).click();
	driver.findElement(By.xpath("//button[@title='Share Wishlist']")).click();
	driver.findElement(By.xpath("//textarea[@id='email_address']")).sendKeys("uma@gmail.com");
	driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("This is my wishlisted product ");
	driver.findElement(By.xpath("//button[@title='Share Wishlist']")).click();
	String veri_title = driver.findElement(By.xpath("//span[normalize-space()='Your Wishlist has been shared.']")).getText();
	if (veri_title.contains("Your Wishlist has been shared.")) {
		Assert.assertTrue(true);
		System.out.println("tilte is verified");
		
	}
	else {
		Assert.assertTrue(false);
		System.out.println("tilte is not verified");
	}
	
		}
	
	
}
		
		
		

	


