package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by cuongng on 2017-09-13.
 */

public class NormalTweet extends Tweet{

    public NormalTweet(String message,ArrayList<Mood> ArrayMood) {
        super(message,ArrayMood);
    }

    public NormalTweet(String message, Date date, ArrayList<Mood>ArrayMood) {
        super(message, date,ArrayMood);
    }

    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
