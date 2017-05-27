package com.example.olamide.movieapplication.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Olamide on 5/22/17.
 */
public class TrailerResponse {

    @SerializedName("id")
    private int id_trailer;
    @SerializedName("results")
    private List<Trailer> results;

    public int getIdTrailer(){
        return id_trailer;
    }

    public void seIdTrailer(int id_trailer){
        this.id_trailer = id_trailer;
    }

    public List<Trailer> getResults(){
        return results;
    }
}
