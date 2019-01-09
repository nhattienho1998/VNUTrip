package com.nth.nhattien.visitvnu;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailViewPagerAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] images = null;
    private int pos;
    private Integer[] name = null;

    public DetailViewPagerAdapter(Context context, int pos, Integer[] images, Integer[] name){
        this.context = context;
        this.pos = pos;
        this.images = images;
        this.name = name;
    }


    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.view_pager_layout_detail,null);
        CardView cardView = (CardView) view.findViewById(R.id.cardViewDetail);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageViewDetail);
        TextView textViewName = (TextView) view.findViewById(R.id.textView3);
        textViewName.setText(name[position]);
        imageView.setImageResource(images[position]);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),DescribeActivity.class);
                String imgId = String.valueOf(images[position].intValue());
                intent.putExtra("image", imgId);
                intent.putExtra("pos0", pos + "");
                intent.putExtra("pos1", position + "");
                view.getContext().startActivity(intent);
            }
        });


        ViewPager vp = (ViewPager) container;
        vp.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}