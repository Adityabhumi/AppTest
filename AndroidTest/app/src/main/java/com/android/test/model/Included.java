package com.android.test.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Included implements Parcelable {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("attributes")
    @Expose
    private Attributes attributes;
    @SerializedName("links")
    @Expose
    private Links links;
    @SerializedName("relationships")
    @Expose
    private Relationships relationships;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Relationships getRelationships() {
        return relationships;
    }

    public void setRelationships(Relationships relationships) {
        this.relationships = relationships;
    }


    protected Included(Parcel in) {
        type = in.readString();
        id = in.readString();
        attributes = (Attributes) in.readValue(Attributes.class.getClassLoader());
        links = (Links) in.readValue(Links.class.getClassLoader());
        relationships = (Relationships) in.readValue(Relationships.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(type);
        dest.writeString(id);
        dest.writeValue(attributes);
        dest.writeValue(links);
        dest.writeValue(relationships);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Included> CREATOR = new Parcelable.Creator<Included>() {
        @Override
        public Included createFromParcel(Parcel in) {
            return new Included(in);
        }

        @Override
        public Included[] newArray(int size) {
            return new Included[size];
        }
    };
}
