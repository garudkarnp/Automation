package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefclass {
	WebDriver driver;
	
	/*@After
	public void aftermethod(){
		
		driver.close();
	}*/
	
	@When("User launch Testme App portal")
	public void user_launch_Testme_App_portal() {
	    System.out.println("User launch Testme App portal");
	
	
	}

	@When("Enter username And password")
	public void enter_username_And_password() {
		System.out.println("Enter username And password");
	}

	@When("click OK")
	public void click_OK() {
		System.out.println("click OK");
	}

	@Then("validate login success")
	public void validate_login_success() {
		System.out.println("validate login success");
		//throw new RuntimeException();
	}
	@Given("user launching TestmeApp portal")
	public void user_launching_TestmeApp_portal() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nisha.garudkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");
	    

	}




	@When("clicks Login button")
	public void clicks_Login_button() {
		//System.out.println("clicks on Login button");
		driver.findElement(By.name("Login")).click();  
	}

	@When("user enters with {string} And enters {string}")
	public void user_enters_with_And_enters(String un, String psd) {
	
		//System.out.println("username and password is "+un+"----"+psd);
	driver.findElement(By.id("userName")).sendKeys(un);
	driver.findElement(By.id("password")).sendKeys(psd);
	}

	@Then("user validates login status {string}")
	public void user_validates_login_status(String st) {
	  System.out.println("Credentials entered are "+st);
	
	}

}
