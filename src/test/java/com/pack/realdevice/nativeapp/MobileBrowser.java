package com.pack.realdevice.nativeapp;

import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import com.mobile.pack.MobileBrowserBase;

public class MobileBrowser extends MobileBrowserBase{

	public static void main(String[] args) {
		
		try {
			initializedriver();
			/*getDriver().get("https://m.facebook.com");
			getDriver().findElementByXPath("//input[@name='email']").sendKeys("vimessi2@gmail.com");
			getDriver().findElementByXPath("//input[@name='pass']").sendKeys("Deepa@7996");
			getDriver().findElementByXPath("//span[text()='Log In']").click();*/
			
			getDriver().get("http://m.cricbuzz.com");
			
			//can be used anyway as below
			/*JavascriptExecutor js = (JavascriptExecutor)getDriver();
			js.executeScript("window.scrollBy(0,400)", "");*/
			
	/*		Actions a = new Actions(getDriver());
			a.moveToElement(getDriver().findElementByXPath("//h4[text()='Top Stories']")).build().perform();*/
			
			
			boolean b = getDriver().findElementByXPath("//h4[text()='Top Stories']").getAttribute("class").contains("header");
			System.out.println(b);
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		

	}

}
