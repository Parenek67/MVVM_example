package com.example.mvvm_example.Presentation.Repository.Room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.mvvm_example.Presentation.Repository.Model.FoodDTO;
import com.example.mvvm_example.Presentation.Repository.Room.DAO.FoodDAO;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {FoodDTO.class}, version = 1, exportSchema = false)
public abstract class FoodRoomDatabase extends RoomDatabase {//сама база данных
    public abstract FoodDAO foodDao();

    private static volatile FoodRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static FoodRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (FoodRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            FoodRoomDatabase.class, "word_database")
                            .allowMainThreadQueries()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
