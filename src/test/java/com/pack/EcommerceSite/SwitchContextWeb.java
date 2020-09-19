package com.pack.EcommerceSite;

import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.By;

import com.mobile.pack.BaseforEcommerce;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class SwitchContextWeb extends BaseforEcommerce{

//	http://appium.io/docs/en/writing-running-appium/web/hybrid/
	
	public static void main(String[] args) throws InterruptedException {
		
		try {
			initializedriver();
			AddToCart.CommonSteps();
			getDriver().findElementByClassName("android.widget.CheckBox").click();
			getDriver().findElementById("com.androidsample.generalstore:id/btnProceed").click();
			Thread.sleep(6000);
			Set<String> contextNames = getDriver().getContextHandles();
			
			for (String contextName : contextNames) {
			    System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
			}
			getDriver().context("WEBVIEW_com.androidsample.generalstore");
			Thread.sleep(1000);
			getDriver().findElement(By.xpath("//input[@id='realbox']")).sendKeys("hello");
			getDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
	}

}
