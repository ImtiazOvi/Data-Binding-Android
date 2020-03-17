package com.example.databindingadvance.eventbinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databindingadvance.R;
import com.example.databindingadvance.StudentModel;
import com.example.databindingadvance.databinding.ActivityMethodReferenceEventBindingBinding;

public class MethodReferenceEventBinding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMethodReferenceEventBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_method_reference_event_binding);
        binding.setAStudent(new StudentModel("Ovi", "26"));
        binding.setHandler(new EventHandler());

    }


    public class EventHandler {
        public void handlerClick(View view){
            Toast.makeText(MethodReferenceEventBinding.this,"Clicked",Toast.LENGTH_SHORT).show();
        }
    }
}
