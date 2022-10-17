package com.live.techpanda.org.test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.live.techpanda.org.page_object.BillingInformation;
import com.live.techpanda.org.page_object.HomePage;
import com.live.techpanda.org.test_base.TestBase;
import com.live.techpanda.org.utility.Helperclass;

public class TC_006 extends TestBase{
HomePage hp;
BillingInformation bi;
	@Test(priority = 1)
	
	public void verifyShippiingCost() {
		hp=new HomePage(driver);
hp.clickMyAccount();
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Pooja22@gmail.com");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd@123");
driver.findElement(By.xpath("//button[@title='Login']")).click();
hp.clickTVMenu();
		driver.findElement(By.xpath("//li[1]//div[1]//div[3]//button[1]//span[1]//span[1]")).click();
		WebElement country_dd = driver.findElement(By.xpath("//select[@id='country']"));
		Helperclass.SelectByVisibleText(country_dd, "United States");
		WebElement state_dd = driver.findElement(By.xpath("//select[@id='region_id']"));
		Helperclass.SelectByVisibleText(state_dd, "New York");
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("542896");
		driver.findElement(By.xpath("//span[contains(text(),'Estimate')]")).click();
		driver.findElement(By.xpath("//input[@class='radio']")).click();
		driver.findElement(By.xpath("//button[@title='Update Total']")).click();
	String	Grand_Total=driver.findElement(By.xpath("//span[text()='$620.00']")).getText();
	System.out.println("Grand Total");
		if (Grand_Total.equals("$620.00")) {
			Assert.assertTrue(true);
			System.out.println("Grand total is updated");
			
		}
		else {
			Assert.assertTrue(false);
			System.out.println("Grand total is not updated");
		}
		driver.findElement(By.xpath("(//button[@title='Proceed to Checkout'])[2]")).click();
		
		
	}
	@Test(priority = 2)
	public void verificationOfOrderNumber() {
		bi=new BillingInformation(driver);
		WebElement billing_dd = driver.findElement(By.xpath("//select[@id='billing-address-select']"));
		
		Helperclass.SelectByVisibleText(billing_dd, "New Address");
		
		
		bi.clickConButton();
		driver.findElement(By.id("billing:firstname")).sendKeys("abcd");
		driver.findElement(By.id("billing:middlename")).sendKeys("efgh");
		driver.findElement(By.id("billing:lastname")).sendKeys("hijk");
		driver.findElement(By.xpath("(//input[@title='Street Address'])[1]")).sendKeys("pooja22@gmail.com");
		driver.findElement(By.id("billing:street1")).sendKeys("ABC");
		driver.findElement(By.id("billing:city")).sendKeys("ABC");
		driver.findElement(By.id("billing:city")).sendKeys("New York");
WebElement state1_dd=driver.findElement(By.id("billing:region_id"));
		
Helperclass.SelectByVisibleText(state1_dd, "New York");
driver.findElement(By.id("billing:postcode")).sendKeys("542896");
driver.findElement(By.id("billing:telephone")).sendKeys("12345678");
bi.clickConButton();

driver.findElement(By.xpath("//button[@onclick='billing.save()']")).click();
driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/ol[1]/li[3]/div[2]/form[1]/div[3]/button[1]")).click();



driver.findElement(By.xpath("//input[@id='p_method_checkmo']")).click();
driver.findElement(By.xpath("//button[@onclick='payment.save()']")).click();



driver.findElement(By.xpath("//button[@title='Place Order']")).click();
String order_id=driver.findElement(By.xpath("//a[text()='100016868']")).getText();
if (order_id.equals("100016868")) {
	Assert.assertTrue(true);
	System.out.println("Generated order is verified");
	
	}
else {
	Assert.assertTrue(false);
	System.out.println("Generated order is not verified");
}
		
		
	}
	
	
	
	

}
