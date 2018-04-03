package com.example.android.clonechallangeudacity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.android.clonechallangeudacity.R;

public class SplashScreen extends AppCompatActivity {

        /** Called when the activity is first created. */
        @Override
        public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView imageView = findViewById(R.id.spl);
        //setting animation to the image for fading effect
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        imageView.startAnimation(animation);

        //code to disappear splash screen after 3 sec by threading
        Thread timer = new Thread(){

            @Override

            public void run() {
                try {

                    sleep(1000);
                    //after 3 sec MainActivity will  get open with the help of intent
                    Intent intent = new Intent(getApplicationContext(),ChatActivity.class);
                    startActivity(intent);

                    super.run();

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }
                finally {
                    finish();
                }

            }

        };

         timer.start(); // run() method will invoke from this statement
    }

}