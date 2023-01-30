package com.example.deleted;

public class Settings_menu_items {
    String Name_Apps;
    int ImageView;

    public void setName_Apps(String name_Apps) {
        Name_Apps = name_Apps;
    }

    public void setImageView(int imageView) {
        ImageView = imageView;
    }

    public Settings_menu_items(String name_Apps, int imageView) {
        Name_Apps = name_Apps;
        ImageView = imageView;
    }

    public String getName_Apps() {
        return Name_Apps;
    }

    public int getImageView() {
        return ImageView;
    }
}
