package com.omurgun.movieevaluationandadviceapp.UI.Movie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.material.tabs.TabLayout;
import com.omurgun.movieevaluationandadviceapp.Adapters.MovieAdapter;
import com.omurgun.movieevaluationandadviceapp.Adapters.MovieItemClickListener;
import com.omurgun.movieevaluationandadviceapp.Adapters.SliderPagerAdapter;
import com.omurgun.movieevaluationandadviceapp.Data.MovieData;
import com.omurgun.movieevaluationandadviceapp.Models.Movies.Actor;
import com.omurgun.movieevaluationandadviceapp.Models.Movies.Genre;
import com.omurgun.movieevaluationandadviceapp.Models.Movies.Movie;
import com.omurgun.movieevaluationandadviceapp.Models.Movies.Rating;
import com.omurgun.movieevaluationandadviceapp.Models.Slide;
import com.omurgun.movieevaluationandadviceapp.R;
import org.json.JSONException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MovieHomeActivity extends AppCompatActivity implements MovieItemClickListener {

    private ViewPager sliderPager;
    private ArrayList<Slide> listSlides;
    private TabLayout indicator;
    private ArrayList<Movie> movieArrayList;
    private RecyclerView movieRV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        MovieData movieData = new MovieData();
        try {
            movieArrayList =movieData.GetMovieByImDbID();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        initSlider();
        initPopularMovies();

    }
    private void initSlider() {
        listSlides = new ArrayList<>();

        for (Movie movie:movieArrayList)
        {
            listSlides.add(new Slide(movie.getImageUrl(),movie.getTitle()));
        }
        SliderPagerAdapter adapter = new SliderPagerAdapter(this,listSlides);
        sliderPager.setAdapter(adapter);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MovieHomeActivity.SliderTimer(),4000,6000);
        indicator.setupWithViewPager(sliderPager,true);
    }
    private void init() {
        sliderPager = findViewById(R.id.slider_pager);
        indicator = findViewById(R.id.indicator);
        movieRV = findViewById(R.id.Rv_movies);
    }
    private void initPopularMovies() {
        MovieAdapter movieAdapter = new MovieAdapter(this, movieArrayList,this);
        movieRV.setAdapter(movieAdapter);
        movieRV.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

    }

    @Override
    public void onMovieClick(Movie movie, ImageView movieImageView) {

        ArrayList<Actor> actorArrayList = new ArrayList<>();
        for (Actor a :movie.getActors())
        {
            actorArrayList.add(a);
        }
        ArrayList<Genre> genreArrayList = new ArrayList<>();
        for (Genre g :movie.getGenres())
        {
            genreArrayList.add(g);
        }
        ArrayList<Rating> ratingArrayList = new ArrayList<>();
        for (Rating r :movie.getRatings())
        {
            ratingArrayList.add(r);
        }


        Intent intent = new Intent(this, MovieDetailActivity.class);
        intent.putExtra("title",movie.getTitle());
        intent.putExtra("actors",actorArrayList);// sorun yok!!
        intent.putExtra("boxOffice",movie.getBoxOffice());
        intent.putExtra("direction",movie.getDirection());
        intent.putExtra("genres",genreArrayList);  // sorun yok!!
        intent.putExtra("imdbId",movie.getImdbId());
        intent.putExtra("production",movie.getProduction());
        intent.putExtra("rated",movie.getRated());
        intent.putExtra("ratings",ratingArrayList);  // sorun yok!!
        intent.putExtra("released",movie.getReleased());
        intent.putExtra("runtime",movie.getRuntime());
        intent.putExtra("plot",movie.getPlot());
        intent.putExtra("imgUrl",movie.getImageUrl());


        // animation

        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MovieHomeActivity.this,movieImageView,"sharedName");
        startActivity(intent,options.toBundle());

        Toast.makeText(this,"item clicked :"+movie.getTitle(),Toast.LENGTH_SHORT).show();
    }

    class SliderTimer extends TimerTask {

        @Override
        public void run() {
            MovieHomeActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(sliderPager.getCurrentItem()<listSlides.size()-1)
                    {
                        sliderPager.setCurrentItem(sliderPager.getCurrentItem()+1);
                    }
                    else
                    {
                        sliderPager.setCurrentItem(0);
                    }
                }
            });
        }
    }

}
