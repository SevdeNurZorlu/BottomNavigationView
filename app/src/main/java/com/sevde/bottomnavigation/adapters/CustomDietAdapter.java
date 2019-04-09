package com.sevde.bottomnavigation.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sevde.bottomnavigation.R;
import com.sevde.bottomnavigation.models.DietModel;

import java.util.List;

public class CustomDietAdapter extends BaseAdapter {

    LayoutInflater layoutInflater;
    List<DietModel>dietList; //dietLİsti consturoctor yaptık generate>constructor

    public CustomDietAdapter(LayoutInflater layoutInflater, List<DietModel> dietList) {
        this.layoutInflater = layoutInflater;
        this.dietList = dietList;
    }



    @Override
    public int getCount() {
        return dietList.size();
    }

    @Override
    public Object getItem(int position) {
        return dietList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View dietView=layoutInflater.inflate(R.layout.custom_diet_line,null);
        ImageView foodPicture=(ImageView) dietView.findViewById(R.id.food_picture);
        TextView foodName=(TextView)dietView.findViewById(R.id.food_name);
        TextView foodCalori=(TextView)dietView.findViewById(R.id.food_calori);

        DietModel diet=dietList.get(position);
        foodPicture.setImageResource(diet.getFoodPicture());
        foodName.setText(diet.getFoodName());
        foodCalori.setText(diet.getFoodColori());

        return dietView;
    }
}
