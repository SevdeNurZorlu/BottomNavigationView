package com.sevde.bottomnavigation.models;

public class DietModel {

    int foodPicture;
    String foodName;
    String foodCalori;


    public DietModel(int foodPicture, String foodName, String foodColori) {
        this.foodPicture = foodPicture;
        this.foodName = foodName;
        this.foodCalori = foodColori;
    }


    public int getFoodPicture() {
        return foodPicture;
    }

    public void setFoodPicture(int foodPicture) {
        this.foodPicture = foodPicture;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodColori() {
        return foodCalori;
    }

    public void setFoodColori(String foodColori) {
        this.foodCalori = foodColori;
    }





}
