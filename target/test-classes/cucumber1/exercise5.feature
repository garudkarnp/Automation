Feature: Login

@Nisha
  Scenario: Test Login
    Given user launching login screen
    When user enter with credentials
    	| username | password |
      | saranya | password1 |
   	  | mercury | password1 |
    Then verify login status
