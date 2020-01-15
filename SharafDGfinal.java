package maven1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SharafDGfinal extends SharafDG {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvi\\eclipse-workspace\\maven1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uae.sharafdg.com/");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		TakesScreenshot tk = (TakesScreenshot)driver;
		Robot r = new Robot();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.findElement(By.xpath("//i[@class='sh sh-login']")).click();
		driver.findElement(By.xpath("(//a[@class='btn-transparent'])[1]")).click();
		driver.findElement(By.id("username")).sendKeys(getData(0,0));
		driver.findElement(By.id("password")).sendKeys(getData(0,1));
		driver.findElement(By.xpath("//input[@name='login']")).click();
		WebElement mobile = driver.findElement(By.xpath("(//a[@class='mega-menu-link'])[38]"));
		ac.moveToElement(mobile).perform();
		driver.findElement(By.xpath("//a[@href='/iphone-11/']")).click();
		File screenShot1 = tk.getScreenshotAs(OutputType.FILE); 
		File newLoc1 = new File("C:\\Users\\yuvi\\Desktop\\ScreenShot\\screenshot1.png");
		FileUtils.copyFile(screenShot1,newLoc1);
		//WebElement frame = driver.findElement(By.xpath("//iframe[@src='https://creativecdn.com/tags?id=pr_LAhJgoDb49RSsgF7joWi&ncm=1']"));
		//driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//div[@class='footer-bottom']"));
		Thread.sleep(4000);
		File screenShot2 = tk.getScreenshotAs(OutputType.FILE);
		File newLoc2 = new File("C:\\Users\\yuvi\\Desktop\\ScreenShot\\screenshot2.png");
		FileUtils.copyFile(screenShot2,newLoc2);
		driver.findElement(By.xpath("//a[@title='Apple iPhone 11 Pro Max 256GB Space Grey']"));
		ac.contextClick().perform();
		for (int i = 1; i <=2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		for(String x : allWindows) {
			if (!parent.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='//s.sdgcdn.com/7/2019/08/06c91a25f2b84463c653983bb8f30af24fae428c_Image_Product_Key_Visual_Davinci_Davinci1_Product_Images_Aura_Black_5G_sm_n971_davinci1_front_p-300x300.jpg']")).click();
		Thread.sleep(3000);
		WebElement f = driver.findElement(By.xpath("(//iframe[@src='https://www.youtube.com/embed/uRzEhLm3-hc/?enablejsapi=1&controls=0&loop=1&fs=0&rel=0&modestbranding=1&iv_loading_policy=3&playsinline=1&showinfo=0'])[1]"));
		driver.switchTo().frame(f);
		//driver.findElement(By.xpath("//div[@class='pdp--price-wrp']"));
		//Thread.sleep(3000);
		//WebElement button = driver.findElement(By.xpath("//button[@class='add_to_cart_button ajax_add_to_cart button btn btn-secondary alt']"));
		//button.click();	
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("iphone 7");
		driver.findElement(By.xpath("//button[@class='btn btn-secondary search-btn']")).click();
		driver.findElement(By.xpath("//img[@src='//s.sdgcdn.com/7/2018/06/7c129f622e195bd4d85f5c712c39cfbeee5525f4_d877a561134c8cb11042a6b2c2d12f1560f6161d_2016_10_30_08_16_10_1610_7b24_optimized-145x300.jpeg']")).click();
		}	
	}

