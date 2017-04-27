package appiumactions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class practice {
	
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
				
				
				driver.unlockDevice();
				
				driver.lockDevice();
				
				driver.unlockDevice();
			Boolean b= 	driver.isLocked();
			System.out.println(b);  //false

			System.out.println("current activity o/p is" + driver.currentActivity());  //.activity.HomeFragmentHolderActivity
				driver.openNotifications();
				
				
				System.out.println("output of getcontexthandles"+driver.getContextHandles());  //[NATIVE_APP]
				
System.out.println("o/p of current context"+ driver.getContext());  //NATIVE_APP


driver.startActivity("com.sears.android", "com.android.sears.activity.MenuDrawerActivity");


				
//driver.resetApp();
				Thread.sleep(5000);
				driver.quit();
}
}