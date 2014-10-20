package com.teamunify.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.PendingException;

public class ShoesStepdefs {
  boolean closetClean = false;
  boolean shoes = false;
  @Given("^my index closet is clean$")
    public void closet_is_clean() throws Throwable {
      closetClean = true;
    }

  @And("^there are shoes in my closet")
    public void shoes_are_present() throws Throwable {
      shoes = true;
    }

  @When("^I grab some shoes$")
    public void grab_shoes() {
      System.out.println("GHot some shoes");
    }

  @Then("^I should obtain a shoe")
    public void shoe_is_obtained() {
      throw new RuntimeException("Was unable to grab shoe");
    }

  @Given("^we feel like it$")
    public void we_feel_like_it() throws Throwable {
      throw new PendingException();
    }

  @Given("^there are (\\d+) things to do$")
    public void there_are_things_to_do(int arg1) throws Throwable {
      throw new PendingException();
    }

  @When("^we wiggle the widget$")
    public void we_wiggle_the_widget() throws Throwable {
      throw new PendingException();
    }

  @Then("^we get arrested$")
    public void we_get_arrested() throws Throwable {
      throw new PendingException();
    }
}
