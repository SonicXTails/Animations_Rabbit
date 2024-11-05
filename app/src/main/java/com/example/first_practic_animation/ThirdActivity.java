package com.example.first_practic_animation;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // Tween Animation
        ImageView imageView = findViewById(R.id.imageView);
        Animation tweenAnimation = AnimationUtils.loadAnimation(this, R.anim.tween_animation);
        imageView.startAnimation(tweenAnimation);

        // Появление ImageView с анимацией
        Animation imageAppear = AnimationUtils.loadAnimation(this, R.anim.image_appear);
        imageView.startAnimation(imageAppear);
    }
}
