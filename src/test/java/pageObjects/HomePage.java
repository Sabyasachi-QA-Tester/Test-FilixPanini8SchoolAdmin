package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[@class='bg-gray-100 rounded-lg p-3 text-gray-700 focus:outline-none hover:bg-gray-200']")
	WebElement btn_menu;
	
	@FindBy(xpath="//a[normalize-space()='Teachers']")
	WebElement btn_Teachers;
	
	@FindBy(xpath="//a[normalize-space()='Students']")
	WebElement btn_Students;
	
	@FindBy(xpath="//a[@href='/school/cohort/list']")
	WebElement btn_Cohorts;
	
	@FindBy(xpath="//a[@href='/school/session/list']")
	WebElement btn_Sessions;
	
	@FindBy(xpath="//a[@href='/school/profile']")
	WebElement btn_Profile;
	
	//////////////////////////////////////////////////
	
	@FindBy(xpath="//button[.//text()[normalize-space()='HPC Section']]")
	WebElement btn_HPCSection;
	
	@FindBy(xpath="//a[@href='/school/theme/list']")
	WebElement btn_Themes;
	
	@FindBy(xpath="//a[@href='/school/chapter/list']")
	WebElement btn_Chapters;
	
	@FindBy(xpath="//a[@href='/school/activity']")
	WebElement btn_Activity;
		
	
	public void Click_menu() throws InterruptedException {
		Thread.sleep(2000);
		btn_menu.click();
	}
	
	public void Click_Teachers() throws InterruptedException {
		Thread.sleep(2000);
		btn_Teachers.click();
	}
	
	public void Click_Students() throws InterruptedException {
		Thread.sleep(2000);
		btn_Students.click();
	}
	
	public void Click_Cohorts() throws InterruptedException {
		Thread.sleep(2000);
		btn_Cohorts.click();
	}
	
	public void Click_Sessions() throws InterruptedException {
		Thread.sleep(2000);
		btn_Sessions.click();
	}
	
	public void Click_Profile() throws InterruptedException {
		Thread.sleep(2000);
		btn_Profile.click();
	}
	
	public void Click_HPCSection() throws InterruptedException {
		Thread.sleep(2000);
		btn_HPCSection.click();
	}
	
	public void Click_Themes() throws InterruptedException {
		Thread.sleep(2000);
		btn_Themes.click();
	}
	
	public void Click_Chapters() throws InterruptedException {
		Thread.sleep(2000);
		btn_Chapters.click();
	}
	
	public void Click_Activity() throws InterruptedException {
		Thread.sleep(2000);
		btn_Activity.click();
	}

}
