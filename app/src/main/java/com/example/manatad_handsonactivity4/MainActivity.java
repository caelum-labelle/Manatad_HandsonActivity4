package com.example.manatad_handsonactivity4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "Activity 1 STARTED", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "Activity 1 RESUMED", Toast.LENGTH_SHORT).show();
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Toast.makeText(MainActivity.this, "Activity 1 is clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toast.makeText(MainActivity.this, "Activity 2 is clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, MainActivity2_Menu.class);
                startActivity(intent);
                break;
            case R.id.btn3:
                Toast.makeText(MainActivity.this, "Activity 3is clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn4:
                Toast.makeText(MainActivity.this, "Activity 4 is clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn5:
                Toast.makeText(MainActivity.this, "Activity 5 is clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn6:
                Intent intent6 = new Intent(this, Activity_SendSMSPage.class);
                startActivity(intent6);
                break;
            case R.id.btn7:
                Intent intent7 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:10.316616, 123.890011"));
                startActivity(intent7);
                break;
        }
    }
}