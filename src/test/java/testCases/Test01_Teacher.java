package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.TeachersPage;
import testBase.BaseClass;

public class Test01_Teacher extends BaseClass {
	
	@Test
	public void AddTeacher() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.Click_login();
		lp.Set_email("schooladmin@filix.com");
		lp.click_OTP();
		lp.Set_OTP("12");
		lp.Click_verify();
		
		HomePage hp = new HomePage(driver);
		hp.Click_menu();
		hp.Click_Teachers();
		
		TeachersPage tp = new TeachersPage(driver);
		tp.searchTeacher("test activity");
		tp.clickAddTeacher();
		tp.enterEmail(randomeString()+"@gmail.com");
		tp.enterName(randomeString().toLowerCase());
		
		String password = randomeAlphaNumeric();
		tp.enterPassword(password);
				
		tp.enterAddress(randomeString().toLowerCase());
		tp.enterDOB("12/02/1999");
		tp.enterPhone(randomeNumber());
		tp.selectGender("male");
		tp.clickCreateTeacher();
		tp.clickBackToTeachers();
		
		
	}
	

}
