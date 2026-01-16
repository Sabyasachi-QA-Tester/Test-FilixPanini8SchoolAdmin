package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActivityPage extends BasePage {

	public ActivityPage(WebDriver driver) {
		super(driver);
	}
	
	public void Search_Activities(String activity) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search activities...']")).sendKeys(activity);
	}
	
	public void Click_RemoveActivity() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Clear search']")).click();
	}
	
	public void Click_AddActivity() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/school/activity/create']")).click();
	}
	
	public void Set_Title(String title) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='e.g., Science Experiment']")).sendKeys(title);
	}
	
	public void Set_Description(String desc) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(desc);
	}
	
	public void Set_Class() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='react-select__input']")).sendKeys("KG 1");
	}
	
	public void Set_Age(String age) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter age']")).sendKeys(age);
	}
	
	public void Click_BookName() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@role='combobox' and .//span[normalize-space()='Select a book...']]")).click();
	}
	
	public void Search_Books(String book) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search books...']")).sendKeys(book);
	}
	
	public void Click_Book() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul//li[normalize-space()='Sparkle -1']")).click();
	}
	
	public void Click_Chapters() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@role='combobox' and .//span[normalize-space()='Select chapters...']]")).click();
	}
	
	public void Search_Chapters(String chapter) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search chapters...']")).sendKeys(chapter);
	}
	
	public void Click_Chapter() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul//li[normalize-space()='Missing Numbers']")).click();
	}
	
	public void Click_Competencies() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@role='combobox' and .//span[normalize-space()='Select competency...']]")).click();
	}
	
	public void Search_Competencies(String competency) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search competencies...']")).sendKeys(competency);
	}
	
	public void Click_Competency() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Cognitive Development']")).click();
	}
	
	public void Click_Skills() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@role='combobox' and .//span[normalize-space()='Select skill...']]")).click();
	}
	
	public void Search_Skills(String skill) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search skills...']")).sendKeys(skill);
	}
	
	public void Click_Skill() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Citizenship']")).click();
	}
	
	public void txt_CompetencyExplanation(String compE) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@placeholder='Explain the competency...']")).sendKeys(compE);
	}
	
	public void txt_SkillExplanation(String skillE) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@placeholder='Explain the skill...']")).sendKeys(skillE);
	}
	
	public void txt_Rubric(String rubric) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@placeholder='Describe the rubric...']")).sendKeys(rubric);
	}
	
	public void Click_AddAnotherPair() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Another Pair']")).click();
	}
	
	public void Click_RemoveAnotherPair() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button' and contains(@class,'text-red')])[2]")).click();
	}
	
	public void Click_PDFUpload(String file) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='file']")).sendKeys(file);
	}
	
	public void Click_Cancel() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
	}
	

}
