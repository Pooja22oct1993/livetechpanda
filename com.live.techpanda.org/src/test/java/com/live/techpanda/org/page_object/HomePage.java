package com.live.techpanda.org.page_object;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	public WebDriver driver;
	
	
	@FindBy(xpath  = "//a[normalize-space()='Mobile']")
	WebElement mobilElement;
	
	@FindBy(xpath = "//a[normalize-space()='TV']")
	WebElement tvElement;
	 
	@FindBy(xpath = "//div[@class='footer']//a[@title='My Account'][normalize-space()='My Account']")
	 WebElement myaccountElement;
	
	
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		}
	
	
	
	public boolean visibilityofMobileMenu() {
		return mobilElement.isDisplayed();
		}
	public void clickMobileMenu() {
		mobilElement.click();
	}
	public void clickTVMenu() {
	
	tvElement.click();
	}	
		public void clickMyAccount() {
			myaccountElement.click();
			
		}
	}
	
	
	
		
		
	

	
	
	
	
	


