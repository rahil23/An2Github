package appiumactions;

import java.net.MalformedURLException;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import library.StartStopAppiumServer;

public class MultiTouch {
	
	@Test
	public static void multiTouch() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName","Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName","ccdcb242");
		capabilities.setCapability("platfromVersion","6.0.1");
		capabilities.setCapability("appPackage", "com.the511plus.MultiTouchTester");
		capabilities.setCapability("appActivity", "com.the511plus.MultiTouchTester.MultiTouchTester");
		//capabilities.setCapability("app","D:\\Empire Allies\\Apk file\\Multitouch Test_multitouchpro.tests.apk");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		TouchAction action1=new TouchAction(driver);
		action1.press(456,241).waitAction(2000).perform();
		TouchAction action2=new TouchAction(driver);
		action2.press(490,316).waitAction(2000).perform();
		MultiTouchAction action3=new MultiTouchAction(driver);
		action3.add(action1).add(action2).perform();
		Thread.sleep(4000);
	}

}
