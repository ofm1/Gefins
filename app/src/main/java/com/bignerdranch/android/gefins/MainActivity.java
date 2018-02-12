package com.bignerdranch.android.gefins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mNewUser;
    private Button mLogin;
    private EditText mUserName;
    private EditText mPsw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNewUser = (Button) findViewById(R.id.nyr_notandi);
        mLogin = (Button) findViewById(R.id.skra_inn);
        mUserName = (EditText) findViewById(R.id.user);
        mPsw = (EditText) findViewById(R.id.psw);

        mLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
    }
}
