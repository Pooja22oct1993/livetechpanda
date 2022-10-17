package com.live.techpanda.org.utility;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.logging.NeedsLocalLogs;
import org.openqa.selenium.support.ui.Select;

public class Helperclass {
	
	
	public static void SelectByVisibleText(WebElement dd, String visibleText) {
		
		Select sel=new Select(dd);
		sel.selectByVisibleText(visibleText);
		
	}
	
	
	public static void captureScreenshotOf(WebDriver driver, String screenshotname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./screenshot/freecrm_"+"screenshotname"+".png");
		
		FileHandler.copy(source, target);
		
	}
	public void getCurrentDataTime() {
		DateFormat Custformat = new SimpleDateFormat("MM/dd/yyyy/_HH_mm_ss");
	new date
	
	}

	
	

}
