package com.mobile.pack;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator extends Base{

	
	
	public static void main(String[] args) {
	
		try {
			Calcfunction();
			getDriver().findElement(By.id("com.oneplus.calculator:id/digit_2")).click();
			Thread.sleep(500);
			getDriver().findElement(By.id("com.oneplus.calculator:id/digit_3")).click();
			Thread.sleep(1000);
			//getDriver().findElementByXPath("//android.widget.ImageButton[@resource-id='com.oneplus.calculator:id/op_add']").click();
			getDriver().findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.oneplus.calculator:id/op_add\")").click();;
			Thread.sleep(1000);
			WebElement e =getDriver().findElementById("com.oneplus.calculator:id/imgDragView");
			
			
			//we need to manually import tapOptions and element
			TouchAction t = new TouchAction(getDriver());
			t.tap(tapOptions().withElement(element(e))).perform();
			
			//for long press
			t.longPress(longPressOptions().withElement(element(e)).withDuration(Duration.ofSeconds(2))).release().perform();
			
			/*TouchActions t = new TouchActions(getDriver());
			t.singleTap(getDriver().findElementById("com.oneplus.calculator:id/imgDragView")).build().perform();*/
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
