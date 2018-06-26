package junit_01;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class IrctC_LoginTest_1 {
static WebDriver driver;
	@BeforeClass
	public static void browser() throws Exception {
		  //driver is an instance variable, which can be accessed by all methods
		System.setProperty("webdriver.chrome.driver","D:\\Selenium 3.12.0\\chromedriver.exe");
		driver=new ChromeDriver();
		//to insert url in the browser
		driver.get("https://www.irctc.co.in/nget/train-search");
		//to maximize the browser window
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void login() throws Exception{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='ng-star-inserted'][contains(text(),'LOGIN')]")).click();
		
		//wait 5 sec for userid to be entered
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("sravani4249");
		//wait 5 secs to click on next button
        
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("Paradise24");
		//wait 5 sec to click on next button
		
		
		
		//WebElement CheckBox = driver.findElement(By.xpath("//input[@id='otpLogin']"));

		 //CheckBox.click();
	Thread.sleep(30000);
	
		driver.findElement(By.xpath("//button[@class='search_btn'][contains(text(),'SIGN IN')]")).click();
	}

}

