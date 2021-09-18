package com.example.mvvm_example.Presentation.Repository.Mock;

import androidx.lifecycle.MutableLiveData;

import com.example.mvvm_example.Domain.Model.Food;
import com.example.mvvm_example.Presentation.Repository.RepositoryTasks;

import java.util.ArrayList;
import java.util.List;
/*MockBase это класс для работы с бд, он взаимодействует с
классами-сущностями путём добавления их в list, и с
помощью методов делает действия в бд с выбранной сущностью*/
public class MockBase implements RepositoryTasks {//
    MutableLiveData<List<Food>> data;//Используется для изменений в интерфейсе при добавлении данных в бд
    List<Food> list;

    public MutableLiveData<List<Food>> getAllFood() {
        return data;
    }//используется чтобы получить всю еду

    public MockBase() {
        list = new ArrayList<>();
        Food food1 = new Food("Гречка", "каша гречневая вареная", 11.73,
                2.71,74.95,15.6,3.2, 24.2, 346 );
        list.add(food1);
        Food food2 = new Food("Стейк из говядины", "medium rare", 19.0,
                5.0,0.0,20.65,7.46, 0.0, 123 );
        list.add(food2);

        data = new MutableLiveData<>(list);
    }

    public <T extends Food> void addFood(T food) {
        list.add(food);

        data.setValue(list);
    }

    @Override
    public <T extends Food> void deleteFood(T food) {
        list.remove(food);

        data.setValue(list);
    }
}