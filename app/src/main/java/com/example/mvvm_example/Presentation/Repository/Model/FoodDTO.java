package com.example.mvvm_example.Presentation.Repository.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.mvvm_example.Domain.Model.Food;

import org.jetbrains.annotations.NotNull;

//DTO - Data Transfer Object - создает сущность в бд
@Entity(tableName = "food")//название таблицы, аннотация сущность
public class FoodDTO extends Food {
    @PrimaryKey(autoGenerate = true)//id - ПК, не нулл
    @NotNull
    @ColumnInfo//идентификация поля класса как атрибута
    public int id;
    //public String name;
    /*@ColumnInfo
    public String description;
    @ColumnInfo
    public int calories;
    @ColumnInfo
    public Double protein;
    @ColumnInfo
    public Double fats;
    @ColumnInfo
    public Double carbohydrates;
    @ColumnInfo
    public Double protein_percent;
    @ColumnInfo
    public Double fats_percent;
    @ColumnInfo
    public Double carbohydrates_percent;*/
}