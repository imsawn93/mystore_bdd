package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	 public WebDriver browser;
	 
	public void login() {
	 System.setProperty("webdriver.chrome.driver", "/Users/ashrafhossain/Downloads/chromedriver83/chromedriver");
	 browser = new ChromeDriver();
	 //going to website
	 
	 //maximizing window
	 browser.manage().window().maximize();
	 
	 browser.manage().deleteAllCookies();
	 
	 browser.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 browser.get("http://automationpractice.com/index.php");
	 }
	

	 
	 public void close() throws InterruptedException {
	 //2 sec pause
	 Thread.sleep(2000);
	 //closing browser
	 browser.quit();	
	 }

}
