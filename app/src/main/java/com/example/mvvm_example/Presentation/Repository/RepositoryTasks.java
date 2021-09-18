package com.example.mvvm_example.Presentation.Repository;

import androidx.lifecycle.LiveData;

import com.example.mvvm_example.Domain.Model.Food;

import java.util.List;

public interface RepositoryTasks {
    <T extends Food> LiveData<List<T>> getAllFood();
    <T extends Food> void addFood(T food);
    <T extends Food> void deleteFood(T food);
}
