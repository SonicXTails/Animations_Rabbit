package com.example.first_practic_animation;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Привязываем кнопки
        Button btnFrameAnimation = findViewById(R.id.btnFrameAnimation);
        Button btnTweenAnimation = findViewById(R.id.btnTweenAnimation);

        // Анимация появления для кнопок
        Animation buttonAppear = AnimationUtils.loadAnimation(this, R.anim.button_appear);
        btnFrameAnimation.startAnimation(buttonAppear);
        btnTweenAnimation.startAnimation(buttonAppear);

        // Переход на SecondActivity
        btnFrameAnimation.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); // анимация перехода
        });

        // Переход на ThirdActivity
        btnTweenAnimation.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out); // анимация перехода
        });
    }
}
