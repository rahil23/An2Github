package appiumactions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import library.StartStopAppiumServer;

public class ZoomPinch  {
	
	
	public static AndroidDriver driver;
	
	
//	@Test
//	public void zoomPinch() throws MalformedURLException, InterruptedException {
		
		
	public static void main(String[] args) throws MalformedURLException, InterruptedException { 
			
			/*DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("automationName", "Appium");
			capabilities.setCapability("platformVersion", "6.0.1");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("deviceName", "ccdcb242");
			capabilities.setCapability("appPackage", "com.miui.gallery");
			capabilities.setCapability("appActivity", "com.miui.gallery.activity.HomePageActivity");*/
			
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName","Android");
		cap.setCapability("deviceName", "ccdcb242");
		cap.setCapability("platformVersion","6.0.1");
		//capabilities.setCapability("app","C:\\JavaSelenium practice\\And2\\APK Files\\Flipkart_5.9.apk");
		//cap.setCapability("appPackage", "com.android.phone");
		//capabilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");
		cap.setCapability("appActivity", "android.task.contacts");

			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(3000);
			driver.findElement(By.name("Albums")).click();
			
			driver.findElement(By.name("Screenshots")).click();
			driver.tap(1, 178, 780, 100);
			
			
				Thread.sleep(3000);
			WebElement ele =driver.findElement(By.id("com.miui.gallery:id/photoview"));
			driver.zoom(ele);
			
			Thread.sleep(3000);
			driver.pinch(ele);
			
			driver.quit();
	
	}
}
