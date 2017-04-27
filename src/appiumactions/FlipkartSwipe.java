package appiumactions;



	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
public class FlipkartSwipe {
	static AndroidDriver driver=null;
	
@Test
		public static void swipe() throws MalformedURLException, InterruptedException {
			DesiredCapabilities capabilities=new DesiredCapabilities();
				capabilities.setCapability("automationName", "Appium");
				capabilities.setCapability("platformName","Android");
				capabilities.setCapability("deviceName", "ccdcb242");
				capabilities.setCapability("platformVersion","6.0.1");
				//capabilities.setCapability("app","C:\\JavaSelenium practice\\And2\\APK Files\\Flipkart_5.9.apk");
				capabilities.setCapability("appPackage", "com.flipkart.android");
				//capabilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");
				capabilities.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");
				
				driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities );
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
/*			driver.findElement(By.name("Existing User? SIGN IN")).click();
				driver.findElement(By.id("com.flipkart.android:id/mobileNo")).clear();
				driver.findElement(By.id("com.flipkart.android:id/mobileNo")).sendKeys("8971222976");
				driver.findElement(By.id("com.flipkart.android:id/et_password")).sendKeys("raghukiran92");
				driver.findElement(By.name("SIGN IN")).click();
				Thread.sleep(2000);*/
				Thread.sleep(5000);
				
				
				for(int i=1;i<=4;i++){
					Thread.sleep(3000);
					
					//driver.swipe(663,596,51,606,6000);  : moto Amit phone
					driver.swipe(967, 883, 123, 909, 6000);
				}
			Thread.sleep(4000);
			driver.quit();
		}

	}


