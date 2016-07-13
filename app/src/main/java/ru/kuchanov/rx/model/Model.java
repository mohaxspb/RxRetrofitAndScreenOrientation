package ru.kuchanov.rx.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Model implements Parcelable {
    /**
     * Parcel implementation
     */
    public static final Parcelable.Creator<Model> CREATOR = new Parcelable.Creator<Model>() {
        @Override
        public Model createFromParcel(Parcel source) {
            return new Model(source);
        }

        @Override
        public Model[] newArray(int size) {
            return new Model[size];
        }
    };

    @SerializedName("title")
    private String title;

    @SerializedName("text")
    private String text;

    /**
     * Parcel implementation
     */
    private Model(Parcel in) {
        this.title = in.readString();
        this.text = in.readString();
    }

    /**
     * Parcel implementation
     */
    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * Parcel implementation
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(text);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}