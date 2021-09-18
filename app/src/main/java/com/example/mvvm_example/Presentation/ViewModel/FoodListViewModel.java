package com.example.mvvm_example.Presentation.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvm_example.Domain.Model.Food;
import com.example.mvvm_example.Presentation.Repository.Repository;

import java.util.List;

public class FoodListViewModel extends ViewModel {

    public LiveData<List<Food>> getFoodList() {
        return Repository.getRepository().getAllFood();
    }

    public void deleteFood(Food food) {
        Repository.getRepository().deleteFood(food);
    }
}
