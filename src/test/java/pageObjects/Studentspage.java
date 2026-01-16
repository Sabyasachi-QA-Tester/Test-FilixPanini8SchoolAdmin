package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Studentspage extends BasePage {

	public Studentspage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Search students by name or email...']")
	WebElement txt_students;
	
	@FindBy(xpath="//a[@href='/school/student/create']")
	WebElement btn_AddStudent;
	
	@FindBy(xpath="//input[@placeholder='Enter email address']")
	WebElement txt_Email;
	
	@FindBy(xpath="//input[@placeholder='Enter full name']")
	WebElement txt_name;
	
	@FindBy(xpath="//input[@placeholder='Enter address']")
	WebElement txt_Address;
	
	@FindBy(xpath="//input[@name='dob']")
	WebElement txt_DOB;
	
	@FindBy(xpath="//input[@placeholder='Enter phone number']")
	WebElement txt_phone;
	
	@FindBy(xpath="//select[@name='gender']")
	WebElement txt_gender;
	
	@FindBy(xpath="//input[@placeholder='XXXX0987654321']")
	WebElement txt_PEN;
	
	@FindBy(xpath="//a[normalize-space()='Back to Students']")
	WebElement btn_back;
	
	
	public void Set_Students(String student) throws InterruptedException {
		Thread.sleep(2000);
		txt_students.sendKeys(student);
	}
	
	public void Click_AddStudent() throws InterruptedException {
		Thread.sleep(2000);
		btn_AddStudent.click();
	}
	
	public void Set_Email(String email) throws InterruptedException {
		Thread.sleep(2000);
		txt_Email.sendKeys(email);
	}
	
	public void Set_Name(String name) throws InterruptedException {
		Thread.sleep(2000);
		txt_name.sendKeys(name);
	}
	
	public void Set_Address(String address) throws InterruptedException {
		Thread.sleep(2000);
		txt_Address.sendKeys(address);
	}
	
	public void Set_DOB(String dob) throws InterruptedException {
		Thread.sleep(2000);
		txt_DOB.sendKeys(dob);
	}
	
	public void Set_Phone(String phone) throws InterruptedException {
		Thread.sleep(2000);
		txt_phone.sendKeys(phone);
	}
	
	public void Set_Gender(String gendervalue) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='gender']//option[@value='"+gendervalue+"']")).click();
	}
	
	public void Set_Cohorts(String cohort) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'react-select') and @role='combobox']")).sendKeys(cohort);
	}
	
	public void Set_PEN(String pen) throws InterruptedException {
		Thread.sleep(2000);
		txt_PEN.sendKeys(pen);
	}
	
	public void Click_back() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	Thread.sleep(2000);
    	js.executeScript("window.scrollTo(0, 0);");
		btn_back.click();
	}
	
}
