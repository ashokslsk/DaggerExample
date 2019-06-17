package com.androidabcd.ashokslsk.daggerexcercize.application.di;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ApplicationModule {

    @ApplicationScope
    @Provides
    Retrofit getRetrofit(GsonConverterFactory factory){
        return new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(factory)
                .build();
    }

    @Provides
    GsonConverterFactory gsonConverterFactory(Gson gsonObj){
        return GsonConverterFactory.create(gsonObj);
    }

    @Provides
    Gson gson(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.create();
    }
}
