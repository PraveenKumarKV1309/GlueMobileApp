package glue.mobileapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import glue.mobileapp.library.GenericLibrary;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {

	

	GenericLibrary generic;
	AppiumDriver driver;
	

	public HomePage(AppiumDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}					

	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id=\"Home\"]/android.view.ViewGroup")
	private WebElement homeBtn;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id=\"Projects\"]/android.view.ViewGroup")
	private WebElement projectsBtn;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id=\"Mode\"]/android.view.ViewGroup")
	private WebElement modeBtn;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id=\"Peers\"]/android.view.ViewGroup")
	private WebElement peersBtn;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id=\"More\"]/android.view.ViewGroup")
	private WebElement moreBtn;


	public WebElement getHomeBtn() {
		return homeBtn;
	}

	public WebElement getProjectsBtn() {
		return projectsBtn;
	}

	public WebElement getModeBtn() {
		return modeBtn;
	}

	public WebElement getPeersBtn() {
		return peersBtn;
	}

	public WebElement getMoreBtn() {
		return moreBtn;
	}
	
	
	
	
	
	
	
	
	
	}


