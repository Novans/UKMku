package com.example.ukmku.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class AppPreference {
    private Context context;
    private static final String PREFERENCE_NAME = "preference_name";
    private static final String TOKEN = "token";
    private static final String USERNAME = "username";

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public AppPreference(Context context){
        this.context = context;

        sharedPreferences = context.getSharedPreferences(
                PREFERENCE_NAME, Context.MODE_PRIVATE
        );

        editor = sharedPreferences.edit();
    }

    public boolean isLoggedIn(){
        return sharedPreferences.getString(TOKEN, null) != null;
    }

    public void saveToken(String token){
        editor.putString(TOKEN, token);
        editor.apply();
    }

    public void saveUsername(String username){
        editor.putString(USERNAME, username);
        editor.apply();
    }

    public String getUSERNAME() {
        return sharedPreferences.getString(USERNAME, null);
    }

    public String getToken(){
        return sharedPreferences.getString(TOKEN, null);
    }

    public void logout(){
        editor.clear();
        editor.apply();
    }
}
