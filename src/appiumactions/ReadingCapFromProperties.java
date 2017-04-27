package appiumactions;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import library.ReadingProperties;

public class ReadingCapFromProperties {
	
	public static AndroidDriver driver=null; 
	@Test
	public void openApp() throws MalformedURLException
	{
		DesiredCapabilities cap =new DesiredCapabilities();
		
		cap.setCapability("automationName", ReadingProperties.getConfigProperties("AUTOMATIONNAME"));
		cap.setCapability("platformVersion", ReadingProperties.getConfigProperties("PLATFORMVERSION"));
		cap.setCapability("platformName", ReadingProperties.getConfigProperties("PLATFORMNAME"));
		cap.setCapability("deviceName", ReadingProperties.getConfigProperties("DEVICENAME"));
cap.setCapability("appPackage", ReadingProperties.getConfigProperties("APPPACKAGE"));
cap.setCapability("appActivity", ReadingProperties.getConfigProperties("APPACTIVITY"));

driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);  //TODO URL is method imported from "java.net" Package  and this will throw "MalformedURLException"






	}
	

}
