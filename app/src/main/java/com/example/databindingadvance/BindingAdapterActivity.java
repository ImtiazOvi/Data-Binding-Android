package com.example.databindingadvance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.databindingadvance.databinding.ActivityBindingAdapterBinding;
import com.example.databindingadvance.databinding.ActivityObjectBindingBinding;

import java.net.URL;

public class BindingAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBindingAdapterBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_binding_adapter);

        StudentModel studentModel = new StudentModel("Imtiaz", "26");
        studentModel.setImageUrl("https://cdn.pixabay.com/photo/2015/12/01/20/28/road-1072823_960_720.jpg");
        binding.setAStudent(studentModel);
    }

    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
                .load(url)
                .fitCenter()
                .into(imageView);
    }

}
