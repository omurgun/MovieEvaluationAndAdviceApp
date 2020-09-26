package com.omurgun.movieevaluationandadviceapp.Models;

public class Slide {

    private String ImageUrl;
    private String Title;

    public Slide(String imageUrl, String title) {
        ImageUrl = imageUrl;
        Title = title;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
