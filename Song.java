package com.gorynalexander.myplayer;

/**
 * Created by Odinn on 08.09.2016.
 */
public class Song {
    private String author;
    private String songName;
    private String songTime;

    public Song(String author, String songName, String songTime) {
        this.author = author;
        this.songName = songName;
        this.songTime = songTime;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongTime() {
        return songTime;
    }

    public void setSongTime(String songTime) {
        this.songTime = songTime;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
