Feature: Login or Registration

  Scenario: Login with valid data
    When User launch Testme App portal
    When Enter username And password
    And click OK
    Then validate login success
