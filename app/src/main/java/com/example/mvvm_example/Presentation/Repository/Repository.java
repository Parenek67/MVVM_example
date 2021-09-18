package com.example.mvvm_example.Presentation.Repository;

import android.app.Application;

import com.example.mvvm_example.Presentation.Repository.Mock.MockBase;
import com.example.mvvm_example.Presentation.Repository.Room.FoodRepository;

public class Repository {
    static RepositoryTasks repository;

    static public void init(Application application) {
        if (repository == null) {
            repository = new FoodRepository(application);
        }
    }

    static public RepositoryTasks getRepository() {
        if (repository == null) {
            repository = new MockBase();
        }
        return repository;
    }
}
