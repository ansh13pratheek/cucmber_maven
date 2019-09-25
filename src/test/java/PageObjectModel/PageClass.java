package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageClass {
	By lin=By.xpath("//a[@href='/login']");
	By email=By.name("Email");
	By pass=By.name("Password");
	By sub=By.xpath("//input[@class='button-1 login-button']");
	By lgo=By.xpath("//a[@href='/logout']");
	WebDriver driver;
	
	public PageClass(WebDriver driver) {
		this.driver=driver;
	}
	
	public void login() {
		driver.findElement(lin).click();
	}
	
	public void emailid(String username) {
		driver.findElement(email).sendKeys("ksansh@gmail.com");
	}
	
	public void password(String password) {
		driver.findElement(pass).sendKeys("1234567890");
	}
	
	public void submit() {
		driver.findElement(sub).click();
	}
	
	public void logout() {
		driver.findElement(lgo).click();
	}
}		
