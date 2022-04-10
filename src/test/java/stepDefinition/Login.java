package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import junit.framework.Assert;
public class Login {
	
	WebDriver driver = BaseDriver.driver;
	
	@Given("user is opening the browser")
	public void user_is_opening_the_browser() throws Throwable {
		driver.get("https://www.simplilearn.com/");
		Thread.sleep(5000);
	}

	@Then("clicks on login button")
	public void clicks_on_login_button() {
	    
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		
		LoginLink.click();
		
	}

	@When("user enters valid username")
	public void user_enters_valid_username() {
	    
		WebElement userName = driver.findElement(By.name("user_login"));
		userName.sendKeys("tipyana@rocketmail.com");
		
	}

	@When("user enters valid password")
	public void user_enters_valid_password() {
		
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("Mwakapiso7");
		
	}

	@When("user enters valid username {string}")
	public void user_enters_valid_username(String usrnm) {
		WebElement userName = driver.findElement(By.name("user_login"));
		userName.sendKeys(usrnm);
	}

	@When("user enter valid password {string}")
	public void user_enter_valid_password(String pswd) {
	    
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys(pswd);
	}
	
	@Then("user should appear on dashboard")
	public void user_should_appear_on_dashboard() {
	
	WebElement loginBtn = driver.findElement(By.name("btn_login"));
	loginBtn.click();
	
	}

	@Then("user should get the error message as {string}")
	public void user_should_get_the_error_message_as(String expMsg) {
	    
		WebElement errormsg = driver.findElement(By.id("msg_box"));
		String actualmsg =errormsg.getText();
		
		Assert.assertEquals(expMsg,actualmsg);
	}
	
}
