package cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^Two input values and operator, (\\d+) and (\\d+) and ([*^\\/])$")
    public void twoInputValuesAdd(int arg0, int arg1, String arg2){}

    @When("^I Calculate the Two values with operator$")
    public void iAddTheTwoValues() {
    }

    @Then("^I expect the result (\\d+)$")
    public void iExpectTheResult(int arg0) {
    }
}
