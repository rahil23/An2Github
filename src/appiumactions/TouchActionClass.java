package appiumactions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class TouchActionClass {
	
	@Test
	public static void touchAction() throws MalformedURLException, InterruptedException {
	DesiredCapabilities capabilities=new DesiredCapabilities();
	capabilities.setCapability("automationName","Appium");
	capabilities.setCapability("platformName","Android");
	capabilities.setCapability("deviceName","ccdcb242");
	capabilities.setCapability("platformVersion", "6.0.1");
	//capabilities.setCapability("app","C:\\JavaSelenium practice\\And2\\APK Files\\com.mobeta.android.demodslv-0.5.0-3_APKdot.com.apk");
	capabilities.setCapability("appPackage", "com.mobeta.android.demodslv");
	capabilities.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	//capabilities.setCapability("fullReset", value);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.name("Basic usage playground")).click();
	//driver.findElement(By.id("com.mobeta.android.demodslv:id/activity_title")).click();
	List<WebElement> draghandle=driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle"));
	Thread.sleep(4000);
	TouchAction action=new TouchAction(driver);
	action.longPress(draghandle.get(0)).moveTo(draghandle.get(5)).release().perform();
	Thread.sleep(4000);
	
}
}