package com.example.model;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class RestaurantsListViewModel extends ViewModel {
    private final ArrayList<Restaurant> restaurantList = new ArrayList<>();

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurantList.add(restaurant);
    }

    public void clearRestaurants() {
        restaurantList.clear();
    }
}
