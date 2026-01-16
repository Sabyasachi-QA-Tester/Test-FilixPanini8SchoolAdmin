package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThemePage extends BasePage {

	public ThemePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Search themes by name...']")
	WebElement txt_SearchTheme;
	
	@FindBy(xpath="//a[@href='/school/theme/create']")
	WebElement btn_CreateNewTheme;
	
	@FindBy(xpath="//input[@placeholder='Enter theme name']")
	WebElement txt_ThemeName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter theme description']")
	WebElement txt_Description;
	
	@FindBy(xpath="//button[@aria-label='Next page']")
	WebElement btn_NextPage;
	
	public void Search_ThemePage(String theme) {
		try {
			Thread.sleep(2000);
			txt_SearchTheme.sendKeys(theme);
		} 
		catch (Exception e) {
			System.out.println("Searching failed "+e.getMessage());
		}
	}
	
	public void Click_CreateNewTheme() throws InterruptedException {
		Thread.sleep(2000);
		btn_CreateNewTheme.click();
	}
	
	public void Set_ThemeName(String tname) throws InterruptedException {
		Thread.sleep(2000);
		txt_ThemeName.sendKeys(tname);
	}
	
	public void Set_Description(String desc) throws InterruptedException {
		Thread.sleep(2000);
		txt_Description.sendKeys(desc);
	}
	
	public void Pagination() throws InterruptedException {
		
		for(int i=0;i<=5;i++) {
			Thread.sleep(2000);
			btn_NextPage.click();
		}
		
	}
	
	
	
	
	
	

}
