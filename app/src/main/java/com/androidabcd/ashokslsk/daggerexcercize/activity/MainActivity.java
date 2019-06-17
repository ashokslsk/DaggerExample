package com.androidabcd.ashokslsk.daggerexcercize.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.androidabcd.ashokslsk.daggerexcercize.R;
import com.androidabcd.ashokslsk.daggerexcercize.activity.di.ActivityComponent;
import com.androidabcd.ashokslsk.daggerexcercize.activity.di.ActivityModule;
import com.androidabcd.ashokslsk.daggerexcercize.activity.di.DaggerActivityComponent;

public class MainActivity extends AppCompatActivity {

    ActivityComponent activityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule())
                .build();
    }
}
