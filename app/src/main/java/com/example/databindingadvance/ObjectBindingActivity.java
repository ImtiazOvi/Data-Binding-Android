package com.example.databindingadvance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databindingadvance.databinding.ActivityObjectBindingBinding;

public class ObjectBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityObjectBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_object_binding);
        binding.setAStudent(new StudentModel("Imtiaz", "26"));
    }
}
