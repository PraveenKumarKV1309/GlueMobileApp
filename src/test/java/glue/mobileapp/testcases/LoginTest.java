package glue.mobileapp.testcases;


import java.time.Duration;

import org.testng.annotations.*;

import glue.mobileapp.library.BaseClass;
import glue.mobileapp.pages.HomePage;

public class LoginTest extends BaseClass
{
	@Test
	public void runAppium() {
	
					//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					System.out.println("Mobile App Invoked");
					HomePage home =new HomePage(driver);
					home.getHomePageTitle();
					System.out.println("check line execution");

	}

}
