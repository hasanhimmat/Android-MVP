package com.legendsoftware.mvplogin.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.legendsoftware.mvplogin.R;

public class MainActivity extends AppCompatActivity implements ILoginView{

    public EditText email;
    public EditText password;
    public ProgressBar progress;
    public Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.ui_email);
        password = findViewById(R.id.ui_password);
        progress = findViewById(R.id.ui_progress);
        login = findViewById(R.id.ui_login);




    }

    // Custom Method
    @Override
    public void onLoginSuccess(String msg) {

    }

    @Override
    public void onLoginError(String msg) {

    }

    @Override
    public void onSetProgressBarVisibility(int visibility) {

    }
}