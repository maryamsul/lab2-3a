package com.example.mrestaurantv1;

import android.app.Application;
import java.util.ArrayList;
import com.example.model.Restaurant; // Correct import

public class MyApp extends Application {
    private ArrayList<Restaurant> restaurantList = new ArrayList<>();
    private RestaurantViewModel viewModel;

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }
    public RestaurantViewModel getViewModel() {
        return viewModel;
    }
    public void setViewModel(RestaurantViewModel viewModel) {
        this.viewModel = viewModel;
    }
}
