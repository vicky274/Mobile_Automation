package com.pack.EcommerceSite;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;

import com.mobile.pack.BaseforEcommerce;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;

interface model{
	
	String Air_Jordan="Air Jordan 4 Retro";
	String Air_Jordan_1="Air Jordan 1 Mid SE";
}
public class AddToCart extends BaseforEcommerce implements model{

	
	/* Activity a =new Activity(getDriver().getCurrentPackage(),".SplashActivity");
	 getDriver().startActivity(a);*/
	
	//Resets the app freshly like when it opened
	//getDriver().resetApp();
	
	//close the app
	//getDriver().closeApp();
	
	//lock device works
	//getDriver().lockDevice();
	    
	    
	public static void main(String[] args) throws InterruptedException {
		
		try {
			initializedriver();
			CommonSteps();
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}

	}
	
	
	public static void CommonSteps() throws InterruptedException{
		getDriver().findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hello");
		getDriver().hideKeyboard();
		getDriver().findElementByXPath("//*[@text='Male']").click();
		getDriver().findElementById("android:id/text1").click();
		//sometimes this wont work in few apps. so use below one
		getDriver().findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Belgium\"));").click();
		getDriver().findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
	
		List<MobileElement> e=getDriver().findElementsById("com.androidsample.generalstore:id/productName");
		System.out.println(e.size());

		//sometimes whole text wont be visible when using scroll. that case use this type of scroll.it will make sure element is fully visible
		/* MobileElement radioGroup = getDriver()
	                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
	                + ".resourceId(\"android:id/list\")).scrollIntoView("
	                + "new UiSelector().text(\"Radio Group\"));");
*/			int i=0;
		for(MobileElement ee: e){
			
			if(ee.getText().equalsIgnoreCase(model.Air_Jordan)||ee.getText().equalsIgnoreCase(model.Air_Jordan_1))
			{
				System.out.println("Item is Available");
				getDriver().findElementsById("com.androidsample.generalstore:id/productAddCart").get(i).click();
				
			}
			i++;
			
		}
		getDriver().findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		Thread.sleep(2000);
		System.out.println("********************Successfully Added to Cart********************");
	}

}
