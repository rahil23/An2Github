package appiumactions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;

public class OpenPhone {
	
	 public static void main(String[] args) throws MalformedURLException {
		 AndroidDriver driver;
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

}
}
