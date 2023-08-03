#@ParameterType("red|blue|yellow")  // regexp
#  public Color color(String color){  // type, name (from method)
#    return new Color(color);       // transformer function
#  }

@tag
Feature: Calculator


  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add two values
    Then I expect the result 3

  Scenario: Multiplication
    Given Two input values, 1 and 2
    When press the multiply button
    Then I expect the result 2

  Scenario: Division
    Given Two input values, 4 and 2
    When press the divide button
    Then I expect the result 2

  Scenario: Exponentiation
    Given Two input values, 2 and 2
    When press the power button
    Then I expect the result 4

#  Scenario Outline: calculator
#    Given Two input values, <first> and <second>
#    When I press the <operator> button
#    Then I expect the result <result>
#    Examples:
#      | first | second | operator | result |
#      | 6     | 2      | *        | 12     |
#      | 6     | 2      | /        | 3      |
#      | 6     | 2      | ^        | 36     |

