package com.example.manatad_handsonactivity4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Activity_Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        EditText etFirstName = (EditText) findViewById(R.id.etFirstName);
        EditText etLastName = (EditText) findViewById(R.id.etLastName);
        EditText etBdate = (EditText) findViewById(R.id.etBdate);
        EditText etPnum = (EditText) findViewById(R.id.etNum);
        EditText etEmail = (EditText) findViewById(R.id.etEmail);
        RadioButton radMale = (RadioButton) findViewById(R.id.rb2);
        RadioButton radFemale = (RadioButton) findViewById(R.id.rb1);
        Button btnSubmit = (Button) findViewById(R.id.btnSubmit);
        Button btnClear = (Button) findViewById(R.id.btnClr);
        RadioGroup rgChoices = (RadioGroup) findViewById(R.id.rg1);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etFirstName.setText("");
                etLastName.setText("");
                etBdate.setText("");
                etPnum.setText("");
                etEmail.setText("");
                rgChoices.clearCheck();
                /*if(radFemale.isSelected()) {
                    rgChoices.clearCheck();
                }*/

            }
        });
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = etFirstName.getText().toString();
                String lname = etLastName.getText().toString();
                String name = fname.concat(" ").concat(lname);
                String gender;
                if(radMale.isSelected()) {
                    gender = "Male";
                } else {
                    gender = "Female";
                }

                String bdate = etBdate.getText().toString();
                String phoneNum = etPnum.getText().toString();
                String email = etEmail.getText().toString();


                Intent intent = new Intent(getApplicationContext(), Activity_Display.class);
                intent.putExtra("name_key", name);
                intent.putExtra("gender_key", gender);
                intent.putExtra("bdate_key", bdate);
                intent.putExtra("phoneNumber_key", phoneNum);
                intent.putExtra("email_key", email);
                startActivity(intent);
            }
        });
    }
}