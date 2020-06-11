package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class TestBase {

	public static WebDriver driver ;

	@BeforeSuite 
	public void startdriver() {
		 
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver2/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://zid.sa/en/");
	}

	@AfterSuite
	public void stopdriver() {
		driver.quit();

	}
	
	
	
		
	}













