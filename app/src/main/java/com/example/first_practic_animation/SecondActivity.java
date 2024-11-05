package com.example.first_practic_animation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Устанавливаем разметку
        setContentView(R.layout.activity_second);

        // Найти ImageView и установить frame animation
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.frame_animation);  // Устанавливаем анимацию через background

        // Получаем AnimationDrawable и запускаем анимацию
        AnimationDrawable frameAnimation = (AnimationDrawable) imageView.getBackground();
        frameAnimation.start();  // Запуск анимации
    }
}
