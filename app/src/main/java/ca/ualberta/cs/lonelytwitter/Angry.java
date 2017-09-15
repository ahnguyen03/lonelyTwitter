package ca.ualberta.cs.lonelytwitter;

import java.sql.Date;

/**
 * Created by cuongng on 2017-09-14.
 */

public class Angry extends Mood{

    public String WhatismyMood() {
        return "I am currently angry";
    }
    public Angry(){
        super();
    }
    public Angry(Date date){
        super(date);
    }
}
