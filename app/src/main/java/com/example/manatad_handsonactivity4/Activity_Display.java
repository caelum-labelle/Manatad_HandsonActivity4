package com.example.manatad_handsonactivity4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView textViewName = (TextView) findViewById(R.id.textViewName);
        TextView textViewGender = (TextView) findViewById(R.id.textViewGender);
        TextView textViewBdate = (TextView) findViewById(R.id.textViewBdate);
        TextView textViewPhoneNumber = (TextView) findViewById(R.id.textViewPhoneNumber);
        TextView textViewEmail = (TextView) findViewById(R.id.textViewEmail);
        Button ok = (Button) findViewById(R.id.btnOk);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getApplicationContext(), Activity_Registration.class);
                finish();
            }
        });
        Intent intent = getIntent();

        String name = intent.getStringExtra("name_key");
        String gender = intent.getStringExtra("gender_key");
        String bdate = intent.getStringExtra("bdate_key");
        String phoneNum = intent.getStringExtra("phoneNumber_key");
        String email = intent.getStringExtra("email_key");

        textViewName.setText("Name: " + name);
        textViewGender.setText("Gender: " + gender);
        textViewBdate.setText("Birthdate: " + bdate);
        textViewPhoneNumber.setText("Phone Number: " + phoneNum);
        textViewEmail.setText("Email Address: " + email);
    }
}