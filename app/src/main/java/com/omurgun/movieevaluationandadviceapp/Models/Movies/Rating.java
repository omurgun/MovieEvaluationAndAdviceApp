package com.omurgun.movieevaluationandadviceapp.Models.Movies;

import java.io.Serializable;

public class Rating implements Serializable {
    private String source;
    private String value;

    public Rating() {
    }

    public Rating(String source, String value) {
        this.source = source;
        this.value = value;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
