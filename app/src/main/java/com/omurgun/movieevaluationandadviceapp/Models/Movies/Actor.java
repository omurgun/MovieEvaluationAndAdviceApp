package com.omurgun.movieevaluationandadviceapp.Models.Movies;

import java.io.Serializable;

public class Actor  implements Serializable {
    private String name;

    public Actor() {
    }

    public Actor(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
