package maven1;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharafDGerror extends SharafDG {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvi\\eclipse-workspace\\maven1\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://uae.sharafdg.com/");
	driver.manage().window().maximize();
	Robot r = new Robot();
	JavascriptExecutor js =(JavascriptExecutor) driver;
	driver.findElement(By.xpath("//i[@class='sh sh-login']")).click();
	driver.findElement(By.xpath("(//a[@class='btn-transparent'])[2]")).click();
	driver.findElement(By.id("reg_email")).sendKeys(getData(0,0));
	driver.findElement(By.id("reg_password")).sendKeys(getData(0,1));
	driver.findElement(By.id("first_name")).sendKeys(getData(0,2));
	driver.findElement(By.id("last_name")).sendKeys(getData(0,3));
	driver.findElement(By.id("account_mobile_no")).sendKeys(getData(0,4));
	driver.findElement(By.xpath("//i[@class='sh sh-checkbox']")).click();
	for (int i = 1; i <=2; i++) {
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	//WebElement butn = driver.findElement(By.xpath("//input[@name='register']"));
	//butn.click();
	//js.executeScript("argument[0].click", butn);
	
	
}
}
