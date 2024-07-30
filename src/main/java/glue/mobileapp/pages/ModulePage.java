package glue.mobileapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import glue.mobileapp.library.GenericLibrary;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ModulePage {
	GenericLibrary generic;
	AppiumDriver driver;
	public ModulePage(AppiumDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		
	}
	
	///////////////////////////////////////////////////////////////
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"WFH\"]")
	private WebElement wfhModeBtn;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"LEAVE\"]")
	private WebElement leaveModeBtn;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"OFFICE\"]")
	private WebElement officeModeBtn;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"WFR\"]")
	private WebElement wfrModeBtn;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"FIELD\"]")
	private WebElement fieldModeBtn;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Select from date\")")
	private WebElement selectFromDateBtn;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Select to date\")")
	private WebElement selectToDateBtn;
	
	@AndroidFindBy(xpath = "//*[@text=\"Enter reason here...\"]")
	private WebElement commentsTextField;
	
	@AndroidFindBy(xpath = "//*[@text=\"NOTIFY\"]")
	private WebElement notifyBtn;
	
	@AndroidFindBy(xpath = "//*[@text=\"DATE?\"]")
	private WebElement dateHeaderText;
	
	@AndroidFindBy(xpath = "//*[@text=\"COMMENTS\"]")
	private WebElement commentsHeaderText;
	
	@AndroidFindBy(xpath = "//*[@text=\"YOUR WORKING HOURS?\"]")
	private WebElement yoursWorkingHoursHeaderText;
	
	
	
	
	
	
	

}
