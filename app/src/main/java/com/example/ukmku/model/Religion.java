package com.example.ukmku.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Religion implements Parcelable {
    private String _id, religion;

    public Religion(String _id, String religion) {
        this._id = _id;
        this.religion = religion;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public static Creator<Religion> getCREATOR() {
        return CREATOR;
    }

    protected Religion(Parcel in) {
        _id = in.readString();
        religion = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(_id);
        dest.writeString(religion);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Religion> CREATOR = new Creator<Religion>() {
        @Override
        public Religion createFromParcel(Parcel in) {
            return new Religion(in);
        }

        @Override
        public Religion[] newArray(int size) {
            return new Religion[size];
        }
    };
}
