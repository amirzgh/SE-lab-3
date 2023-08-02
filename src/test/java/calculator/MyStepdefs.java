package calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Before;

public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private String operator;
    private int result;

    @Before
    public void before(){
        calculator = new Calculator();
    }
    @Given("^Two input values, (\\d+) and (\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I add two values$")
    public void iAddTwoValues() {
        calculator = new Calculator();
        result = calculator.add(value1, value2);
        System.out.print(result);
    }

    @Then("^I expect the result (\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }

//    @When("^I add two values$")
//    public void iAddTwoValues() {
//    }

//    @When("^press the multiply button$")
//    public void pressTheMultiplyButton() {
//        result = calculator.multiply(value1, value2);
//        System.out.println(result);
//    }
//
//    @When("^press the divide button$")
//    public void pressTheDivideButton() {
//        result = calculator.divide(value1, value2);
//        System.out.println(result);
//    }
//
//    @When("^press the power button$")
//    public void pressThePowerButton() {
//        result = calculator.power(value1, value2);
//        System.out.println(result);
//    }
//
//    @Then("^the result should be (\\d+) on the screen$")
//    public void theResultShouldBeOnTheScreen(int arg0) {
//        Assert.assertEquals(arg0, result);
//    }
//
//
//    @When("I press the {string} button")
//    public void pressTheOperatorButton(String operator) {
//        switch (operator) {
//            case "*":
//                calculator.multiply(value1, value2);
//                break;
//            case "/":
//                calculator.divide(value1, value2);
//                break;
//            case "^":
//                calculator.power(value1, value2);
//                break;
//        }
//    }

}
