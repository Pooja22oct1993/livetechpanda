package com.live.techpanda.org.test_cases;

import com.live.techpanda.org.page_object.*;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.live.techpanda.org.test_base.TestBase;


public class TC_004 extends TestBase {
	
	HomePage hp;
	@Test
	public void popUpVerificationfor2Products() throws IOException {
	
	hp= new HomePage(driver);
	hp.clickMobileMenu();
	driver.findElement(By.xpath("(//a[text()='Add to Compare'])[2]")).click();
	
	String main_mobile1 =driver.findElement(By.xpath("//a[@title='Sony Xperia']")).getText();
	System.out.println("main_mobile1= "+main_mobile1);
	
	driver.findElement(By.xpath("(//a[text()='Add to Compare'])[3]")).click();
	String main_mobile2 = driver.findElement(By.xpath("//a[@title='IPhone']")).getText();
	System.out.println("main_mobile2="+main_mobile2);
	driver.findElement(By.xpath("//button[@title='Compare']")).click();
	
	
	
	
	
	}
	
	

}
