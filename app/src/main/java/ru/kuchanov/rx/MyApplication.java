package ru.kuchanov.rx;

import android.app.Application;

import ru.kuchanov.rx.retrofit.SingletonRetrofit;

public class MyApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        SingletonRetrofit.init();
    }
}