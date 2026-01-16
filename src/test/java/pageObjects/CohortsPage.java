package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CohortsPage extends BasePage {

	public CohortsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Search by title...']")
	WebElement Search_title;
	
	@FindBy(xpath="//a[@href='/school/cohort/create']")
	WebElement btn_CreateCohort;
	
	@FindBy(xpath="//input[@id='title']")
	WebElement txt_title;
	
	@FindBy(xpath="//input[@id='year']")
	WebElement txt_Year;
	
	@FindBy(xpath="//textarea[@id='description']")
	WebElement txt_description;
	
	@FindBy(xpath="//input[@id='startDate']")
	WebElement txt_Startdate;
	
	@FindBy(xpath="//input[@id='endDate']")
	WebElement txt_Enddate;
	
	@FindBy(xpath="//button[@id='class']")
	WebElement btn_Class;
	
	@FindBy(xpath="(//input[@placeholder='Search by name...'])[1]")
	WebElement txt_Students;
	
	@FindBy(xpath="(//input[@placeholder='Search by name...'])[2]")
	WebElement txt_Teachers;
	
	@FindBy(xpath="//button[normalize-space()='Create Cohort']")
	WebElement btn_Cohort;
	
	@FindBy(xpath="//a[@href='/school/cohort/list']")
	WebElement btn_back;
	
	public void Search_Title(String title) throws InterruptedException {
		Thread.sleep(2000);
		Search_title.sendKeys(title);
	}
	
	public void Click_CreateCohort() throws InterruptedException {
		Thread.sleep(2000);
		btn_CreateCohort.click();
	}
	
	public void Set_title(String title) throws InterruptedException {
		Thread.sleep(2000);
		txt_title.sendKeys(title);
	}
	
	public void Set_Year(String year) throws InterruptedException {
		Thread.sleep(2000);
		txt_Year.sendKeys(year);
	}
	
	public void Set_description(String desc) throws InterruptedException {
		Thread.sleep(2000);
		txt_description.sendKeys(desc);
	}
	
	public void Set_StartDate(String sdate) throws InterruptedException {
		Thread.sleep(2000);
		txt_Startdate.sendKeys(sdate);
	}
	
	public void Set_EndDate(String edate) throws InterruptedException {
		Thread.sleep(2000);
		txt_Enddate.sendKeys(edate);
	}
	
	public void Set_Class(String classes) throws InterruptedException {
		Thread.sleep(2000);
		btn_Class.sendKeys(classes);
	}
	
	public void Set_Students(String student) throws InterruptedException {
		Thread.sleep(2000);
		txt_Students.sendKeys(student);
	}
	
	public void Set_Teachers(String teacher) throws InterruptedException {
		Thread.sleep(2000);
		txt_Teachers.sendKeys(teacher);
	}
	
	public void Click_Cohort() throws InterruptedException {
		Thread.sleep(2000);
		btn_Cohort.click();
	}
	
	public void Click_back() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");
		Thread.sleep(2000);
		btn_back.click();
	}
	

}
