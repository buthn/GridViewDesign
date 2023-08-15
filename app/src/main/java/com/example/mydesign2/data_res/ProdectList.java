package com.example.mydesign2.data_res;

public class ProdectList {
    int Image;
    String Name;
    String price;

    public ProdectList(int image, String name, String price) {
        Image = image;
        Name = name;
        this.price = price;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
