package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserHomePage extends PageBase {

	public UserHomePage(WebDriver driver) {
		super(driver);

	}


	@FindBy(id  ="//span[@class='intercom-post-close intercom-199syus e1uu5mk82']")
	WebElement close_sorry_alert;
	
	@FindBy(xpath = "//a[@href='https://web.zid.sa/logout']")
	public WebElement logout_btn;
	
	public void closeSorry_alert() {
		clickButton(close_sorry_alert);
		
		
	}
	
	public void click_logout() {
		clickButton(logout_btn);
		
		
	}
	
	
	













}

