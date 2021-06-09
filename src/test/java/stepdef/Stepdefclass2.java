package stepdef;

import cucumber.api.java.en.Given;

public class Stepdefclass2 {
	
	@Given("user navigates to login screen")
	public void user_navigates_to_login_screen() {
	    System.out.println("user navigates to login screen");
	}

	@Given("user performs login")
	public void user_performs_login() {
	   System.out.println("user performs login");
	}

	@Given("user navigates to search screen")
	public void user_navigates_to_search_screen() {
	System.out.println("user navigates to search screen");
	}

	@Given("user performs search operation")
	public void user_performs_search_operation() {
		System.out.println("user performs search operation");
	}
	@Given("user launching online shopping portal")
	public void user_launching_online_shopping_portal() {
	    System.out.println("user launching online shopping portal");
	}

}
