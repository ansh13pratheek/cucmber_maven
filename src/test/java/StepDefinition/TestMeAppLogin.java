package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class TestMeAppLogin {
	WebDriver driver = null;
	@Given("^The login page is opened$")
	public void the_login_page_is_opened() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser Driver\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp");
	   driver.manage().window().maximize();
	   driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^User enters Lalitha as username$")
	public void user_enters_Lalitha_as_username() {
		driver.findElement(By.id("userName")).sendKeys("Lalitha"); 
	}

	@When("^User enters password(\\d+) as password$")
	public void user_enters_password_as_password(int arg1) {
		driver.findElement(By.id("password")).sendKeys("password123");
	}

	@Then("^User will find a testmeapp homepage$")
	public void user_will_find_a_testmeapp_homepage() {
	    driver.findElement(By.name("Login")).click();
	}
}