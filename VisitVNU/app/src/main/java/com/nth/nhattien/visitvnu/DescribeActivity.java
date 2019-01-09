package com.nth.nhattien.visitvnu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DescribeActivity extends AppCompatActivity {
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


        } else if(pos0 == 1){
            if(pos1 == 0){
                textViewTitle.setText(R.string.canteeniu);
                textViewDes.setText(R.string.cantiniudes);
            }
            else if(pos1 == 1){
                textViewTitle.setText(R.string.lauca);
                textViewDes.setText(R.string.laucades);
            } else if(pos1 == 2){
                textViewTitle.setText(R.string.lauchay);
                textViewDes.setText(R.string.lauchaydes);
            } else if(pos1 == 3){
                textViewTitle.setText(R.string.ngoquyen);
                textViewDes.setText(R.string.ngoquyendes);
            } else if(pos1 == 4){
                textViewTitle.setText(R.string.comque);
                textViewDes.setText(R.string.comquedes);
            } else if(pos1 == 5){
                textViewTitle.setText(R.string.pho);
                textViewDes.setText(R.string.phodes);
            } else if(pos1 == 6){
                textViewTitle.setText(R.string.miquang);
                textViewDes.setText(R.string.miquangdes);
            } else if(pos1 == 7){
                textViewTitle.setText(R.string.binhdinhquan);
                textViewDes.setText(R.string.binhdinhquandes);
            } else if(pos1 == 8){
                textViewTitle.setText(R.string.nhahangnamnho);
                textViewDes.setText(R.string.namnhodes);
            } else if(pos1 == 9){
                textViewTitle.setText(R.string.quannhau76);
                textViewDes.setText(R.string.quannhau76des);
            }
        } if(pos0 == 2){
            if(pos1 == 0){
                textViewTitle.setText(R.string.feel);
                textViewDes.setText(R.string.feeldes);
            }
            else if(pos1 == 1){
                textViewTitle.setText(R.string.zero);
                textViewDes.setText(R.string.zerodes);
            }
            else if(pos1 == 2){
                textViewTitle.setText(R.string.bobapop);
                textViewDes.setText(R.string.bobapopdes);
            }
            else if(pos1==3){
                textViewTitle.setText(R.string.sky);
                textViewDes.setText(R.string.skydes);
            }
            else if(pos1 == 4){
                textViewTitle.setText(R.string.bonbon);
                textViewDes.setText(R.string.bonbondes);
            }
            else if(pos1 == 5){
                textViewTitle.setText(R.string.sonata);
                textViewDes.setText(R.string.sonatades);
            }
        } if(pos0 == 3) {
            if (pos1 == 0) {
                textViewTitle.setText(R.string.qs);
                textViewDes.setText(R.string.qsdes);
            } else if (pos1 == 1) {
                textViewTitle.setText(R.string.ngaba);
                textViewDes.setText(R.string.hodades);
            } else if (pos1 == 2) {
                textViewTitle.setText(R.string.congbeniu);
                textViewDes.setText(R.string.congbeniudes);
            } else if (pos1 == 3) {
                textViewTitle.setText(R.string.conduong);
                textViewDes.setText(R.string.conduongdes);
            } else if (pos1 == 4) {
                textViewTitle.setText(R.string.ktxB);
                textViewDes.setText(R.string.ktxkhuBdes);
            } else if (pos1 == 5) {
                textViewTitle.setText(R.string.meomeo);
                textViewDes.setText(R.string.meomeodes);
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
