package glue.mobileapp.testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glue.mobileapp.library.BaseClass;
import glue.mobileapp.library.GenericLibrary;
import glue.mobileapp.pages.HomePage;
import glue.mobileapp.pages.LoginPage;

public class LoginTest extends BaseClass
{
	LoginPage logElements;
	HomePage homePage;
	GenericLibrary generic;
	
	@BeforeClass
	public void initialize()
	{
		logElements=new LoginPage(driver);
		homePage=new HomePage(driver);
	}
	
	
	@Test
	public void validLogin() throws InterruptedException {
	
					//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					System.out.println("Mobile App Invoked");
					logElements.login(GenericLibrary.getConfigValue(sConfigPath, "userName"), GenericLibrary.getConfigValue(sConfigPath, "password"));
//					logElements.login(GenericLibrary.getConfigValue("username"), GenericLibrary.getConfigValue("password"));
					System.out.println("check line execution");
					Thread.sleep(10000);
//					generic.waitForVisibilityOfElement(homePage.getProjectsBtn());
//					homePage.getProjectsBtn().click();
//					Thread.sleep(10000);			
	}

}
