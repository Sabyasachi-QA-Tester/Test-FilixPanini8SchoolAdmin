package testCases;

import org.testng.annotations.Test;

import pageObjects.CohortsPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class Test04_Cohorts extends BaseClass {
	
	@Test
	public void Test_Cohort() throws InterruptedException {
		
		
		LoginPage lp = new LoginPage(driver);
		lp.Click_login();
		lp.Set_email("schooladmin@filix.com");
		lp.click_OTP();
		lp.Set_OTP("12");
		lp.Click_verify();
		
		HomePage hp = new HomePage(driver);
		hp.Click_menu();
		hp.Click_Cohorts();
		
		CohortsPage cp = new CohortsPage(driver);
		
		cp.Search_Title("Play School");
		cp.Click_CreateCohort();
		cp.Set_title("Play Test School");
		cp.Set_Year("2025");
		cp.Set_description("Testing");
		cp.Set_StartDate("11/21/2025");
		cp.Set_EndDate("12/20/2025");
		cp.Set_Class("class1");
		cp.Set_Students("check");
		cp.Set_Teachers("test activity");
		cp.Click_Cohort();
		cp.Click_back();
		
		
		
	}
	
	
	
	
	
	
	

}
