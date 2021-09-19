package com.example.mvvm_example.Presentation.View;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mvvm_example.Presentation.ViewModel.AddFoodViewModel;
import com.example.mvvm_example.databinding.AddFoodFragmentBinding;

public class AddFood extends Fragment {
    private AddFoodViewModel mViewModel;
    private AddFoodFragmentBinding mBinding;
    public static AddFood newInstance() {
        return new AddFood();
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mBinding = AddFoodFragmentBinding.inflate(getLayoutInflater(), container, false);

        mBinding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    mViewModel.AddFood(
                            mBinding.partyName.getText().toString(),
                            mBinding.partyDescription.getText().toString(),
                            Double.parseDouble(mBinding.partyProteins.getText().toString()),
                            Double.parseDouble(mBinding.partyFats.getText().toString()),
                            Double.parseDouble(mBinding.partyUgli.getText().toString()),
                            Double.parseDouble(mBinding.partyProteinsPercent.getText().toString()),
                            Double.parseDouble(mBinding.partyFatsPercent.getText().toString()),
                            Double.parseDouble(mBinding.partyUgliPercent.getText().toString()),
                            Integer.parseInt(mBinding.partyCalories.getText().toString())
                    );
                    Navigation.findNavController(v).popBackStack();
                }
                catch (Exception e){
                    Toast.makeText(getContext(), "Вы ввели не все данные", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return mBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AddFoodViewModel.class);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mBinding = null;
        mViewModel = null;
    }
}