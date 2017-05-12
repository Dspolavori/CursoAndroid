package com.example.sala01.aula05;

/**
 * Created by sala01 on 12/05/2017.
 */

public class Item {

    int avatarID, imgID;
    String name, local, likes;

    public Item(String name) {

        this.name = name;

    }

    public Item(int avatarID, int imgID, String name, String local, String likes) {
        this.avatarID = avatarID;
        this.imgID = imgID;
        this.name = name;
        this.local = local;
        this.likes = likes;
    }

    public int getAvatarID() {
        return avatarID;
    }

    public int getImgID() {
        return imgID;
    }

    public String getName() {
        return name;
    }

    public String getLocal() {
        return local;
    }

    public String getLikes() {
        return likes;
    }

    public void setAvatarID(int avatarID) {
        this.avatarID = avatarID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
}
