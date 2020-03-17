package com.example.databindingadvance.eventbinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import com.example.databindingadvance.R;
import com.example.databindingadvance.StudentModel;
import com.example.databindingadvance.databinding.ActivityListenerBindingEventHandlingBinding;

public class ListenerBindingEventHandling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityListenerBindingEventHandlingBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_listener_binding_event_handling);
        binding.setAStudent(new StudentModel("Imtiaz Ovi","26"));
        binding.setHandler(new EventHandler());
    }

    public class EventHandler{
        public void handlerClick(String name){
            Toast.makeText(ListenerBindingEventHandling.this,name,Toast.LENGTH_SHORT).show();
        }

    }
}
