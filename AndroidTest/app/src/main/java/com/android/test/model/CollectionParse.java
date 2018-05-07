package com.android.test.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CollectionParse implements Parcelable {

    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("included")
    @Expose
    private List<Included> included = null;

    public CollectionParse(){}

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public List<Included> getIncluded() {
        return included;
    }

    public void setIncluded(List<Included> included) {
        this.included = included;
    }


    protected CollectionParse(Parcel in) {
        data = (Data) in.readValue(Data.class.getClassLoader());
        if (in.readByte() == 0x01) {
            included = new ArrayList<Included>();
            in.readList(included, Included.class.getClassLoader());
        } else {
            included = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(data);
        if (included == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(included);
        }
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<CollectionParse> CREATOR = new Parcelable.Creator<CollectionParse>() {
        @Override
        public CollectionParse createFromParcel(Parcel in) {
            return new CollectionParse(in);
        }

        @Override
        public CollectionParse[] newArray(int size) {
            return new CollectionParse[size];
        }
    };
}