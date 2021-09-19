
package com.example.mvvm_example.Domain.Model;

public class Food {
    public String name;
    public int calories;
    public String description;
    public Double protein;
    public Double fats;
    public Double carbohydrates;
    public Double protein_percent;
    public Double fats_percent;
    public Double carbohydrates_percent;
    public Food() {}
    public Food(String name, String description, Double protein,
                Double fats, Double carbohydrates,
                Double protein_percent, Double fats_percent,
                Double carbohydrates_percent, int calories) {
        this.name = name;
        this.carbohydrates = carbohydrates;
        this.carbohydrates_percent = carbohydrates_percent;
        this.description = description;
        this.fats = fats;
        this.fats_percent = fats_percent;
        this.protein = protein;
        this.protein_percent = protein_percent;
        this.calories = calories;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
    public void setProtein(Double protein){
        this.protein = protein;
    }
    public Double getProtein(){
        return protein;
    }
    public void setProtein_percent(Double protein_percent){
        this.protein_percent = protein_percent;
    }
    public Double getProtein_percent(){
        return protein_percent;
    }
    ///////////////////////////////
    public void setFats(Double fats){
        this.fats = fats;
    }
    public Double getFats(){
        return fats;
    }
    public void setFats_percent(Double fats_percent){
        this.fats_percent = fats_percent;
    }
    public Double getFats_percent(){
        return protein_percent;
    }
    public void setCarbohydrates(Double carbohydrates){
        this.carbohydrates = carbohydrates;
    }
    public Double getCarbohydrates(){
        return carbohydrates;
    }
    public void setCarbohydrates_percent(Double carbohydrates_percent){
        this.carbohydrates_percent = carbohydrates_percent;
    }
    public Double getCarbohydrates_percent(){
        return carbohydrates_percent;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
