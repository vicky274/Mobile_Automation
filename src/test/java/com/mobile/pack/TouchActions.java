package com.mobile.pack;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;;
public class TouchActions extends BaseforApiDemo{

	public static void main(String[] args) throws InterruptedException {
		try {
			initializedriver();
			
			//finding by xpath
			getDriver().findElementByXPath("//android.widget.TextView[@text='Views']").click();

			WebElement e = getDriver().findElementByAccessibilityId("Expandable Lists");
			
			TouchAction t = new TouchAction(getDriver());
			
			t.tap(TapOptions.tapOptions().withElement(element(e))).perform();
			
			//this will also work as per appium doc. this can be used when doing  single action 
			//t.tap(element(e)).perform();
			
			getDriver().findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
			
			WebElement e1 = getDriver().findElementByXPath("//android.widget.TextView[@text='People Names']");
			
			t.longPress(LongPressOptions.longPressOptions().withElement(element(e1)).withDuration(Duration.ofSeconds(2))).perform();
			
			Thread.sleep(1000);
			System.out.println(getDriver().findElementByXPath("//android.widget.TextView[@text='Sample menu']").isDisplayed());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
