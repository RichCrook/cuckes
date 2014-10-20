package com.teamunify.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.PendingException;

public class BoogersStepdefs {
  boolean indexClean = false;
  boolean boogers = false;
  @Given("^my index finger is clean$")
    public void index_finger_is_clean() throws Throwable {
      indexClean = true;
    }

  @And("^there are boogers in my nose$")
    public void boogers_are_present() throws Throwable {
      boogers = true;
    }

  @When("^I stick my finger in my nose$")
    public void insert_finger() {
      System.out.println("Finger inserted");
    }

  @Then("^I should obtain a booger$")
    public void booger_is_obtained() {
      throw new RuntimeException("Booger did not stick");
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
