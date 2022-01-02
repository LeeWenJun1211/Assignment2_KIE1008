package com.example.donation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    private ImageView signUpLogo;
    private TextView signUpTitle, signUpEmail, signUpPassword, signUpPasswordConfirm, signInOption;
    private Button signUpButton;

    Animation topAnimation, bottomAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up);

        signUpLogo = findViewById(R.id.signUpLogo);
        signUpTitle = findViewById(R.id.signUpTitle);
        signUpEmail = findViewById(R.id.signUpEmail);
        signUpPassword = findViewById(R.id.signUpPassword);
        signUpPasswordConfirm = findViewById(R.id.signUpPasswordConfirm);
        signUpButton = findViewById(R.id.signUpButton);
        signInOption = findViewById(R.id.signInOption);

        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        signUpLogo.setAnimation(topAnimation);
        signUpTitle.setAnimation(bottomAnimation);
        signUpEmail.setAnimation(bottomAnimation);
        signUpPassword.setAnimation(bottomAnimation);
        signUpPasswordConfirm.setAnimation(bottomAnimation);
        signUpButton.setAnimation(bottomAnimation);
        signInOption.setAnimation(bottomAnimation);

        signUpButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });

        signInOption.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });
    }
}