package com.omurgun.movieevaluationandadviceapp.UI.Movie;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.omurgun.movieevaluationandadviceapp.Models.Movies.Actor;
import com.omurgun.movieevaluationandadviceapp.Models.Movies.Genre;
import com.omurgun.movieevaluationandadviceapp.Models.Movies.Movie;
import com.omurgun.movieevaluationandadviceapp.Models.Movies.Rating;
import com.omurgun.movieevaluationandadviceapp.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MovieDetailActivity extends AppCompatActivity {
    private ImageView movieThumbnailImg,movieCoverImg;
    private String imageCoverUrl;
    private Movie movie= new Movie();
    private TextView tvTitle,tvDescription;
    private FloatingActionButton play_fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        init();
    }

    private void init() {

        imageCoverUrl = getIntent().getExtras().getString("imgUrl");

        movie.setTitle(getIntent().getExtras().getString("title"));
        movie.setRated(getIntent().getExtras().getString("rated"));
        movie.setReleased(getIntent().getExtras().getString("released"));
        movie.setRuntime(getIntent().getExtras().getString("runtime"));
        movie.setGenres((ArrayList<Genre>) getIntent().getSerializableExtra("genres"));
        movie.setDirection(getIntent().getExtras().getString("direction"));
        movie.setActors((ArrayList<Actor>) getIntent().getSerializableExtra("actors"));
        movie.setPlot(getIntent().getExtras().getString("plot"));
        movie.setImageUrl(getIntent().getExtras().getString("imgUrl"));
        movie.setRatings((ArrayList<Rating>) getIntent().getSerializableExtra("ratings"));
        movie.setImdbId(getIntent().getExtras().getString("imdbId"));
        movie.setBoxOffice(getIntent().getExtras().getString("boxOffice"));
        movie.setProduction(getIntent().getExtras().getString("production"));


        play_fab = findViewById(R.id.play_fab);
        tvTitle = findViewById(R.id.movie_detail_title);
        movieThumbnailImg =findViewById(R.id.movie_detail_img);
        tvDescription = findViewById(R.id.movie_detail_desc);
        movieCoverImg = findViewById(R.id.movie_detail_cover);

        Picasso.get().load(movie.getImageUrl()).into(movieThumbnailImg);
        Glide.with(this).load(movie.getImageUrl()).into(movieThumbnailImg);
        Picasso.get().load(imageCoverUrl).into(movieCoverImg);
        Glide.with(this).load(imageCoverUrl).into(movieCoverImg);

        tvTitle.setText(movie.getTitle());
        getSupportActionBar().setTitle(movie.getTitle());
        tvDescription.setText(movie.getPlot());

        movieCoverImg.setAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_animation));
        play_fab.setAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_animation));
    }
}