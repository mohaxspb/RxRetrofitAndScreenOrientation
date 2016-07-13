package ru.kuchanov.rx;

import android.app.Application;

import ru.kuchanov.rx.retrofit.RetrofitSingleton;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RetrofitSingleton.init();
    }
}