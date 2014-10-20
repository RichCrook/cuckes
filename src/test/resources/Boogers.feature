Feature: Nose picking
  Boogers should be removed from noses.

  Scenario: Pick with index finger
    Given my index finger is clean
    And there are boogers in my nose
    When I stick my finger in my nose
    Then I should obtain a booger
