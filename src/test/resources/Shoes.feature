Feature: Shoe picking
  Shoes should be removed from closets.

  Scenario: Grab a shoe
    Given closet has shoes
    And there are shoes in my closet
    When I grab a shoe
    Then I should obtain a shoe
