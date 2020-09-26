package com.omurgun.movieevaluationandadviceapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.omurgun.movieevaluationandadviceapp.Models.Slide;
import com.omurgun.movieevaluationandadviceapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;


public class SliderPagerAdapter extends PagerAdapter {

    private Context context;
    private List<Slide> slideList;

    public SliderPagerAdapter(Context context, List<Slide> slideList) {
        this.context = context;
        this.slideList = slideList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View slideLayout = inflater.inflate(R.layout.slider_item,null);
        ImageView slideImg = slideLayout.findViewById(R.id.slide_img);
        TextView slideText = slideLayout.findViewById(R.id.slider_title);
        System.out.println("imageUrl : "+ slideList.get(position).getImageUrl());
        Picasso.get().load(slideList.get(position).getImageUrl()).into(slideImg);
        slideText.setText(slideList.get(position).getTitle());

        container.addView(slideLayout);
        return slideLayout;
    }

    @Override
    public int getCount() {
        return slideList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
