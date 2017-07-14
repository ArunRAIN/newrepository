
Narrative:
In order to check Functionality
As an Tester
I want to verify Global Nav application
eta:@skip
Scenario: Test case -Search Box
Given User on home page
When User click inside the search box must show the cursor
Then User checks Without entering any text in the search box hit return key Search field must flash in red and disappear
Then User text is type 'java me' in the search box options must be displayed to choose
Then User Click on the 'java me' options should navigate to 'Oracle.com Search' page