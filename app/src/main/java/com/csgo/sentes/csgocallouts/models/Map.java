package com.csgo.sentes.csgocallouts.models;

/**
 * Created by Faßreiter on 02.02.2017.
 */

public class Map {
    private static final int NO_IMAGE = -1;
    private String Title;
    private int Image;
    private int CalloutImage;

    public int getCalloutImage() {
        return CalloutImage;
    }

    public void setCalloutImage(int calloutImage) {
        CalloutImage = calloutImage;
    }


    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public Map(String title, int image, int calloutImage) {
        Title = title;
        Image = image;
        CalloutImage = calloutImage;
    }

    public boolean hasCalloutImage() {
        if(getCalloutImage() == NO_IMAGE)
            return false;
        else return true;
    }

    public boolean hasImage() {
        if(getImage() == NO_IMAGE)
            return false;
        else return true;
    }
}
