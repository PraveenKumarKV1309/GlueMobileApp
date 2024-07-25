package glue.mobileapp.testcases;


import java.time.Duration;

import org.testng.annotations.Test;

import glue.mobileapp.library.BaseClass;

public class LoginTest extends BaseClass
{
	
	@Test
	public void runAppium() {
	
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					System.out.println("check line execution");

	}

}
