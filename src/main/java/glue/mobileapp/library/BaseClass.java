package glue.mobileapp.library;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


public class BaseClass 
{
	public DesiredCapabilities capabilities = null;
	public static AppiumDriver driver = null;
	public static String sDirPath=System.getProperty("user.dir");
	//public static String sConfigPath=sDirPath+"\\src/main/resources/config.properties";
	public static String configPropertyFilePath =  sDirPath + File.separator +"src" + File.separator + "main" + File.separator + "resources";
    public static String sConfigPath = configPropertyFilePath + File.separator + "mobileconfig.properties";


	
	//@BeforeMethod	
	//@BeforeClass
	@BeforeSuite
	public void launchApp() throws MalformedURLException
	{
	capabilities=new DesiredCapabilities();
	capabilities.setCapability("automationName", GenericLibrary.getConfigValue(sConfigPath, "automationName"));
	if(GenericLibrary.getConfigValue(sConfigPath, "deviceName")==GenericLibrary.getConfigValue(sConfigPath, "emulatorName"))
	{
		capabilities.setCapability("deviceName", GenericLibrary.getConfigValue(sConfigPath, "deviceName"));
	}
	else
	{
		System.out.println("check if entry");
		capabilities.setCapability("deviceName", GenericLibrary.getConfigValue(sConfigPath, "deviceName"));
		capabilities.setCapability("platformName", GenericLibrary.getConfigValue(sConfigPath, "platformName"));
		capabilities.setCapability("platformVersion", GenericLibrary.getConfigValue(sConfigPath, "platformVersion"));
	}
	
	//capabilities.setCapability(MobileCapabilityType.APP, sDirPath+"\\SiteAssist_v1.0.1.apk");
	//capabilities.setCapability(MobileCapabilityType.APP, sDirPath+"/app/MoveMint.apk");
	capabilities.setCapability("ignoreHiddenApiPolicyError",true );
	
	capabilities.setCapability("appPackage", GenericLibrary.getConfigValue(sConfigPath, "appPackage"));
	capabilities.setCapability("appActivity",GenericLibrary.getConfigValue(sConfigPath, "appActivity"));
	capabilities.setCapability("noReset",true);
	//capabilities.setCapability("android.permission.WRITE_SECURE_SETTINGS",true);
	capabilities.setCapability("newCommandTimeout", 50000);
	capabilities.setCapability("uiautomator2ServerInstallTimeout", 60000);
	capabilities.setCapability("autoGrantPermissions", true);
	System.out.println("URL : " + GenericLibrary.getConfigValue(sConfigPath, "AppiumServerURL"));
	driver=new AndroidDriver(new URL(GenericLibrary.getConfigValue(sConfigPath, "AppiumServerURL")), capabilities);
	//driver=new AndroidDriver(new URL("http://192.168.0.117:4723/wd/hub"), capabilities);
	}
	
	
	//@AfterMethod
	//@AfterSuite
//	@org.junit.AfterClass
	//@AfterSuite
	public void tearDown()
	{
	driver.quit();	
	}
	
}
