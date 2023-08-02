@ParameterType("red|blue|yellow")  // regexp
  public Color color(String color){  // type, name (from method)
    return new Color(color);       // transformer function
  }
@tag
Feature: Calculator
  Scenario: Two input values, 1 and 2
  When I add two values
  Then I expect the result 3

#  Scenario: Multiplication
#    Given Two input values, 1 and 2
#    When press the multiply button
#    Then the result should be 2 on the screen
#
#  Scenario: Division
#    Given Two input values, 1 and 2
#    When press the divide button
#    Then the result should be 2 on the screen
#
#  Scenario: Exponentiation
#    Given Two input values, 1 and 2
#    When press the power button
#    Then the result should be 2 on the screen
#
#  Scenario Outline: calculator
#    Given Two input values, <first> and <second>
#    When press the <operator> button
#    Then the result should be <result> on the screen
#    Examples:
#      | first | second | operator | result |
#      | 6     | 2      | *        | 12     |
#      | 6     | 2      | /        | 3      |
#      | 6     | 2      | ^        | 36     |

