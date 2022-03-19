package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;







public class ScenarioOutlinedemo {
	WebDriver driver;
	
	/*
	@Given("^User navigates to the website demowebshoptricentrics$")
	public void user_navigates_to_the_website_demowebshoptricentrics() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Testing Software\\Browsers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	}

	@When("^User logs in with ([^\\\"]*) and ([^\\\"]*)$")
	public void user_logs_in_with_email_and_password(String email, String password) throws Throwable {
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("^User should view logout link$")
	public void user_should_view_logout_link() throws Throwable {
		Boolean view=	driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).isDisplayed();
		Assert.assertTrue(view);
		driver.close();
	}
}

*/

@Given("^User navigates to the website demowebshoptricentrics$")
public void user_navigates_to_the_website_demowebshoptricentrics() throws Throwable {
   System.setProperty("webdriver.chrome.driver", "C:\\Testing Software\\Browsers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
}

@When("^User logs in with ([^\\\"]*) and ([^\\\"]*)$")
public void user_logs_in_with_email_and_password(String email, String password) throws Throwable {
  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
}

@Then("^User should view logout link$")
public void user_should_view_logout_link() throws Throwable {
    Boolean view=	driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).isDisplayed();
		Assert.assertTrue(view);
		driver.close();
}
}