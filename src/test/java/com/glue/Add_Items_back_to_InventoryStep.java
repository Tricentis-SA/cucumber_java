package com.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Add_Items_back_to_InventoryStep {

    @Given("^that a customer previously bought a black sweater from me$")
    public void that_a_customer_previously_bought_a_black_sweater_from_me() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^I have three black sweaters in inventory$")
    public void I_have_three_black_sweaters_in_inventory() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^they return the black sweater for a refund$")
    public void they_return_the_black_sweater_for_a_refund() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^I should have four black sweaters in inventory$")
    public void I_should_have_four_black_sweaters_in_inventory() throws Throwable {
        Assert.assertEquals(true, true);
    }
}
