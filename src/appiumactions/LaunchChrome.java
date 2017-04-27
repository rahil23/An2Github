package appiumactions;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LaunchChrome {
	
	public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("platformName","Android");
		cap.setCapability("deviceName", "ccdcb242");
		cap.setCapability("browserName", "Chrome");
		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		cap.setCapability("appPackage", "com.google.android.apps.chrome");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		driver.swipe(400, 11, 523, 1375, 10);
		
		Thread.sleep(3000);
		
		
		driver.quit();
		
	}
	

}
