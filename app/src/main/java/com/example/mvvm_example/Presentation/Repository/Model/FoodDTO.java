package com.example.mvvm_example.Presentation.Repository.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.mvvm_example.Domain.Model.Food;

import org.jetbrains.annotations.NotNull;

//DTO - Data Transfer Object - создает сущность в бд
@Entity(tableName = "food")
public class FoodDTO extends Food {
    @PrimaryKey(autoGenerate = true)
    @NotNull
    @ColumnInfo
    public int id;
}