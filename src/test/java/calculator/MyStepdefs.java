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
    private char operator;
    private int result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
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

    @When("^press the multiply button$")
    public void pressTheMultiplyButton() {
        calculator = new Calculator();
        result = calculator.multiply(value1, value2);
        System.out.println(result);
    }

    @When("^press the divide button$")
    public void pressTheDivideButton() {
        calculator = new Calculator();
        try {
            result = calculator.divide(value1, value2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(result);
    }

    @When("^press the power button$")
    public void pressThePowerButton() {
        calculator = new Calculator();
        result = calculator.power(value1, value2);
        System.out.println(result);
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+) and operator (.)$")
    public void twoInputValuesAndAndOperator(int arg1, int arg2, char operator){
        value1 = arg1;
        value2 = arg2;
        this.operator = operator;
    }

    @When("^I calculate$")
    public void iCalculate(){
        calculator = new Calculator();
        result = calculator.calculate(value1,value2,operator);
    }
    @Then("^I expect the result (-?\\d+|error)$")
    public void iExpectTheResult(String expectedValue) {
        if (expectedValue.equals("error")){

        }else {
            int expectedResult = Integer.parseInt(expectedValue);
            Assert.assertEquals(expectedResult, result);
        }

    }


}
