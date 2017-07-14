
Narrative:
In order to check Functionality
As an Tester
I want to verify Global Nav application
eta:@skip
Scenario: Test case -Not Signed-In
Given User on home page
When User Not signed In
Then User see the text 'Sign In' must be displayed
When User Hover over 'Sign In'
Then User see the panel must slide down showing two account options 'Oracle Account' and 'Cloud Account'
Then User verify Oracle Account must have options:
|option           |
|Sign in          |
|Create an account|
|Help             |
Then User verify Cloud Account must have only option:
|option |
|Sign in|
Then User Click on Oracle Account each links:
|Option |Link             |appropriate page         |
|Sign In|Sign in          |Single Sign On - Login   |
|Sign In|Create an account|Create Account           |
|Account|Help             |About Your Oracle Account|
Then User Click on Cloud Account each links:
|Option  |Link             |appropriate page        |
|Sign In |Sign in          |Oracle Cloud            |

