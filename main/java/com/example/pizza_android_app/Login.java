package com.example.pizza_android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Login extends AppCompatActivity {

    ListView list2;

    String data[]={"Margreta","Chicken","Paneer","Daisy Delight","Veggiee","Onion","Capsicum","Chease Burst","Burger Pizza"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        list2=(ListView)findViewById(R.id.listview);

        ArrayAdapter adapter=new ArrayAdapter(Login.this, R.layout.list,data);
        list2.setAdapter(adapter);

    }
}
