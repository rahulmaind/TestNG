package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class InvalidLogin {
	WebDriver driver;
	@Given("^I have opened demowebshop loginpage$")
	public void i_have_opened_demowebshop_loginpage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Testing Software\\Browsers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	}

	@When("^I enterd invalid credentials$")
	public void i_enterd_invalid_credentials() throws Throwable {
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rahul@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rajkk");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("^I should view error message$")
	public void i_should_view_error_message() throws Throwable {
		Boolean view=	driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).isDisplayed();
		Assert.assertTrue(view);
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		driver.close();
	}


}
