package Demo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	
	
	WebDriver driver = new ChromeDriver();
	
	
	@Test
	public void letsTest() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://parabank.parasoft.com/parabank/openaccount.htm");
		Thread.sleep(5000);
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='type']")));
		sel.selectByVisibleText("SAVINGS");
		
//		Select s = new Select(driver.findElement(By.xpath("//select[@id='fromAccountId']")));
//		s.selectByVisibleText(text);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add(driver.findElement(By.xpath(" ")).getText());
		list.add(driver.findElement(By.xpath(" ")).getText());
		
		
		
				
		
		
		
		boolean product = driver.findElement(By.xpath("//td[contains(text(),'Nokia lumia 1520')]")).isDisplayed();
		
		Assert.assertEquals(product, true, "product not displayed");
		
		
	}
	
	
	
	
	

}
