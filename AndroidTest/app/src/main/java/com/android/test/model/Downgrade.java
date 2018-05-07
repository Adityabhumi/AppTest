package com.android.test.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Downgrade implements Parcelable {

    @SerializedName("data")
    @Expose
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    protected Downgrade(Parcel in) {
        data = (Object) in.readValue(Object.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(data);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Downgrade> CREATOR = new Parcelable.Creator<Downgrade>() {
        @Override
        public Downgrade createFromParcel(Parcel in) {
            return new Downgrade(in);
        }

        @Override
        public Downgrade[] newArray(int size) {
            return new Downgrade[size];
        }
    };
}