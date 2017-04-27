package library;

import java.io.File;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class StartStopAppiumServer {
	public AppiumDriverLocalService appiumserver;
	/*public String appium_node = "C:\\Program Files (x86)\\Appium\\node.exe";
	
	public String appium_js = "C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js";
	//C:\Program Files (x86)\Appium\node_modules\appium\lib\appium.js
	
	public AppiumDriverLocalService appiumServer; //TODO AppiumDriverLocalService is class
	
	
	
	@BeforeSuite
	public void startServer()
	{
		appiumServer = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingPort(4723).usingDriverExecutable(new File(appium_node)).withAppiumJS(new File(appium_js)));
		              
		appiumServer.start();
	*/
public String Appium_node="C:\\Program Files (x86)\\Appium\\node.exe";
	
	//public String Appium_js="C:\\Program Files (x86)\\Appiumlatest\\node_modules\\appium\\bin\\appium.js";
	
	public String Appium_js = "C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js";
	
	@BeforeMethod
	public void startserver(){
		
		appiumserver=AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingPort(4723).usingDriverExecutable(new File(Appium_node)).withAppiumJS(new File(Appium_js)));
		appiumserver.start();
	
	}
	
	@AfterMethod
	public void stopServer()
	{
		appiumserver.stop();
	}
			}


