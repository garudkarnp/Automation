Feature: Login TestmeApp


  Scenario Outline: Login scenario
    Given user launching TestmeApp portal
    Given user clicks on SignIn button on the page opened
    When user enters with "<username>" And enters "<password>"
    And clicks Login button
    Then user validates login status "<status>"

    Examples: 
      | username | password  | status              |
      | nisha    | password1 | valid credentials   |
      | abcd     | password2 | invalid credentials |
      | xyz      | password3 | invalid credentials |
