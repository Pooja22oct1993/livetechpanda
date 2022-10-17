package com.live.techpanda.org.page_object;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingInformation {
	
	WebDriver driver;
	
	
	@FindBy(xpath = "//button[@class='button']")
	WebElement buttElement;
	
	
	
	
	public BillingInformation(WebDriver driver) {
 this.driver= driver;
 PageFactory.initElements(driver, this);
		
	}
	
	public void clickConButton() {
	buttElement.click();
		
	}
	
	
	
	
	

}
