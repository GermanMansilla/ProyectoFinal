package com.example.proyectofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText user, pass;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText)findViewById(R.id.text_user);
        pass = (EditText)findViewById(R.id.text_password);
        tv1 = (TextView)findViewById(R.id.tv1);

    }

    public void ingresar(View view){
        String u = user.getText().toString();
        String p = pass.getText().toString();

        if (!u.isEmpty()){
            tv1.setText(u);
        }


    }
}