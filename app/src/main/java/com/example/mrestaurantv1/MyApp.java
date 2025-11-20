package com.example.mrestaurantv1;

import android.app.Application;
import java.util.ArrayList;
import com.example.model.Restaurant; // Correct import

public class MyApp extends Application {
    private RestaurantViewModel viewModel;

    }
    public RestaurantViewModel getViewModel() {
        return viewModel;
    }
    public void setViewModel(RestaurantViewModel viewModel) {
        this.viewModel = viewModel;
    }
    //or using ArraList wihtout ViewModel 
        private ArrayList<Restaurant> restaurantList = new ArrayList<>();

            public ArrayList<Restaurant> getRestaurantList() {
            return restaurantList;
}
