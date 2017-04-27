package appiumactions;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


import library.ReadExcelData;
import io.appium.java_client.android.AndroidDriver;
import library.*;

public class WebExcel {
	
	
public static AndroidDriver driver ; 
public static String sTestCasesid=null;
public static String sData[]=null;

/*@Test
public void readExcel() throws MalformedURLException
*/

public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	DesiredCapabilities cap = new DesiredCapabilities(); //TODO DesiredCapabiliries is class in "org.openqa.selenium.remote" package 
	cap.setCapability("automationName", "Appium");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "6.0.1");
	cap.setCapability("deviceName", "ccdcb242");
	cap.setCapability("browserName", "Chrome");
	//cap.setCapability("app", "C:\\Users\\rkumar\\Downloads\\Chrome_50.0.2661.89.apk");
	cap.setCapability("appPackage", "com.google.android.apps.chrome");
	cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	
	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	
	
	ReadExcelData obj = new ReadExcelData();
	sTestCasesid="Google";
	sData=obj.readData(sTestCasesid);
	
	System.out.println(sData[1]);
	
	driver.navigate().to("https://www.google.com");

	
	
	driver.quit();
	
	
	
	
}

}
