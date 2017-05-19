package com.example.sala01.doesangue.tiposanguineo;

/**
 * Created by sala01 on 19/05/2017.
 */

public class TipoSanguineoItem {

    String imageViewPath, text;

    public TipoSanguineoItem(String imageViewPath, String text) {
        this.imageViewPath = imageViewPath;
        this.text = text;
    }

    public String getImageViewPath() {
        return imageViewPath;
    }

    public void setImageViewPath(String imageViewId) {
        this.imageViewPath = imageViewPath;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
