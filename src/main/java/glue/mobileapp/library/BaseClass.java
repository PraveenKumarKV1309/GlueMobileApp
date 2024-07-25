package glue.mobileapp.library;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	public DesiredCapabilities capabilities = null;
	public static AppiumDriver driver = null;
	public static String sDirPath = System.getProperty("user.dir");
	// public static String
	// sConfigPath=sDirPath+"\\src/main/resources/config.properties";
	public static String configPropertyFilePath = sDirPath + File.separator + "src" + File.separator + "main"
			+ File.separator + "resources";
	public static String sConfigPath = configPropertyFilePath + File.separator + "mobileconfig.properties";

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
	//capabilities.setCapability("ignoreHiddenApiPolicyError",true );
	
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

	
	@AfterSuite
	public void tearDown() {
		// This line will quit the execution and close the app
		driver.quit();
	}
	
	/*
	 * @Parameters({ "automationName", "platformName", "deviceType", "deviceName",
	 * "platformVersion", "appPackage", "appActivity", "bundleId",
	 * "AppiumServerURL","emulatorName" })
	 * 
	 * @BeforeSuite public void launchApp(String automationName, String
	 * platformName, String deviceType, String deviceName, String platformVersion,
	 * String appPackage, String appActivity, String bundleId, String
	 * AppiumServerURL, String emulatorName) throws MalformedURLException { try { //
	 * Debug prints System.out.println("automationName: " + automationName);
	 * System.out.println("platformName: " + platformName);
	 * System.out.println("deviceType: " + deviceType);
	 * System.out.println("deviceName: " + deviceName);
	 * System.out.println("platformVersion: " + platformVersion);
	 * System.out.println("appPackage: " + appPackage);
	 * System.out.println("appActivity: " + appActivity);
	 * System.out.println("bundleId: " + bundleId);
	 * System.out.println("AppiumServerURL: " + AppiumServerURL);
	 * System.out.println("emulatorName: " + emulatorName); capabilities = new
	 * DesiredCapabilities(); // capabilities.setCapability("automationName", //
	 * GenericLibrary.getConfigValue(sConfigPath, "automationName"));
	 * capabilities.setCapability("automationName", automationName); if (deviceType
	 * == "emulator") { capabilities.setCapability("deviceName",emulatorName ); }
	 * else { capabilities.setCapability("deviceName", deviceName);
	 * capabilities.setCapability("platformName", platformName);
	 * capabilities.setCapability("platformVersion",platformVersion); }
	 * capabilities.setCapability("ignoreHiddenApiPolicyError", true);
	 * capabilities.setCapability("appPackage", appPackage);
	 * capabilities.setCapability("appActivity",appActivity);
	 * capabilities.setCapability("noReset", true);
	 * capabilities.setCapability("android.permission.WRITE_SECURE_SETTINGS",true);
	 * capabilities.setCapability("newCommandTimeout", 50000);
	 * capabilities.setCapability("uiautomator2ServerInstallTimeout", 60000);
	 * capabilities.setCapability("autoGrantPermissions", true);
	 * System.out.println("URL : " + GenericLibrary.getConfigValue(sConfigPath,
	 * "AppiumServerURL")); driver = new AndroidDriver(new
	 * URL(AppiumServerURL),capabilities); }catch (Exception e) { // TODO: handle
	 * exception e.printStackTrace(); } }
	 */

	

}
