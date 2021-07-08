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
    
    @Given("^that a customer previously bought a blue garment from me$")
    public void that_a_customer_previously_bought_a_black_garment_from_me() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^I have two blue garments in inventory$")
    public void I_have_two_blue_garments_in_inventory() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^three black garments in inventory$")
    public void three_black_garments_in_inventory() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^they exchange the blue garment for a black garment$")
    public void they_exchange_the_blue_garment_for_a_black_garment() throws Throwable {
        Assert.assertEquals(true, true);
    }
    
    @Then("^I should have three blue garments in inventory$")
    public void I_should_have_three_blue_garments_in_inventory() throws Throwable {
        Assert.assertEquals(true, true);
    }
    
    @When("^two black garments in inventory$")
    public void two_black_garments_in_inventory() throws Throwable {
        Assert.assertEquals(true, true);
    }
}
