Feature: This feature file would be creating a calculator for Addition and subtraction

  Scenario: Check Add of two values
    Given user open calculator
    When user add 5 and 2
    Then user should get the result as 7

  Scenario: Check Subtraction of two values
    Given user open calculator
    When user sub 5 and 2
    Then user should get the result as 3

  Scenario Outline: Check Add of two values using scenario outline
    Given user open calculator
    When user add <number_1> and <number_2>
    Then user should get the result as <result>

    Examples: 
      | number_1 | number_2 | result |
      |        5 |        7 |     12 |

  Scenario: Add variables using cucumber data table
    Given user open calculator
    When user add below variables
      | 10 |
      | 20 |
      | 30 |
      | 40 |
    Then user should get the result as 100

  Scenario: Add variables using list collections
    Given user open calculator
    When user add list of numbers
      | 10 |
      | 20 |
      | 30 |
      | 40 |
      | 50 |
    Then user should get the result as 150

  Scenario: Check the total bill of lunch
    Given user open calculator
    When user order below items
      | coffee   |  5 |
      | Lemonade | 10 |
    Then user should get the result as 15

  Scenario: Check the total bill of quantity
    Given user open calculator
    When user order list of quantity
      | coffee   | 1 | 6 |
      | muffin   | 2 | 3 |
      | sandwich | 1 | 7 |
    Then user should get the result as 19
