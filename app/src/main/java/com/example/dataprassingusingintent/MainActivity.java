package com.example.dataprassingusingintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.dataprassingusingintent.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);

        binding.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Second.class);
                intent.putExtra("name",binding.name.getText().toString().trim());
                intent.putExtra("email",binding.email.getText().toString().trim());
                intent.putExtra("phone",binding.phone.getText().toString().trim());
                startActivity(intent);
            }
        });
    }
}
