# Onboarding

This repository shows, how to add onboarding screens to your android app

For adding onboarding screen into your app, you need to follow thesesteps,

1. Create an activity with the viewpager, get started CTA button and the layout for carousel indicators.

2. Then create a layout for the viewpager item and add the needed controls based on your design. Here I just use an imageview and two textviews into the linearlayout.

3. Create the drawable's for the carousel indicators.

4. Now create and set adapter for the viewpager, for this first you need to specify the data for the onboarding screens like image source and also the texts.

5. Then add some simple and awesome slide up and down translate animation for the CTA Get Started button.

6. Hide the CTA button in all the other screens and show it into the last screen based on the page selection using the viewpager pagechangelistener.

7. Finally, add the click listener to the CTA button and execute the code.

For more information, check out my detailed guide here : http://droidmentor.com/how-to-create-onboard-screens-using-viewpager/
