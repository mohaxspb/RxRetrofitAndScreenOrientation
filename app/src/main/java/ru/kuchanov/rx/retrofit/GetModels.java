package ru.kuchanov.rx.retrofit;

import java.util.ArrayList;

import retrofit2.http.GET;
import ru.kuchanov.rx.model.Model;
import rx.Observable;

public interface GetModels {
    @GET("rx-retrofit-and-android-screen-orientation.php")
    Observable<ArrayList<Model>> getModelsList();
}