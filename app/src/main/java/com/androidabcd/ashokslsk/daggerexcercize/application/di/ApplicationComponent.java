package com.androidabcd.ashokslsk.daggerexcercize.application.di;

import com.androidabcd.ashokslsk.daggerexcercize.application.DaggerApplication;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

@ApplicationScope
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DaggerApplication application);

}
