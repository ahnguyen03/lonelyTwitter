package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

//Refactor #2 removed the public String getMessage() and made it into String getMessage()
// reason is that its redundant to have for interface methods 
public interface Tweetable {
    String getMessage();

    Date getDate();

}
