package com.yavuz.landmarks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.yavuz.landmarks.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding binding;
    Animation topAnim, bottomAnim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        binding.textView6.setAnimation(topAnim);
        binding.textView7.setAnimation(topAnim);
        binding.textView2.setAnimation(bottomAnim);
        binding.textView5.setAnimation(bottomAnim);
        binding.textView4.setAnimation(bottomAnim);
        binding.button2.setAnimation(bottomAnim);

    }


    public void start(View view){


        new CountDownTimer(1000, 1000){
            @Override
            public void onTick(long l) {
                binding.textView2.animate().translationY(2000).setDuration(2000);
                binding.textView5.animate().translationY(2000).setDuration(2000);
                binding.textView4.animate().translationY(2000).setDuration(2000);
                binding.button2.animate().translationY(1400).setDuration(2000);
                binding.textView6.animate().translationY(-1600).setDuration(2000);
                binding.textView7.animate().translationY(-1600).setDuration(2000);

            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();


    }
}