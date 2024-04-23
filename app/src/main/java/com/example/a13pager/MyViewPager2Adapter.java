package com.example.a13pager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewPager2Adapter extends RecyclerView.Adapter<MyViewPager2Adapter.MyViewHolder>  {
    // Constructor of our ViewPager2Adapter class
    private MyModel[] cv_models;
    MyViewPager2Adapter(MyModel[] models) {
        this.cv_models = models;
    }

    // This method returns our layout
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single, parent, false);
        return new MyViewHolder(view);
    }

    // This method binds the screen with the view
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //// HERE
        holder.cv_city.setText(cv_models[position].mf_getCity());
        holder.cv_condImage.setImageResource(cv_models[position].getCondImageResId());  // Set image resource
        holder.cv_description.setText(cv_models[position].mf_getDescription());
        holder.constraintlayout.setBackgroundResource(cv_models[position].mf_getColor());
    }

    //@Override
    //public int getItemViewType(int position) {
    //    return cv_models[position].mf_getColor();
    //}

    // This Method returns the size of the Array
    @Override
    public int getItemCount() {
        return cv_models.length;
    }

    // The ViewHolder class holds the view
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView cv_city;
        ImageView cv_condImage;  // Change to ImageView
        TextView cv_description;
        ConstraintLayout constraintlayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cv_city = itemView.findViewById(R.id.vv_tvCity);
            cv_condImage = itemView.findViewById(R.id.vv_tvCond);
            cv_description =  itemView.findViewById(R.id.vv_descrip);

            constraintlayout = itemView.findViewById(R.id.constraintlayout);
        }
    }
}
