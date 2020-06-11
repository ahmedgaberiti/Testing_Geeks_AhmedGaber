package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage2 extends PageBase {


	public RegisterPage2(WebDriver driver) {
		super(driver);

	}


	@FindBy(id  ="store_username")
	WebElement store_englishfield;

	@FindBy(id  ="store_name")
	WebElement store_arabicfield;
	
	@FindBy(xpath="//button[@class='btn btn-primary login-btn']")
	WebElement submitbtn;
	
	@FindBy(xpath="//span[@class='help-block']")
	public WebElement errormessage;

	@FindBy(id  ="store_category_id")
	public WebElement dropdownmenu;

	@FindBy(id  ="started_business_before_registration_no")
	public WebElement no_radiobtn;
	
	public void selectFromDropDown (){
		Select element = new Select(dropdownmenu); 
		element.getFirstSelectedOption();
	}
	
	

	public void enterRegisterFields2( String store_englishname , String store_arabicname) {

		setText(store_englishfield, store_englishname );
		setText(store_arabicfield, store_arabicname);
		
		
	}

	public void clicksubmitbtn () {
		clickButton(submitbtn);
	}
	
	public void clickno_radiobtn () {
		clickButton(no_radiobtn);
	}













}
