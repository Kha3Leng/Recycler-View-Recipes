package com.example.recipes;

import android.content.Context;
import android.content.Intent;
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
    public Hashtable<String, String> recipes = new Hashtable();
    public LayoutInflater layoutInflater;
    private Context context;

    public RecipeAdapter(Context context, Hashtable<String,String> recipes) {
        this.recipes = recipes;
        this.layoutInflater = layoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public RecipeAdapter.RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewHolder = layoutInflater.inflate(R.layout.one_list_view, parent, false);
        return new RecipeViewHolder(viewHolder, this);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeAdapter.RecipeViewHolder holder, int position) {
        switch (position){
            case 0:
                holder.title.setText(context.getString(R.string.tofu));
                holder.description.setText(context.getString(R.string.Tofu));
                return ;
            case 1:
                holder.title.setText(context.getString(R.string.Cofu));
                holder.description.setText(context.getString(R.string.cofu));
                return ;
            case 2:
                holder.title.setText(context.getString(R.string.Dofu));
                holder.description.setText(context.getString(R.string.dofu));
                return ;
            case 3:
                holder.title.setText(context.getString(R.string.eofu));
                holder.description.setText(context.getString(R.string.Eofu));
                return ;
            default:
                return ;
        }
    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }

    class RecipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView title;
        private TextView description;
        RecipeAdapter adapter;

        public RecipeViewHolder(@NonNull View itemView, RecipeAdapter adapter) {
            super(itemView);
            this.title = itemView.findViewById(R.id.title);
            this.description = itemView.findViewById(R.id.description);
            this.adapter = adapter;
            this.title.setOnClickListener(this::onClick);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context.getApplicationContext(), Instructions.class);
            context.startActivity(intent);
        }
    }
}
