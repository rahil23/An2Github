package appiumactions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
public class KeyCode {
	static AndroidDriver driver=null;
	@Test
	public static void keycode() throws MalformedURLException, InterruptedException
	{
	


DesiredCapabilities cap = new DesiredCapabilities();
cap.setCapability("automationName", "Appium");
cap.setCapability("platformName","Android");
cap.setCapability("deviceName", "ccdcb242");
cap.setCapability("platformVersion","6.0.1");
//capabilities.setCapability("app","C:\\JavaSelenium practice\\And2\\APK Files\\Flipkart_5.9.apk");
//cap.setCapability("appPackage", "com.android.phone");
//capabilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");
cap.setCapability("appActivity", "android.task.contacts");

driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );
driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);


}
}