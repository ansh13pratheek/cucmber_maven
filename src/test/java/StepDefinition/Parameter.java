package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parameter {
	WebDriver driver=null;
	@Given("The login page  opened")
	public void the_login_page_opened() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser Driver\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("http://10.232.237.143:443/TestMeApp");
		   driver.manage().window().maximize();
		   driver.findElement(By.linkText("SignIn")).click();
	}

	@When("Enters {string} as username and {string} as password")
	public void enters_as_username_and_as_password(String string, String string2) {
		driver.findElement(By.id("userName")).sendKeys(string); 
		driver.findElement(By.id("password")).sendKeys(string2);
	}

	@When("Clicks Login button")
	public void clicks_Login_button() {
		driver.findElement(By.name("Login")).click();
	}

	@Then("finds a testmeapp homepage")
	public void finds_a_testmeapp_homepage() {
	   System.out.println(driver.getTitle());
	}
}
