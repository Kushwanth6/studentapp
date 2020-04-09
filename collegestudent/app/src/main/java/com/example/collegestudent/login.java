package com.example.collegestudent;




import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity implements View.OnClickListener {
    EditText user , pass;
    Button LOGIN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        user = findViewById(R.id.usertxt);
        pass = findViewById(R.id.passtxt);
        LOGIN = findViewById(R.id.loginbtn);
        LOGIN.setOnClickListener(this);
    }


    @Override


    public void onClick(View view)
    {
        if(user.getText().toString().equalsIgnoreCase("student1") && pass.getText().toString().equals("123456"))
        {
            Intent intent = new Intent(login.class);
            startActivity(intent);
        }
        else
            Toast.makeText(getApplicationContext(),"Invalid username or password",Toast.LENGTH_LONG).show();
    }
}