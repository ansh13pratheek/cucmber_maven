package POMwithPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class TestPF {

	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		PageClass pp=PageFactory.initElements(driver, PageClass.class);
		pp.qwerty("ksansh@gmail.com", "1234567890");
		Thread.sleep(5000);
		driver.close();
	}
}
