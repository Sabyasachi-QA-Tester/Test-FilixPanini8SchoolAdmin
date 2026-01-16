package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@href='/school/cohort/6942f4c6e2232f57df6e6d6f/books']")
	WebElement btn_view;
	
	@FindBy(xpath="//a[@href='/school/cohort/6942f4c6e2232f57df6e6d6f/teachers']")
	WebElement btn_Teacher;
	
	@FindBy(xpath="//a[@href='/school/cohort/6942f4c6e2232f57df6e6d6f/students']")
	WebElement btn_Student;
	
	@FindBy(xpath="//a[@href='/school/cohort/6942f4c6e2232f57df6e6d6f/sessions']")
	WebElement btn_Sessions;
	
	@FindBy(xpath="//a[@href='/school/session/create?cohortId=6942f4c6e2232f57df6e6d6f']")
	WebElement btn_createSession;
	
	@FindBy(xpath="//div[@tabindex='0' and .//span[normalize-space()='Select a theme...']]")
	WebElement btn_SearchTheme;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search...')]")
	WebElement txt_SearchTheme;
	
	@FindBy(xpath="//ul//li[normalize-space()='Around the world']")
	WebElement Click_Theme;
	
	@FindBy(xpath="//div[@tabindex='0' and .//span[normalize-space()='Select a chapter...']]")
	WebElement btn_SearchChapter;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search...')]")
	WebElement txt_SearchChapter;
	
	@FindBy(xpath="//ul//li[normalize-space()='Gratitude Tree']")
	WebElement Click_Chapter;
	
	@FindBy(xpath="//div[@tabindex='0' and .//span[normalize-space()='Select an activity...']]")
	WebElement btn_SearchActivity;
	
	@FindBy(xpath="//ul//li[normalize-space()='Gratitude Tree']")
	WebElement Click_Activity;
	
	@FindBy(xpath="//input[contains(@placeholder,'Enter session title')]")
	WebElement txt_title;
	
	@FindBy(xpath="//textarea[@placeholder='Enter a detailed description of the session...']")
	WebElement txt_desc;
	
	@FindBy(xpath="//input[@name='startTime']")
	WebElement txt_StartTime;
	
	@FindBy(xpath="//input[@name='endTime']")
	WebElement txt_EndTime;
	
//	@FindBy(xpath="//input[@placeholder='Search...']")
//	WebElement txt_Teacher;
	
//	@FindBy(xpath="//ul//li[normalize-space()='Arj Teacher']")
//	WebElement btn_TeacherSession;
	
	@FindBy(xpath="//button[normalize-space()='Create Session']")
	WebElement btn_CreateSession;
	
	@FindBy(xpath="//button[normalize-space()='Back']")
	WebElement btn_backSession;
	
	@FindBy(xpath="//a[@href='/school/cohort/6942f4c6e2232f57df6e6d6f/cohort-state']")
	WebElement btn_CohortState;
	
	@FindBy(xpath="//div[@class='flex items-center gap-8 flex-1']  [.//span[normalize-space()='Arjun Sen(Student)']]")
	WebElement btn_CohortReport;
	
	@FindBy(xpath="//button[contains(@class,'mr-4 p-2 text-blue-500 hover:text-blue-600 bg-blue-50 rounded-lg border border-blue-100')]")
	WebElement btn_back;
	
	
	public void click_ViewBooks() throws InterruptedException {
		Thread.sleep(2000);
        btn_view.click();
    }

    public void click_Teachers() throws InterruptedException {
    	Thread.sleep(2000);
        btn_Teacher.click();
    }

    public void click_Students() throws InterruptedException {
    	Thread.sleep(2000);
        btn_Student.click();
    }

    public void click_Sessions() throws InterruptedException {
    	Thread.sleep(2000);
        btn_Sessions.click();
    }

    public void click_CreateNewSession() throws InterruptedException {
    	Thread.sleep(2000);
        btn_createSession.click();
    }
    
    public void click_SearchTheme() throws InterruptedException {
    	Thread.sleep(2000);
    	btn_SearchTheme.click();
    }

    public void search_Theme(String theme) throws InterruptedException {
    	Thread.sleep(2000);
        txt_SearchTheme.sendKeys(theme);
    }
    
    public void Click_OnTheme() throws InterruptedException {
    	Thread.sleep(2000);
    	Click_Theme.click();
    }
    
    public void Click_Chapter() throws InterruptedException {
    	Thread.sleep(2000);
    	btn_SearchChapter.click();
    }
	
    public void search_Chapter(String chapter) throws InterruptedException {
    	Thread.sleep(2000);
    	txt_SearchChapter.sendKeys(chapter);
    }
    
    public void Click_OnChapter() throws InterruptedException {
    	Thread.sleep(2000);
    	Click_Chapter.click();
    }
    
    public void Click_Activity() throws InterruptedException {
    	Thread.sleep(2000);
    	btn_SearchActivity.click();
    }
    
    public void Click_OnActivity() throws InterruptedException {
    	Thread.sleep(2000);
    	Click_Activity.click();
    }
    
    public void enter_Title(String title) throws InterruptedException {
    	Thread.sleep(2000);
        txt_title.sendKeys(title);
    }

    public void enter_Description(String description) throws InterruptedException {
    	Thread.sleep(2000);
        txt_desc.sendKeys(description);
    }

    public void enter_StartTime(String startTime) throws InterruptedException {
    	Thread.sleep(2000);
        txt_StartTime.sendKeys(startTime);
    }

    public void enter_EndTime(String endTime) throws InterruptedException {
    	Thread.sleep(2000);
        txt_EndTime.sendKeys(endTime);
    }
    
//    public void enter_Teacher(String teacherName) throws InterruptedException {
//    	Thread.sleep(2000);
//        txt_Teacher.sendKeys(teacherName);
//    }
    
//    public void Click_TeacherSession() throws InterruptedException {
//    	Thread.sleep(2000);
//    	btn_TeacherSession.click();
//    }

    public void click_CreateSession() throws InterruptedException {
    	Thread.sleep(2000);
        btn_CreateSession.click();
    }

    public void click_BackFromSession() throws InterruptedException {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");
    	Thread.sleep(2000);
        btn_backSession.click();
    }
    
    public void Click_CohortState() throws InterruptedException {
    	Thread.sleep(2000);
    	btn_CohortState.click();
    }

    public void open_CohortReport() throws InterruptedException {
    	Thread.sleep(2000);
        btn_CohortReport.click();
    }

    public void clickBackButton() throws InterruptedException {
    	Thread.sleep(2000);
        btn_back.click();
    }

}
