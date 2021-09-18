package com.example.mvvm_example.Presentation.ViewModel;

import androidx.lifecycle.ViewModel;

import com.example.mvvm_example.Presentation.Repository.Model.FoodDTO;
import com.example.mvvm_example.Presentation.Repository.Repository;

public class AddFoodViewModel extends ViewModel {
    public void AddFood(String name, String description, Double protein, Double fats, Double carbohydrates,
                         Double protein_percent, Double fats_percent, Double carbohydrates_percent, int calories) {
        FoodDTO food = new FoodDTO();
        food.setName(name);
        food.setDescription(description);
        food.setCalories(calories);
        food.setCarbohydrates(carbohydrates);
        food.setCarbohydrates_percent(carbohydrates_percent);
        food.setFats(fats);
        food.setFats_percent(fats_percent);
        food.setProtein(protein);
        food.setProtein_percent(protein_percent);
        Repository.getRepository().addFood(food);
    }
}
