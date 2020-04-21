package com.tamagotchi.tamagotchiserverprotocol.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuthenticateInfoModel {
    @SerializedName("token")
    @Expose
    private String token;

    @SerializedName("message")
    @Expose
    private String message;

    public AuthenticateInfoModel(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public String getMessage() {
        return message;
    }
}
