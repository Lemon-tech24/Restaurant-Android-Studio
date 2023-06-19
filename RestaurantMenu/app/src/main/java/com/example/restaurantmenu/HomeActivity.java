package com.example.restaurantmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.denzcoskun.imageslider.constants.ScaleTypes;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        ArrayList<SlideModel> imageList = new ArrayList<>();


        imageList.add(new SlideModel(R.drawable.sushi1,  ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.sushi2,  ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.sushi3,  ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.sushi4,  ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.sushi5,  ScaleTypes.FIT));

        ImageSlider img = findViewById(R.id.slider);
        img.setImageList(imageList);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(this,MenuActivity.class);
            startActivity(intent);
        });

    }
}