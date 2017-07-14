Narrative:
In order to check Functionality
As an Tester
I want to verify Global Nav application
eta:@skip
Scenario: Test case -Signed-In
Given User on home page
When User Signed In
Then User see the Text 'Account' must be displayed
When User Hover Over 'Account'
Then User see the panel must slide down showing two Account options 'Oracle Account' and 'Cloud Account'
Then User verify Oracle account must have options:
|option           |
|Sign Out         |
|Account          |
|Help             |
Then User verify Cloud account must have only option:
|option |
|Sign in|
Then User Click on Cloud account each links:
|Option  |Link             |appropriate page        |
|Account |Sign in          |Oracle Cloud            |
Then User Click on Oracle account each links:
|Option |Link             |appropriate page         |
|Account|Help             |About Your Oracle Account|
|Account|Account          |Update Account           |
|Account|Sign Out         |Single Sign off          |
