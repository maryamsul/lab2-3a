package com.example.mrestaurantv1;

import androidx.lifecycle.ViewModel;
import com.example.model.Restaurant;
import java.util.ArrayList;

public class RestaurantViewModel extends ViewModel {
    private final ArrayList<Restaurant> restaurantList = new ArrayList<>();

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurantList.add(restaurant);
    }
}
