package com.omurgun.movieevaluationandadviceapp.Models.Movies;

import java.util.ArrayList;

public class Movie {

    private String title;
    private String rated;
    private String released;
    private String runtime;
    private ArrayList<Genre> genres;
    private String direction;
    private ArrayList<Actor> actors;
    private String plot;
    private String imageUrl;
    private ArrayList<Rating> ratings;
    private String imdbId;
    private String boxOffice;
    private String production;

    public Movie( ArrayList<Actor> actors) {
        this.actors = actors;

    }
    public Movie() {

    }

    public Movie(String title, String rated, String released, String runtime, ArrayList<Genre> genres, String direction, ArrayList<Actor> actors, String plot, String imageUrl, ArrayList<Rating> ratings, String imdbId, String boxOffice, String production) {
        this.title = title;
        this.rated = rated;
        this.released = released;
        this.runtime = runtime;
        this.genres = genres;
        this.direction = direction;
        this.actors = actors;
        this.plot = plot;
        this.imageUrl = imageUrl;
        this.ratings = ratings;
        this.imdbId = imdbId;
        this.boxOffice = boxOffice;
        this.production = production;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Genre> genres) {
        this.genres = genres;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ArrayList<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(ArrayList<Rating> ratings) {
        this.ratings = ratings;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(String boxOffice) {
        this.boxOffice = boxOffice;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }
}
