package glue.mobileapp.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;

public class GenericLibrary 
{

public static Dimension	screenSize;
public static int screenHeight;
public static int screenWidth;
public AppiumDriver driver;
public static String sTestDataFile=BaseClass.sDirPath+"\\GlueWebAppExcelData.xlsx";
	
	
	public static String getVisibleAreaScreenshot(WebDriver driver,String screenshotName)
	 {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	String dest = System.getProperty("user.dir")+"//VisibleViewScreenshots//"+screenshotName+".png";
	File destination =new File(dest);
	try {
	FileUtils.copyFile(source, destination);
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	return dest;
	}
	
	public static String getConfigValue(String sFile, String sKey) {
		Properties prop = new Properties();
		String sValue = null;

		try {
			InputStream input= new FileInputStream(sFile);
			try {
				prop.load(input);
				sValue=prop.getProperty(sKey);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sValue;
		}
	
	
	public static String[] toReadExcelData(String sSheet,String sTestCaseID) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
	String[] sData=null;
	FileInputStream fis=new FileInputStream(sTestDataFile);
	Workbook wb =WorkbookFactory.create(fis);
	Sheet sht= wb.getSheet(sSheet);
	int rowNum=sht.getLastRowNum();
	
	for(int i=1;i<=rowNum;i++) {
		
	if(sht.getRow(i).getCell(0).toString().equals(sTestCaseID))
	{
		
	int cellNum=sht.getRow(i).getLastCellNum();
	sData=new String[cellNum];
	
	for(int j=0;j<cellNum;j++) {
		
		sData[j]=sht.getRow(i).getCell(j).getStringCellValue();
		
	}
	break;	
	}
		
		
		
	}
	return sData;
		
	}
	
	public static void sleep(long millisec) {
		try {
			Thread.sleep(millisec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void Timeouts()
	{
		BaseClass.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
}
