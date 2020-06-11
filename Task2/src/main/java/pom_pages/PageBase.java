package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	protected WebDriver driver ;

	public PageBase(WebDriver driver) {

		PageFactory.initElements(driver, this);
		

	}


	protected static void clickButton(WebElement button) {

		button.click();
	}

	protected static void setText (WebElement text , String value) {
		
		text.sendKeys(value);
	}

	
	














}
