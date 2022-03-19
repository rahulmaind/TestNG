package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class BackgroundDemo {
	WebDriver driver;
	
@Given("^I am on the demowebshop page$")
public void i_am_on_the_demowebshop_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Testing Software\\Browsers\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
driver.get("http://demowebshop.tricentis.com/login");
driver.manage().window().maximize(); //maximize


}



@Then("^I should see that title contains shop\\.$")
public void i_should_see_that_title_contains_shop() throws Throwable {
assert driver.getTitle().contains("Shop");

}



@Then("^I should see that source contains shop\\.$")
public void i_should_see_that_source_contains_shop() throws Throwable {
assert driver.getPageSource().contains("shop");
driver.close();

}


	


}    
