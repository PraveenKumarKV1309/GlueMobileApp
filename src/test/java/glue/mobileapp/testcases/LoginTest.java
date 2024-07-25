package glue.mobileapp.testcases;


import java.time.Duration;

import org.testng.annotations.Test;

import glue.mobileapp.library.BaseClass;
import glue.mobileapp.library.GenericLibrary;

public class LoginTest extends BaseClass
{
	
	@Test
	public void runAppium() {
	                
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					GenericLibrary.sleep(9000);
					System.out.println("check line execution");

	}
	
	

}
