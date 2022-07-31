package com.example.soccernews.doman;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class News {

    @PrimaryKey
    public int id;
    public String title;
    public String image;
    public String description;
    public String link;
    public boolean favorite;

}