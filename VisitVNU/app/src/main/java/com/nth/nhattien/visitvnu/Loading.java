package com.nth.nhattien.visitvnu;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class Loading extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 2500;

    @Override
    public void onCreate (Bundle icicle){
        super.onCreate(icicle);
        setContentView(R.layout.splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(Loading.this,FirstActivity.class);
                Loading.this.startActivity(mainIntent);
                Loading.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
