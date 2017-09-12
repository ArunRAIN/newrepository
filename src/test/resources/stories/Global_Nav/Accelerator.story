Narrative:
In order to check Functionality
As an Tester
I want to verify Global Nav application
eta:@skip
Scenario: Test case -Accelerator
Given User on home page
When User verifies Menu bar should not Move while pageload
Then User verifies left Header contains:
| Header1|
| Logo   |
| Search |
|  Menu  |
Then User verifies right Header contains:
| Header2|
| Account|
| Country|
| Call   |
