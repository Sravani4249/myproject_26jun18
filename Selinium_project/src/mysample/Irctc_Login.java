package mysample;

import static org.junit.Assert.*;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import com.asprise.util.ocr.OCR;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc_Login {
 static WebDriver driver;
	@BeforeClass
	public static void browser() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium 3.12.0\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.irctc.co.in/nget/train-search");
			driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	public void login() throws Exception{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='ng-star-inserted'][contains(text(),'LOGIN')]")).click();
		//to open email id and to be entered
		driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("sravani4249");
		Thread.sleep(5000);
		//password to be entered
		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("Paradise24");
		Thread.sleep(5000);
		
		 String imageUrl = driver.findElement(By.xpath("//img[@class='captcha-img']")).getAttribute("//img[@class='captcha-img']");  //this will read the captcha
	        //System.out.println());
	        
	        
	        
	        System.out.println("Image source path : \n"+ imageUrl);

	        URL url = new URL(imageUrl);
	        Image image = ImageIO.read(url);
	        String s = new OCR().recognizeCharacters((RenderedImage) image);
	        System.out.println("Text From Image : \n"+ s);
	        
	        
	        
	        driver.findElement(By.xpath("//input[@id='captcha']")).sendKeys(s);
	        
	        
		driver.findElement(By.xpath("//button[@class='search_btn'][contains(text(),'SIGN IN')]")).click();
		
		
	}

}
