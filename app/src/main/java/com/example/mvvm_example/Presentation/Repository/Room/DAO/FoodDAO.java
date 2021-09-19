package com.example.mvvm_example.Presentation.Repository.Room.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.mvvm_example.Presentation.Repository.Model.FoodDTO;

import java.util.List;

@Dao
public interface FoodDAO {
    @Insert
    void addFood(FoodDTO food);
    @Delete
    void deleteFood(FoodDTO food);
    @Query("SELECT * FROM food")
    LiveData<List<FoodDTO>> getAllFood();
}