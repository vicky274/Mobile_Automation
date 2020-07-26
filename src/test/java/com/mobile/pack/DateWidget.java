package com.mobile.pack;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;

import static io.appium.java_client.touch.offset.ElementOption.element;;
public class DateWidget extends BaseforApiDemo{

	public static void main(String[] args) throws InterruptedException {
		
		try {
			initializedriver();
			
			//finding by xpath
			getDriver().findElementByXPath("//android.widget.TextView[@text='Views']").click();
			
/*			UIAutomator API is an Android native way of finding element, it uses UISelector class to locate elements. 
			In Appium you send the Java code, as a string,
			to the server, which executes it in the application’s environment, returning the element or elements.*/
			
			getDriver().findElementsByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/text1\")").get(6).click();
			
			//finding by resource id - click on inline
			getDriver().findElementsById("android:id/text1").get(1).click();
			
			getDriver().findElementByAccessibilityId("9").click();
			
			WebElement e = getDriver().findElementByAccessibilityId("15");
			
			WebElement e1 = getDriver().findElementByAccessibilityId("45");
			
			TouchAction t = new TouchAction(getDriver());
			//Anything can be used
			
			//t.longPress(LongPressOptions.longPressOptions().withElement(element(e)).withDuration(Duration.ofSeconds(2))).moveTo(element(e1)).release().perform();
			t.press(element(e)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(element(e1)).release().perform();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
