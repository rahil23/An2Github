package appiumactions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Flipkart {
	static AndroidDriver driver=null;
	
	@Test
			public static void swipe() throws MalformedURLException, InterruptedException {
				DesiredCapabilities capabilities=new DesiredCapabilities();
					capabilities.setCapability("automationName", "Appium");
					capabilities.setCapability("platformName","Android");
					capabilities.setCapability("deviceName", "ccdcb242");
					capabilities.setCapability("platformVersion","6.0.1");
					//capabilities.setCapability("app","C:\\JavaSelenium practice\\And2\\APK Files\\Flipkart_5.9.apk");
					//capabilities.setCapability("appPackage", "com.flipkart.android");
					capabilities.setCapability("appActivity", "android.task.contacts");
					//capabilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");
					//capabilities.setCapability("appActivity", "com.flipkmailart.android.activity.HomeFragmentHolderActivity");
					
					driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities );
					driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
					
					driver.findElement(By.id("search_widget_textbox")).click();
					//driver.findElement(By.id("search_widget_textbox")).clear();
					driver.findElement(By.id("search_autoCompleteTextView")).click();
					driver.findElement(By.id("search_autoCompleteTextView")).clear();	
					
					
					driver.findElement(By.id("search_autoCompleteTextView")).sendKeys("mixer");
					
					driver.pressKeyCode(66);
					
					driver.findElement(By.name("Filter")).click();
					
					driver.findElement(By.name(" Category")).click();
					
					driver.pressKeyCode(AndroidKeyCode.BACK);
					
					driver.findElement(By.name(" Category")).click();
					
					driver.findElement(By.name("Apply All")).click();
					
					driver.findElement(By.name(" Discount")).click();
					
					
					driver.findElement(By.name("30% or More")).click();
					
					driver.findElement(By.name("DONE")).click();
					
					driver.findElement(By.name(" Brand")).click();
				//	driver.findElement(By.xpath("//android.view.ViewGroup[@index='6']//android.widget.TextView[@text='Bajaj']//android.widget.ImageView[@index='1']")).click();
					
					driver.findElement(By.name("Rotomix")).click();
					driver.findElement(By.name("DONE")).click();
					driver.findElement(By.name(" CLEAR")).click();
					driver.findElement(By.name("CANCEL")).click();
					System.out.println(driver.getContext());
					//driver.findElement(By.xpath("//android.support.v4.widget.DrawerLayout[@id='drawer_layout']//android.widget.ScrollView[@index='1']//android.widget.TextView[@text='speedway']")).click();
					driver.findElement(By.name("APPLY")).click();
					
					driver.findElement(By.name("Sort")).click();
					driver.findElement(By.name("Popularity")).click();
					
					
					
					
					
					
					
					

}

}