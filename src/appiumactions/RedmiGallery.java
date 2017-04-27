package appiumactions;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;

import io.appium.java_client.android.AndroidDriver;

public class RedmiGallery {
	
	public static AndroidDriver driver;
	
	
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
	
//	public void startApp() throws MalformedURLException, InterruptedException { 
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "ccdcb242");
		capabilities.setCapability("appPackage", "com.miui.gallery");
		capabilities.setCapability("appActivity", "com.miui.gallery.activity.HomePageActivity");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
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

