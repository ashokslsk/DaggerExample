package com.androidabcd.ashokslsk.daggerexcercize.application;

import android.app.Application;

import com.androidabcd.ashokslsk.daggerexcercize.application.di.ApplicationComponent;

public class DaggerApplication extends Application {

    ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
