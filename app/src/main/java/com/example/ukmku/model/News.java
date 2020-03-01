package com.example.ukmku.model;

import android.os.Parcel;
import android.os.Parcelable;

import org.w3c.dom.Text;

import java.net.URL;
import java.sql.Timestamp;

public class News implements Parcelable {

    private String _id, image_path, title, bodies, url;
    private Long createdAt, updatedAt;
    private Text body;
    private Timestamp created_at, updated_at;
    private URL image_url;

    public News(String _id, String image_path, String title, Text body, Timestamp created_at, Timestamp updated_at, URL image_url) {
        this._id = _id;
        this.image_path = image_path;
        this.title = title;
        this.body = body;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.image_url = image_url;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Text getBody() {
        return body;
    }

    public void setBody(Text body) {
        this.body = body;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public URL getImage_url() {
        return image_url;
    }

    public void setImage_url(URL image_url) {
        this.image_url = image_url;
    }

    public static Creator<News> getCREATOR() {
        return CREATOR;
    }

    protected News(Parcel in) {
        _id = in.readString();
        image_path = in.readString();
        title = in.readString();
        bodies = in.readString();
        createdAt = in.readLong();
        updatedAt = in.readLong();
        url = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        bodies = body.getWholeText();
        updatedAt = updated_at.getTime();
        createdAt = created_at.getTime();
        url = image_url.toString();

        parcel.writeString(_id);
        parcel.writeString(image_path);
        parcel.writeString(title);
        parcel.writeString(bodies);
        parcel.writeString(url);
        parcel.writeLong(createdAt);
        parcel.writeLong(updatedAt);
    }

    public static final Creator<News> CREATOR = new Creator<News>() {
        @Override
        public News createFromParcel(Parcel in) {
            return new News(in);
        }

        @Override
        public News[] newArray(int size) {
            return new News[size];
        }
    };
}
