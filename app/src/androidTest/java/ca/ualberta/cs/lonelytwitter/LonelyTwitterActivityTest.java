package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.robotium.solo.Solo;
//Refactor # 1
// Remove the import juit.framework.TestCase reason is that this is a redundant import statment so its pointless to have

public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
    private Solo solo;

    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    /**
     * Runs at the begining of the tests
     * pretty much this function runs all the time whenver you run a test
      * @throws Exception
     */
    public void setUp() throws Exception{
        solo = new Solo(getInstrumentation(),getActivity());

    }


    public void testStart() throws Exception {
        Activity activity = getActivity();


    }

    public void testTweet(){
        solo.assertCurrentActivity("Wrong Activity",LonelyTwitterActivity.class);
        solo.enterText ((EditText)solo.getView(R.id.body),"Test Tweet!");
        solo.clickOnButton("Save");
        solo.enterText ((EditText)solo.getView(R.id.body),"");

        assertTrue(solo.waitForText("Test Tweet!"));

        solo.clickOnButton("Clear");

    }

    public void testClicktweetList(){
        solo.assertCurrentActivity("Wrong Activity",LonelyTwitterActivity.class);
        solo.clickOnButton("Clear");

        solo.enterText((EditText)solo.getView(R.id.body), "Test Tweet!");
        solo.clickOnButton("Save");
        solo.waitForText("Test Tweet!");

        solo.clickInList(0);
        solo.assertCurrentActivity("Wrong Activity",EditTweetActivity.class);
        assertTrue(solo.waitForText("Test Tweet!"));


    }

    /**
     * at the end of the test it will close the activity
     * @throws Exception
     */
    public void tearDown() throws Exception{
        solo.finishOpenedActivities();
    }
}