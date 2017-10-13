package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by root on 10/11/17.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){

    };

    public void add(Tweet tweet){
       if(tweet.contains(tweet))
       {
           throw new IllegalArgumentException("tweet is already in the list ");
       }
       else {
           tweets.add(tweet);
       }

    }

    public boolean hasTweet(Tweet tweet){

        int what_index = tweets.indexOf(tweet);

        if(what_index == -1){
            return  false;
        }
        else{
            if(tweets.get(what_index).equals(tweet)){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public Tweet getTweet(int i){
        return tweets.get(i);
    }

    public int getCount(){
        return tweets.size();
    }

    public ArrayList<Tweet> getlist(){
        Comparator <Tweet> compTweet = new Comparator<Tweet>(){
            public int compare(Tweet tweet_1 , Tweet tweet_2){
                if(tweet_1.getDate().hashCode() < tweet_2.getDate().hashCode()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        Collections.sort(tweets,compTweet);
        return  tweets;
    }
}
