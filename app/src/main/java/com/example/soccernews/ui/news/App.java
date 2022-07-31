package com.example.soccernews.ui.news;

import android.app.Application;

public class App extends Application {

    private static App instance;

    private static App getInstance(){ return instance;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        instance = this;
    }



}
