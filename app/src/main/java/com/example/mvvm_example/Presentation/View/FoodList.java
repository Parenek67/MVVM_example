package com.example.mvvm_example.Presentation.View;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvvm_example.Domain.Model.Food;
import com.example.mvvm_example.Presentation.View.Adapters.FoodListAdapter;
import com.example.mvvm_example.Presentation.ViewModel.FoodListViewModel;
import com.example.mvvm_example.R;
import com.example.mvvm_example.databinding.FoodListFragmentBinding;
//import com.example.mvvm_example.databinding.FoodListFragmentBinding;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class FoodList extends Fragment {

    private FoodListViewModel mViewModel;
    private FoodListFragmentBinding mBinding;

    public static FoodList newInstance() {
        return new FoodList();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mBinding = FoodListFragmentBinding.inflate(getLayoutInflater(), container, false);

        mBinding.foodListRecycler.setLayoutManager(new LinearLayoutManager(getContext()));

        mBinding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_partyList_to_addParty);
            }
        });

        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {
            @Override
            public boolean onMove(@NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.ViewHolder viewHolder, @NonNull @NotNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull @NotNull RecyclerView.ViewHolder viewHolder, int direction) {
                int position = viewHolder.getAdapterPosition();
                mViewModel.deleteFood(((FoodListAdapter) mBinding.foodListRecycler.getAdapter()).getData().get(position));
            }
        }).attachToRecyclerView(mBinding.foodListRecycler);
        return mBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(FoodListViewModel.class);

        mViewModel.getFoodList().observe(getViewLifecycleOwner(), (List<Food> foodList) -> {
            mBinding.foodListRecycler.setAdapter(new FoodListAdapter(foodList));
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mBinding = null;
        mViewModel = null;
    }
}