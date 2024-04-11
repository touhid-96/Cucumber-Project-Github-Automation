Feature: Home page

  Scenario Outline: Search for a term
    Given user visits the website
    When user click on search
    And user writes "<term>" on search box
    And user click on search all of GitHub
    Then user can find the project in the result
    Examples:
      | term                       |
      | create-react-app           |
      | facebook/create-create-app |

  Scenario: Go to About page
    Given user visits the website
    When user scroll down
    And user click on About
    Then user will be redirected to about page