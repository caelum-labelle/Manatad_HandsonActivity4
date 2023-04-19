package com.example.manatad_handsonactivity4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_SendSMSPage extends AppCompatActivity {
    Button btnSend;
    EditText txtPhoneNumber;
    EditText txtMessage;
    String phoneNo;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendsmspage);

        btnSend = findViewById(R.id.btnSend);
        txtPhoneNumber = findViewById(R.id.txtPhoneNumber);
        txtMessage = findViewById(R.id.txtMessage);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phoneNo = txtPhoneNumber.getText().toString();
                message = txtMessage.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", phoneNo, null));
                intent.putExtra("sms_body", message);
                startActivity(intent);

                Toast.makeText(Activity_SendSMSPage.this, "SMS Sent", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
