package com.nth.nhattien.visitvnu;

import android.animation.ArgbEvaluator;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity extends AppCompatActivity {
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    List<Model> models;
    Integer [] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        models = new ArrayList<>();
        models.add(new Model(R.drawable.university,"Các trường đại học","VNU nổi tiếng với cái tên “Làng đại học”. Một khuôn viên với diện tích lớn bao gồm các trường đại học thành viên"));
        models.add(new Model(R.drawable.amthuc,"Ẩm thực","Có thực mới vực được đạo”,ngoài việc học thì việc ăn cũng đóng vai trò quan trọng. Ẩm thực nơi đây rất phong phú và đa dạng"));
        models.add(new Model(R.drawable.thucuong,"Các quán cà phê","Những quán coffee, trà sữa là những nơi tuyệt vời để sinh viên có thể học tập và chém gió với bạn bè"));
        models.add(new Model(R.drawable.chuphinh,"Địa điểm chụp hình","Phong cảnh nơi đây không khác gì chốn thiên đường. Đã đến đây rồi thì không thể rời đi nếu chưa có một tấm ảnh"));
        viewPagerAdapter = new ViewPagerAdapter(models,this);
        viewPager = (ViewPager) findViewById(R.id.Viewpager);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setPadding(50,0,50,0);

        Integer[] colors_temp = {R.color.color1,R.color.color2,R.color.color3,R.color.color4};
        colors = colors_temp;







        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {




            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }


        });



    }
}
