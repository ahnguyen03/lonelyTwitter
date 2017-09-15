package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.List;

/**
 * Created by cuongng on 2017-09-13.
 */

public class ImportantTweet extends Tweet {
    public ImportantTweet(String message, List<Mood> ArrayMood){
        super(message,ArrayMood);
    }
    public ImportantTweet(String message, Date date,List<Mood> ArrayMood){
        super(message,date,ArrayMood);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
