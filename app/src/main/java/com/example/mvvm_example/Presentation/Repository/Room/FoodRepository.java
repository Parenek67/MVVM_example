package com.example.mvvm_example.Presentation.Repository.Room;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.mvvm_example.Domain.Model.Food;
import com.example.mvvm_example.Presentation.Repository.Model.FoodDTO;
import com.example.mvvm_example.Presentation.Repository.RepositoryTasks;
import com.example.mvvm_example.Presentation.Repository.Room.DAO.FoodDAO;

import java.util.List;

public class FoodRepository implements RepositoryTasks {
    private FoodDAO mFoodDao;
    private LiveData<List<FoodDTO>> mAllFood = new MutableLiveData<>();

    public FoodRepository(Application application) {
        FoodRoomDatabase db = FoodRoomDatabase.getDatabase(application);
        mFoodDao = db.foodDao();
        mAllFood = mFoodDao.getAllFood();
    }

    public LiveData<List<FoodDTO>> getAllFood() {
        return mAllFood;
    }

    @Override
    public <T extends Food> void addFood(T food) {
        FoodRoomDatabase.databaseWriteExecutor.execute(() -> {
            mFoodDao.addFood(((FoodDTO) food));
        });
    }

    @Override
    public <T extends Food> void deleteFood(T food) {
        FoodRoomDatabase.databaseWriteExecutor.execute(() -> {
            mFoodDao.deleteFood(((FoodDTO) food));
        });
    }
}
