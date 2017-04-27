package appiumactions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class swipeRight {
	
	public static AndroidDriver driver;
	 
	 public static void main(String[] args) throws MalformedURLException {
		
		 DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability("automationName", "Appium");
		 cap.setCapability("platformVersion", "6.0.1");
		 cap.setCapability("platformName", "Android");
		 cap.setCapability("deviceName", "ccdcb242");
		 cap.setCapability("appPackage", "com.tinder");
		 cap.setCapability("appActivity", "com.tinder.activities.ActivityMain");
		 
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		 
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 driver.unlockDevice();
		 
		 for(int i=0;i<=100;i++)
		 {
			 driver.findElement(By.id("com.tinder:id/revised_like")).click();
		 }
		 
	driver.quit();
		 
		 
		 
		 
		 
	}

}
