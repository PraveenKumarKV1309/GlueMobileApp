package glue.mobileapp.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import glue.mobileapp.library.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class HomePage extends BaseClass
{
	AppiumDriver driver;

	public HomePage(AppiumDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	//----------------------------------------------------
	//Add Project Button
	@AndroidFindBy(id = "com.hitachiabb.siteassist:id/rlAddProject")
	private WebElement addProject;
	
	public WebElement getAddProject()
	{
		return addProject;
	}
	
	//-----------------------------------------------------
	//Menu Button
	@AndroidFindBy(className = "android.widget.ImageButton")
	private WebElement MenuButton;
	
	public WebElement getMenuButton()
	{
		return MenuButton;
	}
	
	//------------------------------------------------------
	//Notifications
	@AndroidFindBy(id = "com.hitachiabb.siteassist:id/iv_notification")
	private WebElement NotificationButton;
	
	public WebElement getNotificationButton()
	{
		return NotificationButton;
	}
	
	//-------------------------------------------------------
	//All projects text for Home page verification
	//@AndroidFindBy(xpath = "//android.widget.TextView[@text='All Projects']")
	@FindBy(id = "com.hitachiabb.siteassist:id/tv_title")
	private WebElement HomePageTitle;
	
	public WebElement getHomePageTitle()
	{
		return HomePageTitle;
	}

	//--------------------------------------------------------
	//You have No projects Text for the first time validation
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='You have no projects']")
	private WebElement NoProjects;
	
	public WebElement getNoProjectsText()
	{
		return NoProjects;
	}
	
	//====================================================================
	//Project card objects
	//Project
	@AndroidFindBy(id = "com.hitachiabb.siteassist:id/iv_more")
	private WebElement SeeMore;
	
	public WebElement getSeeMoreIcon()
	{
		return SeeMore;
	}
	
	//-------------------------------------------------------------------
	//View details
	@AndroidFindBy(id = "com.hitachiabb.siteassist:id/tv_view_details")
	private WebElement ViewDetails;
	
	public WebElement getViewDetails()
	{
		return ViewDetails;
	}
	
	//--------------------------------------------------------------------
	//Project name
	@AndroidFindBy(id = "com.hitachiabb.siteassist:id/tvProName")
	private WebElement ProjectName;
	
	public WebElement getProjectName()
	{
		return ProjectName;
	}
	
	//---------------------------------------------------------------------
	//Factory name and unit number
	@AndroidFindBy(id = "com.hitachiabb.siteassist:id/tvFactoryName")
	private WebElement UnitName;
	
	public WebElement getUnitName()
	{
		return UnitName;
	}
	
	//----------------------------------------------------------------------
	//Project status
	@AndroidFindBy(id = "com.hitachiabb.siteassist:id/tvProjectStatus")
	private WebElement ProjectStatus;
	
	public WebElement getProjectStatus()
	{
		return ProjectStatus;
	}
	
	//----------------------------------------------------------------------
	//DiscrepancyNumber
	@AndroidFindBy(id = "com.hitachiabb.siteassist:id/tvDiscrepancy")
	private WebElement DiscrepancyNumber;
	
	public WebElement getDiscrepancyNumber()
	{
		return DiscrepancyNumber;
	}
	
	//----------------------------------------------------------------------
	//DiscrepancyNumber
	@AndroidFindBy(id = "com.hitachiabb.siteassist:id/tvLastUpdate")
	private WebElement LastUpdateTime;
		
	public WebElement getLastUpdateTime()
	{
		return LastUpdateTime;
	}
}
