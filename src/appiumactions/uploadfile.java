package appiumactions;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class uploadfile {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName","Appium");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("deviceName", "ccdcb242");
		capabilities.setCapability("platformVersion","6.0.1");
		capabilities.setCapability("browserName","chrome");
				
		AndroidDriver driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("info.rahil@gmail.com");
		driver.findElement(By.id("next")).click();
		
		driver.findElement(By.id("Passwd")).sendKeys("Enter&267");
		driver.findElement(By.id("signIn")).click();
		driver.findElement(By.xpath("//div[@class='V j od']")).click();
		driver.findElement(By.xpath("//div[@class='V j zr se']")).click();
		driver.findElement(By.className("Sm")).click();
		
		driver.context("NATIVE_APP");
		driver.findElement(By.name("Allow")).click();
		driver.findElement(By.name("Allow")).click();
//		driver.findElement(By.name("Documents")).click();
		driver.findElement(By.name("Gallery")).click();
		Thread.sleep(2000);
		driver.tap(1, 563,676,1);
		Thread.sleep(2000);
		
		driver.tap(1, 112,219,1);
		Thread.sleep(4000);
		
	}

}
