package com.example.facedetection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    EditText nameField,emailField,phone;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.button);
        nameField=findViewById(R.id.editText);
        emailField=findViewById(R.id.editText2);
        phone=findViewById(R.id.editTextPhone);
        final HashMap<String,String> user= new HashMap<String, String>();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number= "+91"+ phone.getText().toString();
                String name= nameField.getText().toString();
                String email=emailField.getText().toString();

                Log.d("Number",number);
                user.put("Phone no.",number);
                user.put("email",email);
                user.put("name",name);
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("phone",number);
                i.putExtra("data",user);
                startActivity(i);
            }
        });

    }
}