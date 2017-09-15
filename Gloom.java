package ca.ualberta.cs.lonelytwitter;

import java.sql.Date;

/**
 * Created by cuongng on 2017-09-14.
 */

public class Gloom extends Mood {

    public String WhatismyMood() {
        return "I am currently gloomy";
    }
    public Gloom(){
        super();
    }
    public Gloom(Date date){
        super(date);
    }
}
