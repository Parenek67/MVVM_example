
package com.example.mvvm_example.Domain.Model;

public class Food {//класс-сущность, необходим для заполнения списка
    public String name_;
    public int calories_;
    public String description_;
    public Double protein_;
    public Double fats_;
    public Double carbohydrates_;
    public Double protein_percent_;
    public Double fats_percent_;
    public Double carbohydrates_percent_;
    public Food() {}
    public Food(String name, String description, Double protein, Double fats, Double carbohydrates,
                Double protein_percent, Double fats_percent, Double carbohydrates_percent, int calories) {
        this.name_ = name;
        this.carbohydrates_ = carbohydrates;
        this.carbohydrates_percent_ = carbohydrates_percent;
        this.description_ = description;
        this.fats_ = fats;
        this.fats_percent_ = fats_percent;
        this.protein_ = protein;
        this.protein_percent_ = protein_percent;
        this.calories_ = calories;
    }
    public void setName(String name){
        this.name_ = name;
    }
    public String getName(){
        return name_;
    }
    public void setDescription(String description){
        this.description_ = description;
    }
    public String getDescription(){
        return description_;
    }
    ////////////////////////////////
    public void setProtein(Double protein){
        this.protein_ = protein;
    }
    public Double getProtein(){
        return protein_;
    }
    public void setProtein_percent(Double protein_percent){
        this.protein_percent_ = protein_percent;
    }
    public Double getProtein_percent(){
        return protein_percent_;
    }
    ///////////////////////////////
    public void setFats(Double fats){
        this.fats_ = fats;
    }
    public Double getFats(){
        return fats_;
    }
    public void setFats_percent(Double fats_percent){
        this.fats_percent_ = fats_percent;
    }
    public Double getFats_percent(){
        return protein_percent_;
    }
    ///////////////////////////
    public void setCarbohydrates(Double carbohydrates){
        this.carbohydrates_ = carbohydrates;
    }
    public Double getCarbohydrates(){
        return carbohydrates_;
    }
    public void setCarbohydrates_percent(Double carbohydrates_percent){
        this.carbohydrates_percent_ = carbohydrates_percent;
    }
    public Double getCarbohydrates_percent(){
        return carbohydrates_percent_;
    }

    public int getCalories() {
        return calories_;
    }

    public void setCalories(int calories) {
        this.calories_ = calories;
    }
}
