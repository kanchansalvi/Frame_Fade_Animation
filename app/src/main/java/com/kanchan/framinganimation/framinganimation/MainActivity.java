package com.kanchan.framinganimation.framinganimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable roseanimation;
    private ImageView rose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rose = (ImageView) findViewById(R.id.roseID);
        rose.setBackgroundResource(R.drawable.rose_anim);
        roseanimation = (AnimationDrawable) rose.getBackground();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        roseanimation.start();

        Handler mHandler  = new Handler();
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Animation startanimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in_anim);
   //rose.startAnimation(startanimation);
                 roseanimation.stop();
            }
        }, 3000);

        return super.onTouchEvent(event);

    }
}
