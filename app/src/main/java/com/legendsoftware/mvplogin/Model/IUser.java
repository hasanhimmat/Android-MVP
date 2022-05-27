package com.legendsoftware.mvplogin.Model;

public interface IUser {
    String getEmail();
    String getPassword();
    int checkUserValidity();
}
