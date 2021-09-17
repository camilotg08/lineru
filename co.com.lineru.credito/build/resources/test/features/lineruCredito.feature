#Author: camilotg08@gmail.com
@stories
Feature: Credit Lineru
  As a user, I want apply for a credit in the webpage Lineru

  Background: Enter to the Lineru creditpage
    Given that I am in the credit page

  @scenario1
  Scenario: Apply a credit
    When I apply for a credit with the values
    Then I verify the successful apply in the webpage