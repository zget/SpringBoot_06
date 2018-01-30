package com.example.demo;

public class Song {
    private long id;
    private String artist;
    private String name;
    private String album;
    private int rating;
    private int year;

    public long getId() {
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public String getAlbum() {
        return album;
    }

    public int getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
