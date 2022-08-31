package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.bankManagerLoginPage;

public class testcase1 {
	
	WebDriver driver = new ChromeDriver();
	
	@Test(priority=1)
	public void launchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		
		Thread.sleep(5000);
		
	}
	
	
	@Test(priority=2)
	public void clickBankManagerLogin() throws InterruptedException
	{
		bankManagerLoginPage obj = new bankManagerLoginPage(driver);
		obj.bankManagerFunctionality();
		
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
