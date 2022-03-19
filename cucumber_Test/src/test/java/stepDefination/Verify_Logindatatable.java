package stepDefination;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.DataTable;







public class Verify_Logindatatable {
	WebDriver driver;
	
	@Given("^User present on web-shop login page$")
	public void user_present_on_web_shop_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Testing Software\\Browsers\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	}

	@When("^User sign in with email and password$")
	public void user_sign_in_with_email_and_password(DataTable variables) throws Throwable {
	//<List<String>data=variables.raw();
	//	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(data.get(0).get(0));
	//	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("^User should see logout$")
	public void user_should_see_logout() throws Throwable {
		Boolean view=	driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).isDisplayed();
		Assert.assertTrue(view);
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		driver.close(); 
	}
}
