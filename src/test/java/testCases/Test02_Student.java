package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Studentspage;
import testBase.BaseClass;

public class Test02_Student extends BaseClass {
	
	@Test
	public void AddStudent() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.Click_login();
		lp.Set_email(p.getProperty("Email"));
		lp.click_OTP();
		lp.Set_OTP(p.getProperty("OTP"));
		lp.Click_verify();
		
		HomePage hp = new HomePage(driver);
		hp.Click_menu();
		hp.Click_Students();
		
		
		Studentspage sp = new Studentspage(driver);
		
		sp.Set_Students("Cool John");
		sp.Click_AddStudent();
		sp.Set_Email(randomeString()+"@gmail.com");
		sp.Set_Name(randomeString().toLowerCase());
		sp.Set_Address(randomeString().toLowerCase());
		sp.Set_DOB("02/25/2005");
		sp.Set_Phone(randomeNumber());
		sp.Set_Gender("male");
		sp.Set_Cohorts("KG 2");
		sp.Set_PEN(randomeNumber());
		sp.Click_back();
		
		
	}

}
