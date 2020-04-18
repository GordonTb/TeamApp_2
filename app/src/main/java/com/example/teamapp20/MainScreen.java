package com.example.teamapp20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainScreen extends AppCompatActivity {

    FirebaseAuth auth;
    TextView userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        userName =  findViewById(R.id.userName);

        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        userName.setText(currentUser.getDisplayName());


    }
}
