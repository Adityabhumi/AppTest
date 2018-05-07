package com.android.test.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Relationships implements Parcelable {

    @SerializedName("subscriptions")
    @Expose
    private Subscriptions subscriptions;
    @SerializedName("service")
    @Expose
    private Service service;
    @SerializedName("product")
    @Expose
    private Product product;
    @SerializedName("downgrade")
    @Expose
    private Downgrade downgrade;

    public Subscriptions getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(Subscriptions subscriptions) {
        this.subscriptions = subscriptions;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Downgrade getDowngrade() {
        return downgrade;
    }

    public void setDowngrade(Downgrade downgrade) {
        this.downgrade = downgrade;
    }


    protected Relationships(Parcel in) {
        subscriptions = (Subscriptions) in.readValue(Subscriptions.class.getClassLoader());
        service = (Service) in.readValue(Service.class.getClassLoader());
        product = (Product) in.readValue(Product.class.getClassLoader());
        downgrade = (Downgrade) in.readValue(Downgrade.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(subscriptions);
        dest.writeValue(service);
        dest.writeValue(product);
        dest.writeValue(downgrade);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Relationships> CREATOR = new Parcelable.Creator<Relationships>() {
        @Override
        public Relationships createFromParcel(Parcel in) {
            return new Relationships(in);
        }

        @Override
        public Relationships[] newArray(int size) {
            return new Relationships[size];
        }
    };
}