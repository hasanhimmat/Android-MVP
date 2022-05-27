package com.legendsoftware.mvplogin.Presenter;

public interface ILoginPresenter {
    void doLogin(String email, String pass);
    void setProgressBarVisibility(int visibility);
}
