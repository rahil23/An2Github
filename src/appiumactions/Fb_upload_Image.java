package appiumactions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Fb_upload_Image {
	
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platforVersion", "6.0.1");
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "ccdcb242");
		cap.setCapability("browserName", "chrome");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		driver.get("https://m.facebook.com");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("info.rahil@gmail.com");
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys("****");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Not Now')]")).click();
	//	driver.findElement(By.xpath("//android.widget.ToggleButton[@content-desc='Not Now']")).click();
		
		driver.context("NATIVE_APP");
		driver.findElement(By.name("Chrome")).click();
		
		driver.context("WEBVIEW");
		
		driver.findElement(By.xpath("//span[@class='_59tg']")).click();
//		driver.findElement(By.xpath("//android.widget.ToggleButton[@content-desc='Main Menu']")).click();
//		
//		driver.findElement(By.xpath("//android.widget.ToggleButton[@content-desc='Rahil Kumar']")).click(); 
		
	}

}
