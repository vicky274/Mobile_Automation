package com.mobile.pack;

import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;

public class DragandDrop extends BaseforApiDemo{

	public static void main(String[] args) {
		
		try {
			initializedriver();
			
			//finding by xpath
			getDriver().findElementByXPath("//android.widget.TextView[@text='Views']").click();
			
			getDriver().findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
			
			WebElement e= getDriver().findElementById("io.appium.android.apis:id/drag_dot_1");
			
			WebElement e1= getDriver().findElementById("io.appium.android.apis:id/drag_dot_2");
			TouchAction t = new TouchAction(getDriver());
			t.longPress(LongPressOptions.longPressOptions().withElement(element(e))).moveTo(element(e1)).release().perform();
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}

	}

}
