package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPOM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		PageClass pc=new PageClass(driver);
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		pc.login();
		String username=null;
		pc.emailid(username);
		String password=null;
		pc.password(password);
		pc.submit();
		pc.logout();
		driver.close();
	}

}
