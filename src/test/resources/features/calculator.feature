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

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add two values
    Then I expect the result <result>
    Examples:
      | first | second | result |
      | 1     | 12     | 13     |
      | -1    | 6      | 5      |
      | 2     | 2      | 4      |
