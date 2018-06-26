package mysample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling_1 {
WebDriver driver;
public void browser() {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium 3.12.0\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.onlinesbi.com");
	driver.manage().window().maximize();
}
public void alert() throws Exception {
	driver.findElement(By.xpath("//span[@class='classicTxt']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@href='javascript:void(0);'][contains(text(),'CONTINUE TO LOGIN')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@tabindex='16']")).click();
	Thread.sleep(3000);
	//to print the alert message
	String s=driver.switchTo().alert().getText();
	System.out.println(s);
	//to click the ok button
	driver.switchTo().alert().accept();
	//to click the cancel button
}
	public static void main(String[] args) throws Exception{
		AlertsHandling_1 al_1=new AlertsHandling_1();
		al_1.browser();
		al_1.alert();
	}

}

