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


    Scenario: view physical flows of an application
      Given i am on waltz home page
      When i search application "Bombay"
      Then application details should be displayed
      And view the "Data Flows" associated wth it
      And view the Physical Flow Details
      And view the flows by  it "Produces"
      And view the flows by  it "Consumes"

    Scenario: View details for Equities business
      Given i am on waltz home page
      When i want to  view details  for "Equities"
      And view the "Ratings" of applications under it


    Scenario:Login to waltz with invalid credentials
      Given i want to login in waltz application
      When i enter credentials as "admin"
      And i enter password as "admin"
      And click on "OK"
      Then invalid credentials message is displayed


    Scenario: view relations for Equities
      Given i am on waltz home page
      When i want to  view details  for "Equities"
      And view the "Related Viewpoints" for it
      Then its relations details should be displayed
      And view "Function" under it
      And view "Process" under it
      And view "Product" under it
      And view "Regulation" under it

    Scenario: view technology for an application
      Given i am on waltz home page
      When i search application "Bombay"
      Then application details should be displayed
      And view the "Technology" associated wth it
      And view servers detail