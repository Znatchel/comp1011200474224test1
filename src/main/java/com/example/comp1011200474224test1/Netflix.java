package com.example.comp1011200474224test1;

import java.util.Arrays;
import java.util.List;

public class Netflix {
    private int showId;
    private String type,title,rating,director,cast;

    public Netflix(int showId, String type, String title, String rating, String director, String cast){

        this.showId = showId;
        this.type = type;
        this.title = title;
        this.rating = rating;
        this.director = cast;

    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        if (showId>0)
            this.showId = showId;
        else
            throw new IllegalArgumentException("pizza id should be greater than 0");

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        type = type.toLowerCase().trim();  //removes any leading or trailing white spaces and makes it all lower case
        List<String> validTypes = validTypes();

        //check if the argument is one of the valid sizes
        if (validTypes.contains(type))
            this.type = type;
        else
            throw new IllegalArgumentException("valid types are: " + validTypes);



    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.length() >= 2)

            this.title = title;

        else
            throw new IllegalArgumentException("valid string size needs to be greater than 2");

    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {

        List<String> validRating = validRating();

        //check if the argument is one of the valid sizes
        if (validRating.contains(rating))
            this.rating = rating;
        else
            throw new IllegalArgumentException("valid ratings are: " + validRating);



    }

    public String getDirector() {
        return director;
    }


    public void setDirector(String director) {
        if (director.length() >= 5)

            this.director = director;

        else
            throw new IllegalArgumentException("valid string size needs to be greater than 5");

    }





    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        if (cast.length() >= 6)

            this.cast = cast;

        else
            throw new IllegalArgumentException("valid string size needs to be greater than 5");


    }

    public static List<String> validTypes()
    {
        return Arrays.asList("movie", "tv show");
    }
    public static List<String> validRating()
    {
        return Arrays.asList("PG-13", "R", "TV-14","TV-G","TV-MA","TV-Y","TV-Y7");
    }
}
