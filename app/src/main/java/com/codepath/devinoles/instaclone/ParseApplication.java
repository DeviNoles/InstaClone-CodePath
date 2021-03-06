package com.codepath.devinoles.instaclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        // clientKey is not needed unless explicitly configured
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("LkWhAOnQZ2HKz7Lu27bGjFIvg84ZDQYWzh3kr07m") // should correspond to APP_ID env variable
                .clientKey("9yZldF5SnSUD3zMo8YkUTYWdNNyZpO7Z5YUOUf0b")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("https://parseapi.back4app.com/").build());
    }

}
