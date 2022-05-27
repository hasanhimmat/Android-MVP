package com.legendsoftware.mvplogin.Presenter;

import com.legendsoftware.mvplogin.Model.IUser;
import com.legendsoftware.mvplogin.Model.UserImpl;
import com.legendsoftware.mvplogin.View.ILoginView;

public class LoginPresenterImpl implements ILoginPresenter {

    public ILoginView loginView;

    public LoginPresenterImpl(ILoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void doLogin(String email, String pass) {

        IUser user = new UserImpl(email, pass);
        int login_code = user.checkUserValidity();

        if (login_code == 0) {
            loginView.onLoginError("Please Enter Your Email");
        } else if (login_code == 1) {
            loginView.onLoginError("Please Enter a Valid Email");
        } else if (login_code == 2) {
            loginView.onLoginError("Please Enter Your Password");
        } else if (login_code == 3) {
            loginView.onLoginError("Please Enter a Password that should be more than 6 charter");
        } else {
            loginView.onLoginSuccess("Login Success");
        }
    }

    @Override
    public void setProgressBarVisibility(int visibility) {
        loginView.onSetProgressBarVisibility(visibility);
    }
}
