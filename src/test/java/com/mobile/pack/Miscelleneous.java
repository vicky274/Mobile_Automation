package com.mobile.pack;

import java.net.MalformedURLException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.KeyEventMetaModifier;

public class Miscelleneous  extends BaseforApiDemo{

	public static void main(String[] args) {
		
		
		try {
			
			/*AndroidKey[] value =AndroidKey.values();
			
			for(AndroidKey k:value){
				System.out.println(k);
			}
			
			System.out.println(AndroidKey.valueOf("BACK"));*/
			
			
			initializedriver();
			System.out.println(getDriver().isDeviceLocked());
			System.out.println(getDriver().getContext());
			System.out.println(getDriver().getOrientation());
			
			//finding by xpath
			getDriver().findElementByXPath("//android.widget.TextView[@text='Views']").click();
			
			getDriver().pressKey(new KeyEvent(AndroidKey.BACK));
			
			
			/*new KeyEvent(AndroidKey.BACK)
		    .withMetaModifier(KeyEventMetaModifier.SHIFT_ON);*/
			
			//power off
			//getDriver().longPressKey(new KeyEvent(AndroidKey.POWER));
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
