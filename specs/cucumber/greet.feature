Feature: Greeting
  The index page can say hello to the user.

  Scenario: Saying hello
    Given I am on the index page
    And I type in the name "Tony"
    When I click send
    Then I should see the greeting "Hi Tony."
