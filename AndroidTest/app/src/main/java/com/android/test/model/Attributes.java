package com.android.test.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attributes implements Parcelable {

    @SerializedName("payment-type")
    @Expose
    private String paymentType;
    @SerializedName("unbilled-charges")
    @Expose
    private Object unbilledCharges;
    @SerializedName("next-billing-date")
    @Expose
    private Object nextBillingDate;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("first-name")
    @Expose
    private String firstName;
    @SerializedName("last-name")
    @Expose
    private String lastName;
    @SerializedName("date-of-birth")
    @Expose
    private String dateOfBirth;
    @SerializedName("contact-number")
    @Expose
    private String contactNumber;
    @SerializedName("email-address")
    @Expose
    private String emailAddress;
    @SerializedName("email-address-verified")
    @Expose
    private Boolean emailAddressVerified;
    @SerializedName("email-subscription-status")
    @Expose
    private Boolean emailSubscriptionStatus;

    @SerializedName("msn")
    @Expose
    private String msn;
    @SerializedName("credit")
    @Expose
    private Integer credit;
    @SerializedName("credit-expiry")
    @Expose
    private String creditExpiry;
    @SerializedName("data-usage-threshold")
    @Expose
    private Boolean dataUsageThreshold;
    @SerializedName("included-data-balance")
    @Expose
    private Integer includedDataBalance;
    @SerializedName("included-credit-balance")
    @Expose
    private Object includedCreditBalance;
    @SerializedName("included-rollover-credit-balance")
    @Expose
    private Object includedRolloverCreditBalance;
    @SerializedName("included-rollover-data-balance")
    @Expose
    private Object includedRolloverDataBalance;
    @SerializedName("included-international-talk-balance")
    @Expose
    private Object includedInternationalTalkBalance;
    @SerializedName("expiry-date")
    @Expose
    private String expiryDate;
    @SerializedName("auto-renewal")
    @Expose
    private Boolean autoRenewal;
    @SerializedName("primary-subscription")
    @Expose
    private Boolean primarySubscription;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("included-data")
    @Expose
    private Object includedData;
    @SerializedName("included-credit")
    @Expose
    private Object includedCredit;
    @SerializedName("included-international-talk")
    @Expose
    private Object includedInternationalTalk;
    @SerializedName("unlimited-text")
    @Expose
    private Boolean unlimitedText;
    @SerializedName("unlimited-talk")
    @Expose
    private Boolean unlimitedTalk;
    @SerializedName("unlimited-international-text")
    @Expose
    private Boolean unlimitedInternationalText;
    @SerializedName("unlimited-international-talk")
    @Expose
    private Boolean unlimitedInternationalTalk;
    @SerializedName("price")
    @Expose
    private Integer price;

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Object getUnbilledCharges() {
        return unbilledCharges;
    }

    public void setUnbilledCharges(Object unbilledCharges) {
        this.unbilledCharges = unbilledCharges;
    }

    public Object getNextBillingDate() {
        return nextBillingDate;
    }

    public void setNextBillingDate(Object nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Boolean getEmailAddressVerified() {
        return emailAddressVerified;
    }

    public void setEmailAddressVerified(Boolean emailAddressVerified) {
        this.emailAddressVerified = emailAddressVerified;
    }

    public Boolean getEmailSubscriptionStatus() {
        return emailSubscriptionStatus;
    }

    public void setEmailSubscriptionStatus(Boolean emailSubscriptionStatus) {
        this.emailSubscriptionStatus = emailSubscriptionStatus;
    }

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getCreditExpiry() {
        return creditExpiry;
    }

    public void setCreditExpiry(String creditExpiry) {
        this.creditExpiry = creditExpiry;
    }

    public Boolean getDataUsageThreshold() {
        return dataUsageThreshold;
    }

    public void setDataUsageThreshold(Boolean dataUsageThreshold) {
        this.dataUsageThreshold = dataUsageThreshold;
    }

    public Integer getIncludedDataBalance() {
        return includedDataBalance;
    }

    public void setIncludedDataBalance(Integer includedDataBalance) {
        this.includedDataBalance = includedDataBalance;
    }

    public Object getIncludedCreditBalance() {
        return includedCreditBalance;
    }

    public void setIncludedCreditBalance(Object includedCreditBalance) {
        this.includedCreditBalance = includedCreditBalance;
    }

    public Object getIncludedRolloverCreditBalance() {
        return includedRolloverCreditBalance;
    }

    public void setIncludedRolloverCreditBalance(Object includedRolloverCreditBalance) {
        this.includedRolloverCreditBalance = includedRolloverCreditBalance;
    }

    public Object getIncludedRolloverDataBalance() {
        return includedRolloverDataBalance;
    }

    public void setIncludedRolloverDataBalance(Object includedRolloverDataBalance) {
        this.includedRolloverDataBalance = includedRolloverDataBalance;
    }

    public Object getIncludedInternationalTalkBalance() {
        return includedInternationalTalkBalance;
    }

    public void setIncludedInternationalTalkBalance(Object includedInternationalTalkBalance) {
        this.includedInternationalTalkBalance = includedInternationalTalkBalance;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Boolean getAutoRenewal() {
        return autoRenewal;
    }

    public void setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
    }

    public Boolean getPrimarySubscription() {
        return primarySubscription;
    }

    public void setPrimarySubscription(Boolean primarySubscription) {
        this.primarySubscription = primarySubscription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getIncludedData() {
        return includedData;
    }

    public void setIncludedData(Object includedData) {
        this.includedData = includedData;
    }

    public Object getIncludedCredit() {
        return includedCredit;
    }

    public void setIncludedCredit(Object includedCredit) {
        this.includedCredit = includedCredit;
    }

    public Object getIncludedInternationalTalk() {
        return includedInternationalTalk;
    }

    public void setIncludedInternationalTalk(Object includedInternationalTalk) {
        this.includedInternationalTalk = includedInternationalTalk;
    }

    public Boolean getUnlimitedText() {
        return unlimitedText;
    }

    public void setUnlimitedText(Boolean unlimitedText) {
        this.unlimitedText = unlimitedText;
    }

    public Boolean getUnlimitedTalk() {
        return unlimitedTalk;
    }

    public void setUnlimitedTalk(Boolean unlimitedTalk) {
        this.unlimitedTalk = unlimitedTalk;
    }

    public Boolean getUnlimitedInternationalText() {
        return unlimitedInternationalText;
    }

    public void setUnlimitedInternationalText(Boolean unlimitedInternationalText) {
        this.unlimitedInternationalText = unlimitedInternationalText;
    }

    public Boolean getUnlimitedInternationalTalk() {
        return unlimitedInternationalTalk;
    }

    public void setUnlimitedInternationalTalk(Boolean unlimitedInternationalTalk) {
        this.unlimitedInternationalTalk = unlimitedInternationalTalk;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    protected Attributes(Parcel in) {
        paymentType = in.readString();
        unbilledCharges = (Object) in.readValue(Object.class.getClassLoader());
        nextBillingDate = (Object) in.readValue(Object.class.getClassLoader());
        title = in.readString();
        firstName = in.readString();
        lastName = in.readString();
        dateOfBirth = in.readString();
        contactNumber = in.readString();
        emailAddress = in.readString();
        byte emailAddressVerifiedVal = in.readByte();
        emailAddressVerified = emailAddressVerifiedVal == 0x02 ? null : emailAddressVerifiedVal != 0x00;
        byte emailSubscriptionStatusVal = in.readByte();
        emailSubscriptionStatus = emailSubscriptionStatusVal == 0x02 ? null : emailSubscriptionStatusVal != 0x00;

        msn = in.readString();
        credit = in.readByte() == 0x00 ? null : in.readInt();
        creditExpiry = in.readString();
        byte dataUsageThresholdVal = in.readByte();
        dataUsageThreshold = dataUsageThresholdVal == 0x02 ? null : dataUsageThresholdVal != 0x00;
        includedDataBalance = in.readByte() == 0x00 ? null : in.readInt();
        includedCreditBalance = (Object) in.readValue(Object.class.getClassLoader());
        includedRolloverCreditBalance = (Object) in.readValue(Object.class.getClassLoader());
        includedRolloverDataBalance = (Object) in.readValue(Object.class.getClassLoader());
        includedInternationalTalkBalance = (Object) in.readValue(Object.class.getClassLoader());
        expiryDate = in.readString();
        byte autoRenewalVal = in.readByte();
        autoRenewal = autoRenewalVal == 0x02 ? null : autoRenewalVal != 0x00;
        byte primarySubscriptionVal = in.readByte();
        primarySubscription = primarySubscriptionVal == 0x02 ? null : primarySubscriptionVal != 0x00;
        name = in.readString();
        includedData = (Object) in.readValue(Object.class.getClassLoader());
        includedCredit = (Object) in.readValue(Object.class.getClassLoader());
        includedInternationalTalk = (Object) in.readValue(Object.class.getClassLoader());
        byte unlimitedTextVal = in.readByte();
        unlimitedText = unlimitedTextVal == 0x02 ? null : unlimitedTextVal != 0x00;
        byte unlimitedTalkVal = in.readByte();
        unlimitedTalk = unlimitedTalkVal == 0x02 ? null : unlimitedTalkVal != 0x00;
        byte unlimitedInternationalTextVal = in.readByte();
        unlimitedInternationalText = unlimitedInternationalTextVal == 0x02 ? null : unlimitedInternationalTextVal != 0x00;
        byte unlimitedInternationalTalkVal = in.readByte();
        unlimitedInternationalTalk = unlimitedInternationalTalkVal == 0x02 ? null : unlimitedInternationalTalkVal != 0x00;
        price = in.readByte() == 0x00 ? null : in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(paymentType);
        dest.writeValue(unbilledCharges);
        dest.writeValue(nextBillingDate);
        dest.writeString(title);
        dest.writeString(firstName);
        dest.writeString(lastName);
        dest.writeString(dateOfBirth);
        dest.writeString(contactNumber);
        dest.writeString(emailAddress);
        if (emailAddressVerified == null) {
            dest.writeByte((byte) (0x02));
        } else {
            dest.writeByte((byte) (emailAddressVerified ? 0x01 : 0x00));
        }
        if (emailSubscriptionStatus == null) {
            dest.writeByte((byte) (0x02));
        } else {
            dest.writeByte((byte) (emailSubscriptionStatus ? 0x01 : 0x00));
        }

        if (credit == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(credit);
        }
        dest.writeString(creditExpiry);
        if (dataUsageThreshold == null) {
            dest.writeByte((byte) (0x02));
        } else {
            dest.writeByte((byte) (dataUsageThreshold ? 0x01 : 0x00));
        }
        if (includedDataBalance == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(includedDataBalance);
        }
        dest.writeValue(includedCreditBalance);
        dest.writeValue(includedRolloverCreditBalance);
        dest.writeValue(includedRolloverDataBalance);
        dest.writeValue(includedInternationalTalkBalance);
        dest.writeString(expiryDate);
        if (autoRenewal == null) {
            dest.writeByte((byte) (0x02));
        } else {
            dest.writeByte((byte) (autoRenewal ? 0x01 : 0x00));
        }
        if (primarySubscription == null) {
            dest.writeByte((byte) (0x02));
        } else {
            dest.writeByte((byte) (primarySubscription ? 0x01 : 0x00));
        }
        dest.writeString(name);
        dest.writeValue(includedData);
        dest.writeValue(includedCredit);
        dest.writeValue(includedInternationalTalk);
        if (unlimitedText == null) {
            dest.writeByte((byte) (0x02));
        } else {
            dest.writeByte((byte) (unlimitedText ? 0x01 : 0x00));
        }
        if (unlimitedTalk == null) {
            dest.writeByte((byte) (0x02));
        } else {
            dest.writeByte((byte) (unlimitedTalk ? 0x01 : 0x00));
        }
        if (unlimitedInternationalText == null) {
            dest.writeByte((byte) (0x02));
        } else {
            dest.writeByte((byte) (unlimitedInternationalText ? 0x01 : 0x00));
        }
        if (unlimitedInternationalTalk == null) {
            dest.writeByte((byte) (0x02));
        } else {
            dest.writeByte((byte) (unlimitedInternationalTalk ? 0x01 : 0x00));
        }
        if (price == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(price);
        }
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Attributes> CREATOR = new Parcelable.Creator<Attributes>() {
        @Override
        public Attributes createFromParcel(Parcel in) {
            return new Attributes(in);
        }

        @Override
        public Attributes[] newArray(int size) {
            return new Attributes[size];
        }
    };
}