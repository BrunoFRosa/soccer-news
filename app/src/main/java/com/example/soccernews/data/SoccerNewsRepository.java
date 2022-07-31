package com.example.soccernews.data;

import com.example.soccernews.data.remote.SoccerNewsApi;

import retrofit2.Retrofit;

public class SoccerNewsRepository {

    private static final String REMOTE_API_URL = "https://brunofrosa.github.io/-soccer-news-api/";
    private static final String LOCAL_DB_NAME = "soccer-news";

    private SoccerNewsApi remoteApi;
    private SoccerNewsDb localDb;

    public SoccerNewsApi getRemoteApi(){return remoteApi;}
    public SoccerNewsDb  getLocalDb(){ return localDb;
    }

    private class SoccerNewsDb {
    }
}
