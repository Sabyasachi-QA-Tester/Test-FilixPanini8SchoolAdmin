package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TeachersPage extends BasePage {

	public TeachersPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Search teachers by name or email...']")
	WebElement txt_Search;
	
	@FindBy(xpath="//button[contains(@class,'bg-gradient-to-r')]")
	WebElement btn_AddTeacher;
	
	@FindBy(xpath="//input[@placeholder='Enter email address']")
	WebElement txt_email;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement txt_name;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txt_password;
	
	@FindBy(xpath="//input[@placeholder='Enter address']")
	WebElement txt_address;
	
	@FindBy(xpath="//input[@name='dob']")
	WebElement txt_DOB;
	
	@FindBy(xpath="//input[@placeholder='Enter phone number']")
	WebElement txt_phone;
	
	@FindBy(xpath="//button[normalize-space()='Create Teacher']")
	WebElement btn_createTeacher;
	
	@FindBy(xpath="//a[normalize-space()='Back to Teachers' and @href='/school/teacher/list']")
	WebElement btn_back;
	
	public void searchTeacher(String teacherNameOrEmail) throws InterruptedException {
		Thread.sleep(2000);
        txt_Search.sendKeys(teacherNameOrEmail);
    }

    public void clickAddTeacher() throws InterruptedException {
    	Thread.sleep(2000);
        btn_AddTeacher.click();
    }

    public void enterEmail(String email) throws InterruptedException {
    	Thread.sleep(2000);
        txt_email.sendKeys(email);
    }

    public void enterName(String name) throws InterruptedException {
    	Thread.sleep(2000);
        txt_name.sendKeys(name);
    }

    public void enterPassword(String password) throws InterruptedException {
    	Thread.sleep(2000);
        txt_password.sendKeys(password);
    }

    public void enterAddress(String address) throws InterruptedException {
    	Thread.sleep(2000);
        txt_address.sendKeys(address);
    }

    public void enterDOB(String dob) throws InterruptedException {
    	Thread.sleep(2000);
        txt_DOB.sendKeys(dob);
    }

    public void enterPhone(String phone) throws InterruptedException {
    	Thread.sleep(2000);
        txt_phone.sendKeys(phone);
    }

    public void selectGender(String genderValue) throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//select[@name='gender']//option[@value='"+genderValue+"']")).click();
    }


    public void clickCreateTeacher() throws InterruptedException {
    	Thread.sleep(2000);
        btn_createTeacher.click();
    }

    public void clickBackToTeachers() throws InterruptedException {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	Thread.sleep(2000);
    	js.executeScript("window.scrollTo(0, 0);");
        btn_back.click();
    }
	
	

}
