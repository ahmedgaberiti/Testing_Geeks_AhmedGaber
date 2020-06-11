package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import data.LoadProperties;
import pom_pages.HomePage;
import pom_pages.RegisterPage;
import pom_pages.RegisterPage2;
import pom_pages.UserHomePage;

public class UserRegisteration extends TestBase {

	HomePage homepage;
	RegisterPage registerpage; 
	RegisterPage2 registerpage2; 
	UserHomePage userhomepage;
	//load data from outsource file 
	String name = LoadProperties.userData.getProperty("name");
	String mobile = LoadProperties.userData.getProperty("mobile");
	String email = LoadProperties.userData.getProperty("email");
	String password = LoadProperties.userData.getProperty("password");
	String store_english = LoadProperties.userData.getProperty("storeenglish");
	String store_arabic = LoadProperties.userData.getProperty("storearabic");

	@Test
	public void userregisterationsuccessfully ( )  {
	    
		homepage= new HomePage(driver);
		registerpage = new RegisterPage(driver);
		registerpage2 = new RegisterPage2(driver);
		userhomepage = new UserHomePage(driver);
		
		// wait to close the alert in home page because of connection delay 
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='leadinModal-close']")));
		homepage.closeAlert();
		homepage.openRegistrationPage();
		//wait for the second page to start registration because of connection delay
		WebDriverWait secondwait = new WebDriverWait(driver, 60);
		secondwait.until(ExpectedConditions.elementToBeClickable(By.id("name")));
		//start to fill the registration form
		registerpage.enterRegisterFields( name , password , email , mobile);
		registerpage.clickNextbtn();
		//second page registration form
		registerpage2.enterRegisterFields2( store_english , store_arabic  );
		registerpage2.selectFromDropDown();
		registerpage2.clickno_radiobtn();
		registerpage2.clicksubmitbtn();
		 
		WebDriverWait thirdwait = new WebDriverWait(driver, 60);
		thirdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='intercom-post-close intercom-199syus e1uu5mk82']")));
		userhomepage.closeSorry_alert();
		userhomepage.click_logout();
		
		
	}

}
