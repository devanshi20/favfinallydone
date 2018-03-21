package com.example.atul_.eatit.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.atul_.eatit.Interface.ItemClickListener;
import com.example.atul_.eatit.R;

/**
 * Created by Karan Patel on 17-01-2018.
 */

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView food_name,food_price;
    public ImageView food_image,fav_image;

    public void setItemClickListener(ItemClickListener itemClickListener) {

        this.itemClickListener = itemClickListener;
    }

    private ItemClickListener itemClickListener;
    public FoodViewHolder(View itemView) {
        super(itemView);
        food_name= (TextView)itemView.findViewById(R.id.food_name);
        food_image= (ImageView)itemView.findViewById(R.id.food_image);
        fav_image= (ImageView)itemView.findViewById(R.id.fav);
        food_price=(TextView) itemView.findViewById(R.id.food_price);


        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view, getAdapterPosition(),false);

    }
}
