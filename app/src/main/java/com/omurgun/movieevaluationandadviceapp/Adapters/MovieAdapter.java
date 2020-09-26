package com.omurgun.movieevaluationandadviceapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.omurgun.movieevaluationandadviceapp.Models.Movies.Movie;
import com.omurgun.movieevaluationandadviceapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;


public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> implements MovieItemClickListener {

    private Context context;
    private List<Movie> movies;
    private MovieItemClickListener movieItemClickListener;

    public MovieAdapter(Context context, List<Movie> movies, MovieItemClickListener movieItemClickListener) {
        this.context = context;
        this.movies = movies;
        this.movieItemClickListener = movieItemClickListener;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.movie_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.movieTitle.setText(movies.get(position).getTitle());
        Picasso.get().load(movies.get(position).getImageUrl()).into(holder.movieImg);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    @Override
    public void onMovieClick(Movie movie, ImageView movieImageView) {

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView movieTitle;
        private ImageView movieImg;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            movieTitle = itemView.findViewById(R.id.movie_item_title);
            movieImg = itemView.findViewById(R.id.movie_item_img);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    movieItemClickListener.onMovieClick(movies.get(getAdapterPosition()),movieImg);
                }
            });

        }

    }


}
