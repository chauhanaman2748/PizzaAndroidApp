package com.example.pizza_android_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button login, signup;
    Spinner spin;

    String data[]={"Male","Female"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username= (EditText)findViewById(R.id.username);
        password= (EditText)findViewById(R.id.password);
        login= (Button) findViewById(R.id.login);
        signup= (Button) findViewById(R.id.signup);
        spin= (Spinner)findViewById(R.id.spin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,Login.class);
                startActivity(i);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,Signup.class);
                startActivity(i);
            }
        });
        ArrayAdapter adapter= new ArrayAdapter(MainActivity.this, R.layout.list,data);
        spin.setAdapter(adapter);

    }
}
