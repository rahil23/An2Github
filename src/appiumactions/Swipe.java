package appiumactions;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Swipe {
	public static AndroidDriver driver;
	@Test
	public static void swipe() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("automationName", "Android");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "ccdcb242");
		//cap.setCapability("app", "C:\\personal\\app\\APK\\Grofers_3.1.3.apk");
		cap.setCapability("appPackage", "com.grofers.customerapp");
		cap.setCapability("appActivity", "com.grofers.customerapp.activities.ActivitySplashScreen");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		
		//driver.unlockDevice();
		

		for(int i=0;i<=4;i++)
					{
					Thread.sleep(5000);
					driver.swipe(918,673, 126, 676, 3000);
					System.out.println("Swiping happening");
					
			/*		TouchAction action = new TouchAction(driver);        
					 action.longPress(453,1700).moveTo(453,900).release().perform(); */
					
					}
				Thread.sleep(3000);
		
		
	}

}
