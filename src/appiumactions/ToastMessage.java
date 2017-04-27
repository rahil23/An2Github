package appiumactions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ToastMessage {

	public static AndroidDriver driver;
	
	@Test
public void	verifyToastMessage() throws MalformedURLException {
	DesiredCapabilities cap = new DesiredCapabilities();
	
	cap.setCapability("automationName", "Appium");
	cap.setCapability("platformVersion", "6.0.1");
	cap.setCapability("platformName", "Android");
	cap.setCapability("deviceName", "ccdcb242");
	cap.setCapability("appActivity", "com.abof.android.landingpage.view.LandingPageView");
	cap.setCapability("appPackage", "com.abof.android");
	
	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	//driver.findElement(By.name("MEN")).click();
	
	driver.findElement(By.id("com.abof.android:id/search_icn")).click();
	driver.findElement(By.id("com.abof.android:id/search_edittext")).sendKeys("polo tshirt");
	driver.findElement(By.id("com.abof.android:id/search_edittext")).sendKeys(Keys.ENTER);
	
	
	
	
}
}
