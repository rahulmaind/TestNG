package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class HooksDemo {
	WebDriver driver;
	
	@Before
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Testing Software\\Browsers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Given("^I am the on demo web shop tricentis loginpage\\.$")
	public void i_am_the_on_demo_web_shop_tricentis_loginpage() throws Throwable {
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	}

	@Then("^I should able to see title contains shop\\.$")
	public void i_should_able_to_see_title_contains_shop() throws Throwable {
	   assert driver.getTitle().contains("shop");
	}

	@Then("^I should able to see source conatains shop\\.$")
	public void i_should_able_to_see_source_conatains_shop() throws Throwable {
	  assert driver.getTitle().contains("shop");
	}
	
	@After
	public void closeBrowser()
	{
		driver.close();
	}
}
