package com.example.donation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {

    private ImageView donationLogo;
    private TextView frontTitle;
    private Button donorButton, recipientButton;

    Animation topAnimation, bottomAnimation, buttonAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        donationLogo = findViewById(R.id.donationLogo);
        frontTitle = findViewById(R.id.frontTitle);
        donorButton = findViewById(R.id.donorButton);
        recipientButton = findViewById(R.id.recipientButton);

        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        buttonAnimation = AnimationUtils.loadAnimation(this, R.anim.button_animation);

        donationLogo.setAnimation(topAnimation);
        frontTitle.setAnimation(bottomAnimation);
        donorButton.setAnimation(buttonAnimation);
        recipientButton.setAnimation(buttonAnimation);

        int splash_screen = 4300;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, InfoDetailsActivity.class);
                startActivity(intent);
                finish();
            }
        }, splash_screen);
    }
}