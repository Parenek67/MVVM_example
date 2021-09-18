package com.example.mvvm_example.Presentation.View.Adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvm_example.Domain.Model.Food;
import com.example.mvvm_example.databinding.FoodListElementBinding;

import org.jetbrains.annotations.NotNull;

import java.util.List;

//адаптер для листа
public class FoodListAdapter extends RecyclerView.Adapter<FoodListAdapter.FoodViewHolder> {
    private List<Food> data;

    public FoodListAdapter(List<Food> data) {

        this.data = data;
    }

    @NonNull
    @NotNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        FoodListElementBinding binding = FoodListElementBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new FoodViewHolder(binding);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull @NotNull FoodViewHolder holder, int position) {
        holder.binding.partyName.setText(data.get(position).getName());
        holder.binding.partyCalories.setText(Integer.toString(data.get(position).getCalories()));
        holder.binding.partyProteins.setText(Double.toString(data.get(position).getProtein()));
        holder.binding.partyProteinsPercent.setText(Double.toString(data.get(position).getProtein_percent()));
        holder.binding.partyFats.setText(Double.toString(data.get(position).getFats()));
        holder.binding.partyFatsPercent.setText(Double.toString(data.get(position).getFats_percent()));
        holder.binding.partyUgli.setText(Double.toString(data.get(position).getCarbohydrates()));
        holder.binding.partyUgliPercent.setText(Double.toString(data.get(position).getCarbohydrates_percent()));
        holder.binding.partyDescription.setText(data.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public List<Food> getData() {
        return data;
    }

    class FoodViewHolder extends RecyclerView.ViewHolder{

        FoodListElementBinding binding;

        public FoodViewHolder(FoodListElementBinding binding) {
            super(binding.getRoot());

            this.binding = binding;
        }
    }
}
