package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class VerifyLogin {
	WebDriver driver;
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Testing Software\\Browsers\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	  
	}

	@When("^User entered valid email and password$")
	public void user_entered_valid_email_and_password() throws Throwable {
		  driver.findElement(By.xpath("//a[@class = 'ico-login']")).click();
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rahulhcl@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahul123");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
	   
	}

	@Then("^User should see a message \"([^\"]*)\"$")
	public void user_should_see_a_message(String arg1) throws Throwable {
	Boolean view=	driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).isDisplayed();
	Assert.assertTrue(view);
	driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
	driver.close();
	}



}
