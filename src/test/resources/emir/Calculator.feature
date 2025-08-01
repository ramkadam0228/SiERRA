Feature: Calculator

  Scenario Outline: Arithmetic functions
    Given when <FirstNumber> and <SecondNumber>
    When <Operation> is performed
    Then Result should be <Result>
    Examples:
      | FirstNumber | SecondNumber | Operation | Result |
      | 10          | 20           | Add       | 30     |
      | 20          | 20           | Sub       | 0      |
      | 12          | 12           | Mul       | 144    |
      | 26          | 26           | Div       | 1      |
#
#
