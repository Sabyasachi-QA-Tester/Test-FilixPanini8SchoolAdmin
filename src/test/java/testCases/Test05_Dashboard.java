package testCases;

import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class Test05_Dashboard extends BaseClass {
	
	@Test
	public void Test_Dashboard() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.Click_login();
		lp.Set_email("schooladmin@filix.com");
		lp.click_OTP();
		lp.Set_OTP("12");
		lp.Click_verify();
		
		DashboardPage dp = new DashboardPage(driver);
		
		dp.click_ViewBooks();
		dp.click_Teachers();
		dp.click_Students();
		dp.click_Sessions();
		dp.click_CreateNewSession();
		
		dp.click_SearchTheme();
		dp.search_Theme("Around the world");
		dp.Click_OnTheme();
		
		dp.Click_Chapter();
		dp.search_Chapter("Gratitude Tree");
		dp.Click_OnChapter();
		
		dp.Click_Activity();
		dp.Click_OnActivity();
		
		dp.enter_Title("Test activity...");
		dp.enter_Description("Testing");
		dp.enter_StartTime("10/12/2025");
		dp.enter_EndTime("11/11/2025");
//		dp.enter_Teacher("Arj Teacher");
//		dp.Click_TeacherSession();
		
		dp.click_CreateSession();
		dp.click_BackFromSession();
		dp.Click_CohortState();
		dp.open_CohortReport();
		
		for(int i=0;i<=4;i++) {
			dp.clickBackButton();
		}
		
		
		
	}
	
}
