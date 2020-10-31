package com.example.recipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>{
    public List<String> recipes = new ArrayList<>();
    public LayoutInflater layoutInflater;

    public RecipeAdapter(Context context, List<String> recipes) {
        this.recipes = recipes;
        this.layoutInflater = layoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecipeAdapter.RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewHolder = layoutInflater.inflate(R.layout.one_list_view, parent, false);
        return new RecipeViewHolder(viewHolder, this);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeAdapter.RecipeViewHolder holder, int position) {
        String str = recipes.get(position);
        holder.title.setText(str);
    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }

    class RecipeViewHolder extends RecyclerView.ViewHolder{
        private TextView title;
        private TextView description;
        RecipeAdapter adapter;

        public RecipeViewHolder(@NonNull View itemView, RecipeAdapter adapter) {
            super(itemView);
            this.title = itemView.findViewById(R.id.title);
            this.description = itemView.findViewById(R.id.description);
            this.adapter = adapter;
        }
    }
}
