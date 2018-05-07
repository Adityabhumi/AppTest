package com.android.test.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subscriptions implements Parcelable {

    @SerializedName("links")
    @Expose
    private Links links;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }


    protected Subscriptions(Parcel in) {
        links = (Links) in.readValue(Links.class.getClassLoader());
        if (in.readByte() == 0x01) {
            data = new ArrayList<Datum>();
            in.readList(data, Datum.class.getClassLoader());
        } else {
            data = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(links);
        if (data == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(data);
        }
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Subscriptions> CREATOR = new Parcelable.Creator<Subscriptions>() {
        @Override
        public Subscriptions createFromParcel(Parcel in) {
            return new Subscriptions(in);
        }

        @Override
        public Subscriptions[] newArray(int size) {
            return new Subscriptions[size];
        }
    };
}