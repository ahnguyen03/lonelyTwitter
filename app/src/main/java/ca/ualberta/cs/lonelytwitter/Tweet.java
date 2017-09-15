package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.List;

/**
 * Created by cuongng on 2017-09-13.
 */

public abstract class Tweet implements Tweetable {
    private List<Mood> ArrayMood;
    private String message;
    private Date date;

    public Tweet(String message, List<Mood> ArrayMood){
        date = new Date();
        this.message = message;
        this.ArrayMood = ArrayMood;
    }
    public Tweet(String message,Date date,List<Mood> ArrayMood){
        this.date = date;
        this.message = message;
        this.ArrayMood = ArrayMood;
    }
    public List<Mood> getArrayMood(){
        return ArrayMood;
    }

    public void currentmood(List<Mood> ArrayMood){
        this.ArrayMood = ArrayMood;
    }
    public String getMessage(){
        return message;
    }

    public Date getDate() {
        return date;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() < 140)
        {
            this.message = message;
        }
        else
        {
        throw new TweetTooLongException();

        }

    }
    public abstract Boolean isImportant();



}
