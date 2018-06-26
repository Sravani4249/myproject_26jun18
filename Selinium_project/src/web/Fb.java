package web;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Fb {



WebDriver driver;
public void browser() {
	
	ChromeOptions options = new ChromeOptions();
	 options.addArguments("--disable-notifications");
    System.setProperty("webdriver.chrome.driver", "D:\\Selenium 3.12.0\\chromedriver.exe");
	driver=new ChromeDriver(options);
	
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
}
public void Login() throws Exception {
	
	driver.findElement(By.id("email")).sendKeys("chhemanthi48@gmail.com");

	driver.findElement(By.id("pass")).sendKeys("");
	
	driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
	
	//driver.switchTo().alert().accept();
	
	
	
}
	public static void main(String[] args) throws Exception{
		Fb f=new Fb();
		f.browser();
		f.Login();
	}

}