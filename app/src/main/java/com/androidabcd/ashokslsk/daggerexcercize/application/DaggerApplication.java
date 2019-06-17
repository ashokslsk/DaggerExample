package com.androidabcd.ashokslsk.daggerexcercize.application;

import android.app.Application;
import android.util.Log;

import com.androidabcd.ashokslsk.daggerexcercize.application.di.ApplicationComponent;
import com.androidabcd.ashokslsk.daggerexcercize.application.di.ApplicationModule;
import com.androidabcd.ashokslsk.daggerexcercize.application.di.DaggerApplicationComponent;

import javax.inject.Inject;

import retrofit2.Retrofit;

public class DaggerApplication extends Application {

    ApplicationComponent applicationComponent;

    @Inject
    Retrofit retrofit;

    @Inject
    Retrofit retrofit2;

    @Inject
    Retrofit retrofit3;


    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule())
                .build();

        applicationComponent.inject(this);

        Log.d("dagger", "message "+retrofit);
        Log.d("dagger", "message2 "+retrofit2);
        Log.d("dagger", "message3 "+retrofit3);
    }
}
