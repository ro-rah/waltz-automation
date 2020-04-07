  @sanity
  Feature: Waltz automation

  Scenario: Search an Application
    Given i am on waltz home page
    When i search application "Bombay"
    Then application details should be displayed
    And view the "Attestations" associated wth it
    And view the "Bookmarks" associated wth it
    And view the "Change Initiatives" associated wth it
    And view the "Change Sets" associated wth it
    And view the "Indicators" associated wth it
    And view the "Notes" associated wth it
    And view the "Diagrams" associated wth it
    And view the "Change Initiatives" associated wth it

  Scenario: create a tag
    Given i am on waltz home page
    When i search application "Bombay"
    Then application details should be displayed
    And create a tag "Sealights"

  Scenario: remove a tag
    Given i am on waltz home page
    When i search application "Bombay"
    Then application details should be displayed
    And remove tag "Sealights"

  Scenario: create an attestation
    Given i am on waltz home page
    When i search application "Bombay"
    Then application details should be displayed
    And  attest the physical flow data

  Scenario: view logical flow of org unit
    Given i am on waltz home page
    When i want to  view logical flow for "Risk It" Organisational unit
    Then summary for logical flow should be displayed
    And view graphical representation
    And view  tabular representation


