Feature: Multiple Actions on RS page

  Scenario Outline: four actions on RS page
    Given user Launches RS page
    When user click on "<radioButton>" button
    And user select drop down value as  "<DropDown>"
    And user select "<CheckBox>"
    Then user click on "<HidenSeek>"
    Examples:
      | radioButton |DropDown|CheckBox|HidenSeek|
      | radio2      |Option3 |Option2 |Hide     |
      | radio3      |Option2 |Option3 |Show     |
      | radio1      |Option1 |Option1 |Hide     |

#  DropDown  | CheckBox | Button |
#  ddoption2 | option2  | hide   |