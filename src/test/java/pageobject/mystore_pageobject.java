package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.launch;

public class mystore_pageobject extends launch{
	
	public mystore_pageobject(WebDriver driver) {
	PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@class='login']")
	WebElement click;
	
	public void typeclick() {
	click.click();
	}

}
