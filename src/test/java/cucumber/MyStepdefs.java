package cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Main.Calculator calculator;
    private int value1;
    private int value2;
    private String operator;
    private int result;

    @Given("^Two input values, (\\d+) and (\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^press the multiply button$")
    public void pressTheMultiplyButton() {
        result = calculator.multiply(value1, value2);
        System.out.println(result);
    }

    @When("^press the divide button$")
    public void pressTheDivideButton() {
        result = calculator.divide(value1, value2);
        System.out.println(result);
    }

    @When("^press the power button$")
    public void pressThePowerButton() {
        result = calculator.power(value1, value2);
        System.out.println(result);
    }

    @Then("^the result should be (\\d+) on the screen$")
    public void theResultShouldBeOnTheScreen(int arg0) {
        Assert.assertEquals(arg0, result);
    }


    @When("I press the {string} button")
    public void pressTheOperatorButton(String operator) {
        switch (operator) {
            case "*":
                calculator.multiply(value1, value2);
                break;
            case "/":
                calculator.divide(value1, value2);
                break;
            case "^":
                calculator.power(value1, value2);
                break;
        }
    }

}
