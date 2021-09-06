package com.hienqp.listviewnangcao;

public class Fruit {
    private int fruitPhoto;
    private String fruitName;
    private String fruitDescription;

    public Fruit(int fruitPhoto, String fruitName, String fruitDescription) {
        this.fruitPhoto = fruitPhoto;
        this.fruitName = fruitName;
        this.fruitDescription = fruitDescription;
    }

    public int getFruitPhoto() {
        return fruitPhoto;
    }

    public void setFruitPhoto(int fruitPhoto) {
        this.fruitPhoto = fruitPhoto;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitDescription() {
        return fruitDescription;
    }

    public void setFruitDescription(String fruitDescription) {
        this.fruitDescription = fruitDescription;
    }
}
