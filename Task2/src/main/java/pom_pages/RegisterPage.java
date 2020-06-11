package pom_pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageBase {

	public RegisterPage(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(id  ="name")
	WebElement namefield;

	@FindBy(id  ="mobile")
	WebElement mobilefield;

	@FindBy(id  ="registration_password")
	WebElement passwordfield;

	@FindBy(id  ="registration_email")
	WebElement emailfield;
	

	@FindBy(xpath ="//button[@class='btn next-tab-btn']")
	public WebElement nextbtn;
	
	
	
	
	public void clickNextbtn () {
		clickButton(nextbtn);
	}
	
	public void enterRegisterFields( String name , String password , String email ,String mobile) {
		
		setText(namefield, name);
		setText(mobilefield, mobile);
		setText(emailfield, email);
		setText(passwordfield, password);
		
	}
	
	
}
