package mysample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {
WebDriver driver;
public void browser() {
	
System.setProperty("webdriver.chrome.driver", "D:\\Selenium 3.12.0\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
}
public void Login() throws Exception {
	Thread.sleep(5000);
	//to open email id and to be entered
	driver.findElement(By.id("email")).sendKeys("shravany@gmail.com");
	Thread.sleep(5000);
	//password to be entered
	driver.findElement(By.id("pass")).sendKeys("Shravanyy4567");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
	//to close the browser
	driver.quit();
	
}
	public static void main(String[] args) throws Exception{
		Facebook_Login fb=new Facebook_Login();
		fb.browser();
		fb.Login();
	}

}
