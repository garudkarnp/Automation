package stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class Stepdefclass3 {
	
	WebDriver driver;
	
	@Given("user launching login screen")
	public void user_launching_login_screen() {
		System.out.println("Login screen");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nisha.garudkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--headless");
		driver = new ChromeDriver(ch);
		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");
	}

	@When("user enter with credentials")
	public void user_enter_with_credentials(DataTable usercredentials) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		/*List<List<String>> data = usercredentials.asLists();
		for (List<String> i:data){
			String username =i.get(0);
			String password =i.get(1);
			System.out.println("username + password");
			driver.findElement(By.id("userName")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.name("Login")).click();
					if(driver.getTitle().contains("Login")){
						driver.findElement(By.id("userName")).clear();
						driver.findElement(By.id("password")).clear();
					}
		}*/
		/*List<List<String>> data = usercredentials.asLists();
		
		for(int i=0;i<data.size();i++){
			int j=0;
		driver.findElement(By.id("userName")).sendKeys(data.get(i).get(j));
		driver.findElement(By.id("password")).sendKeys(data.get(i).get(j+1));
		driver.findElement(By.name("Login")).click();
		if(driver.getTitle().contains("Login")){
			driver.findElement(By.id("userName")).clear();
			driver.findElement(By.id("password")).clear();
		}
	}*/
	
		List<Map<String,String>> data = usercredentials.asMaps(String.class,String.class);
	//for(Map<String,String> i: data){
		    System.out.println(data.size());
		    for(int i=0;i<data.size();i++){
			System.out.println("username + password");
			driver.findElement(By.id("userName")).sendKeys(data.get(i).get("username"));
			driver.findElement(By.id("password")).sendKeys(data.get(i).get("password"));
			driver.findElement(By.name("Login")).click();
					if(driver.getTitle().contains("Login")){
						driver.findElement(By.id("userName")).clear();
						driver.findElement(By.id("password")).clear();
					}
	}
		
	}

	@Then("verify login status")
	public void verify_login_status() {
	  System.out.println("Login");
	}

}
