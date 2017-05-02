# Onboarding

This repository shows, how to add onboarding screens to your android app

![ScreenShot](http://droidmentor.com/wp-content/uploads/2017/05/Banner_Onboard-1080x675.jpg)

For adding onboarding screen into your app, you need to follow thesesteps,

1. Create an activity with the viewpager, get started CTA button and the layout for carousel indicators.

2. Then create a layout for the viewpager item and add the needed controls based on your design. Here I just use an imageview and two textviews into the linearlayout.

3. Create the drawable's for the carousel indicators.

4. Now create and set adapter for the viewpager, for this first you need to specify the data for the onboarding screens like image source and also the texts.

<pre>
public void loadData()
{

    int[] header = {R.string.ob_header1, R.string.ob_header2, R.string.ob_header3};
    int[] desc = {R.string.ob_desc1, R.string.ob_desc2, R.string.ob_desc3};
    int[] imageId = {R.drawable.onboard_page1, R.drawable.onboard_page2, R.drawable.onboard_page3};

    for(int i=0;i!=dotscount; i++)
    {
        OnBoardItem item=new OnBoardItem();
        item.setImageID(imageId[i]);
        item.setTitle(getResources().getString(header[i]));
        item.setDescription(getResources().getString(desc[i]));

        onBoardItems.add(item);
    }
}
</pre>

5. Then add some simple and awesome slide up and down translate animation for the CTA Get Started button.

6. Hide the CTA button in all the other screens and show it into the last screen based on the page selection using the viewpager pagechangelistener.

7. Finally, add the click listener to the CTA button and execute the code.

<pre>
private Button btn_get_started;
btn_get_started = (Button) findViewById(R.id.btn_get_started);
btn_get_started.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(OnBoardingActivity.this,"Redirect to wherever you want",Toast.LENGTH_LONG).show();
    }
</pre>

For more information, check out my detailed guide here : http://droidmentor.com/create-onboard-screens-using-viewpager/
