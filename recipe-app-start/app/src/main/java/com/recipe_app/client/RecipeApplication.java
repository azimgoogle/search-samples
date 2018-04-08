package com.recipe_app.client;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class RecipeApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseApp.initializeApp(getApplicationContext());
    }
}
