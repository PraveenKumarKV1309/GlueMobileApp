package glue.mobileapp.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import glue.mobileapp.library.BaseClass;
import glue.mobileapp.library.GenericLibrary;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class LoginPage extends BaseClass
{
	GenericLibrary generic;
	AppiumDriver driver;
	
	public LoginPage(AppiumDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}					


//	
	//----------------------------------------------------
	
	@AndroidFindBy(xpath =  "//*[@text=\"Enter Email ID\"]")
	private WebElement enterEmaildIdInputField;
	
	
	
	
	public WebElement getEnterEmaildIdInputField() {
		return enterEmaildIdInputField;
	}

	public WebElement getEnterPasswordInputField() {
		return enterPasswordInputField;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getSkipBtn() {
		return skipBtn;
	}


	@AndroidFindBy(xpath = "//*[@text=\"Enter Password\"]")
	private WebElement enterPasswordInputField;
	
	@AndroidFindBy(xpath = "//*[@text=\"LOGIN\"]")
	private WebElement loginBtn;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").description(\"Skip\")")
	private WebElement skipBtn;
	

    public void login(String username,String password) {
       getSkipBtn().click();
       getEnterEmaildIdInputField().sendKeys(username);
       getEnterPasswordInputField().sendKeys(password);
       
       getLoginBtn().click();
    }
	
	
}
