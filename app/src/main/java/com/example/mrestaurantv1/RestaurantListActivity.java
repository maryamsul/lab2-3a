package com.example.mrestaurantv1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.graphics.Insets;

import com.example.model.Restaurant;

public class RestaurantListActivity extends AppCompatActivity {

    private ListView listViewRestaurants; // Declare ListView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_restaurant_list);

        // Find the ListView in your layout
        listViewRestaurants = findViewById(R.id.listViewRestaurants);

        // Optional Edge-to-Edge setup
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Get shared restaurant list from MyApp
        MyApp app = (MyApp) getApplicationContext();
        RestaurantViewModel viewModel = app.getViewModel();

        // Create adapter and set it to ListView
        ArrayAdapter<Restaurant> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, app.getRestaurantList());
        listViewRestaurants.setAdapter(adapter);
    }
}
