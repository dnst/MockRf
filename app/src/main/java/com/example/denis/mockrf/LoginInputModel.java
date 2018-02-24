package com.example.denis.mockrf;

/**
 * Created by denis on 24.02.18.
 */

public class LoginInputModel {
    public int getSucess() {
        return sucess;
    }

    int sucess;

    public String getError() {
        return error;
    }

    public String getToken() {
        return token;
    }

    String error;
    String token;

}
