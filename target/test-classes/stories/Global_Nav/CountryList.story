Narrative:
Display Countries list for corresponding regions

eta:@skip 
Scenario: Show regions and its countries
Given User on home page
When User Hover over on 'Country' text 
Then panel must show Regions in the 1st panel and their countries in the 2nd panel 2 column countries list must be displayed 
Then Depending upon which country the page belongs to,  pin must appear against it