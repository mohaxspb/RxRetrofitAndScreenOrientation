package ru.kuchanov.rx;

import android.app.Application;

import ru.kuchanov.rx.retrofit.SingltonRetrofit;

public class MyApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        SingltonRetrofit.init();
    }
}