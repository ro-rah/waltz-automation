
Feature: Waltz automation

  Scenario: Search an Application
    Given i am on waltz home page
    When i want to search application "Bombay"
    Then application details should be displayed
    And view the "Attestations" associated wth it
    And view the "Bookmarks" associated wth it
    And view the "Change Initiatives" associated wth it
    And view the "Change Sets" associated wth it
    And view the "Indicators" associated wth it
    And view the "Notes" associated wth it
    And view the "Diagrams" associated wth it
    And view the "Change Initiatives" associated wth it
  @sanity
  Scenario: create a tag
    Given i am on waltz home page
    When i want to search application "Bombay"
    Then application details should be displayed
    And create a tag "Sealights"

    Scenario: remove a tag
      Given i am on waltz home page
      When i want to search application "Bombay"
      Then application details should be displayed
      And remove tag "Sealights"