package com.example.databindingadvance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databindingadvance.databinding.ActivityBindingExpressionBinding;


public class BindingExpressionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBindingExpressionBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_binding_expression);

        binding.setTxt1("Md");
        binding.setTxt2("Imtiaz");
        binding.setTxt3("Ovi");


    }
}
