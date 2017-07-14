
Narrative:
In order to check Functionality
As an Tester
I want to verify Global Nav application
eta:@skip
Scenario: Test case -Search Autosuggest
Given User on home page
When User begins to type keyword 'ora' in search box autosuggest must suggest options
Then User start entering keyword 'jav' again and autosuggest must reappear
Then User Enters keyword 'oracle' and hit enter results must be displayed in 'Oracle.com Search' page
Then User Enters keyword 'jav' and click search icon results must be displayed in 'Oracle.com Search' page
Then User Enters keyword 'oracle' and once autosuggestion appears, click outside the search field and verify that the autosuggest retracts				 