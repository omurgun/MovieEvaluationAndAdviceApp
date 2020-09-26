package com.omurgun.movieevaluationandadviceapp.Adapters;

import android.widget.ImageView;
import com.omurgun.movieevaluationandadviceapp.Models.Movies.Movie;


public interface MovieItemClickListener {
    void onMovieClick(Movie movie, ImageView movieImageView);
}
