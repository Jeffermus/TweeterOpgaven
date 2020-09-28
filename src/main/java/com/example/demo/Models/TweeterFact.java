package com.example.demo.Models;

import java.time.LocalDate;
import java.time.LocalTime;

    public class TweeterFact {
    private String tweetText;
    private String userName;
    private LocalDate tweetDate;
    private LocalTime tweetTime;


    public TweeterFact(String tweetText, String userName) {
        this.tweetText = tweetText;
        this.userName = userName;
        this.tweetDate = tweetDate.now();
        this.tweetTime = tweetTime.now();
    }

    public String getTweetText() {
        return tweetText;
    }

    public void setTweetText(String tweetText) {

        this.tweetText = tweetText;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDate getTweetDate() {
        return tweetDate;
    }

    public LocalTime getTweetTime(){
        return tweetTime;
        }

   @Override
    public String toString(){
      return tweetText;
    }
}


