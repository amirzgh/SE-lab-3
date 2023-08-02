package cucumber;

import cucumber.api.java.en.Given;

public class MyStepdefs {
    @Given("^Two input values and operator, (\\d+) and (\\d+) and ([*^\\/])$")
    public void twoInputValuesAdd(int arg0, int arg1, String operator){}
}
