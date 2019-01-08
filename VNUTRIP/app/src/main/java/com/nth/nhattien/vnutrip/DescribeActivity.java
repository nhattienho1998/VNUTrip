package com.nth.nhattien.vnutrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DescribeActivity extends AppCompatActivity  {
    TextView textViewTitle;
    TextView textViewDes;
    ImageView imageViewBackground;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe);
        textViewTitle = (TextView)findViewById(R.id.textViewTitle);
        textViewDes = (TextView) findViewById(R.id.textViewDes);
        imageViewBackground = (ImageView)findViewById(R.id.background);
        Intent intent = getIntent();
        int a = Integer.parseInt(intent.getStringExtra("image"));
        imageViewBackground.setImageResource(a);
        int pos0 = Integer.parseInt(intent.getStringExtra("pos0"));
        int pos1 = Integer.parseInt(intent.getStringExtra("pos1"));
        if(pos0 == 0){
            if(pos1 == 0){
                textViewTitle.setText(R.string.uit);
                textViewDes.setText(R.string.uitdes);
            }
            else if(pos1 == 1){
                textViewTitle.setText(R.string.bku);
                textViewDes.setText(R.string.bkudes);
            }
            else if(pos1 == 2){
                textViewTitle.setText(R.string.us);
                textViewDes.setText(R.string.usdes);
            }
            else if(pos1==3){
                textViewTitle.setText(R.string.iu);
                textViewDes.setText(R.string.iudes);
            }
            else if(pos1 == 4){
                textViewTitle.setText(R.string.uel);
                textViewDes.setText(R.string.ueldes);
            }
            else if(pos1 == 5){
                textViewTitle.setText(R.string.ussh);
                textViewDes.setText(R.string.usshdes);
            }


        }
        Button backbutton2 = (Button)findViewById(R.id.backbutton2);
        backbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }

}
