package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {


	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(xpath  = "//nav[@class='extraNav']//a[@href='https://web.zid.sa/register']")
	WebElement Registerlink ;
	
	@FindBy(xpath ="//button[@class='leadinModal-close']")
	WebElement closebutton;

	public void openRegistrationPage() {
		 clickButton(Registerlink);
		
	}

	public void closeAlert() {
		  clickButton(closebutton);
		
	}










}