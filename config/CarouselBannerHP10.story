Narrative:
In order to view stories
As a user
I want to view slides auto rotating
Meta:@skip
Scenario: Carousel Banner - Stories auto rotate
Given User on home page
When Story slide is in view
Then corresponding place dot turn red in color


Scenario: Carousel Banner - Navigate through stories using nav arrows
Given User on home page
When User clicks on the left nav arrows
Then slide navigates to previous story
When User clicks on the right nav arrows
Then slide navigates to next story

Scenario: Carousel Banner - View each story slide
Given User on home page
When User see the '3' slide
Then User verify all 3 slide links are navigate to appropriate page:
|CTA Button|Appropriate page    |
|CTA 1   |Oracle OpenWorld 2017 |
|CTA 2   |JavaOne Conference    |
|CTA 3   |Oracle Cloud          |
|CTA 4   |Oracle Code 2017      |

Scenario: Carousel Banner - Nav arrows - Hover over state
Given User on home page
When User hovers over left nav arrows
Then the background of the arrow must turn gray
Then User hovers over right nav arrows also
Then the background of the arrow must turn gray

