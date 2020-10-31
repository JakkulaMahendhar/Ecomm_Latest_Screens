package com.example.fincare_svn_latest_screens;

/**
 * Created by Administrator on 4/15/2019.
 */

public class Product {

    private int id;
    private String title;
    private String shortdesc;
    private double rating;
    private double price;
    private int image;

    public Product(int id, String title,  double price, int image) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


    public double getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }
}
