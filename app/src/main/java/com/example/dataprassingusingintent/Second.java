package com.example.dataprassingusingintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.dataprassingusingintent.databinding.ActivitySecondBinding;

public class Second extends AppCompatActivity {

    ActivitySecondBinding binding;
    String s1,s2,s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(Second.this,R.layout.activity_second);

        Intent intent = getIntent();
        s1 = intent.getStringExtra("name");
        s2 = intent.getStringExtra("email");
        s3 = intent.getStringExtra("phone");
        binding.editText3.setText(s1);
        binding.editText5.setText(s2);
        binding.editText6.setText(s3);
        Log.i("Res",s1);
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Second.this,MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}
