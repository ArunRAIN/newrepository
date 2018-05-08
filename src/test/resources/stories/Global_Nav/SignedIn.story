Narrative:
In order to check Functionality
As a Tester
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
|Sign In|
|Sign Up—Free Trial|
Then User Click on Cloud Account each links:
|Option  |Link              |appropriate page        |
|Account |Sign In           |Oracle Cloud            |
|Account |Sign Up—Free Trial|Oracle Cloud            |
Then User Clicks on oracle account each links:
|Option |Link             |appropriate page         |
|Account|Help             |About Your Oracle Account|
|Account|Account          |Update Account           |
|Account|Sign Out         |Oracle.com Search            |

